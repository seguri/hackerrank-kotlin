import java.net.URI
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
  kotlin("jvm") version "2.1.10"
  id("com.diffplug.spotless") version "7.0.2"
  id("org.jetbrains.dokka") version "2.0.0"
}

group = "name.seguri.kotlin"

version = "1.0-SNAPSHOT"

repositories { mavenCentral() }

dependencies {
  testImplementation(kotlin("test"))
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.12.0")
  testImplementation("org.assertj:assertj-core:3.27.3")
  testImplementation("org.mockito:mockito-core:5.16.0")
}

tasks.withType<Test> { useJUnitPlatform() }

java { toolchain { languageVersion = JavaLanguageVersion.of(21) } }

kotlin { jvmToolchain(21) }

spotless {
  java { googleJavaFormat().reorderImports(true).formatJavadoc(true) }
  kotlin { ktfmt("0.54").googleStyle().configure { it.setRemoveUnusedImports(true) } }
  kotlinGradle { ktfmt("0.54") }
}

tasks.withType<DokkaTask>().configureEach {
  dokkaSourceSets {
    configureEach {
      skipEmptyPackages.set(true)

      // Configure Java source set
      sourceRoots.from(file("src/main/java"))
      sourceLink {
        localDirectory.set(file("src/main/java"))
        remoteUrl.set(
            URI("https://github.com/seguri/hackerrank-kotlin/tree/main/src/main/java").toURL())
        remoteLineSuffix.set("#L")
      }

      // Configure Kotlin source set
      sourceRoots.from(file("src/main/kotlin"))
      sourceLink {
        localDirectory.set(file("src/main/kotlin"))
        remoteUrl.set(
            URI("https://github.com/seguri/hackerrank-kotlin/tree/main/src/main/kotlin").toURL())
        remoteLineSuffix.set("#L")
      }
    }
  }
}
