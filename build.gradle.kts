import java.net.URI
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
  kotlin("jvm") version "2.3.0"
  id("com.diffplug.spotless") version "8.1.0"
  id("org.jetbrains.dokka") version "2.1.0"
}

group = "name.seguri.kotlin"

version = "1.0-SNAPSHOT"

repositories { mavenCentral() }

dependencies {
  testImplementation(kotlin("test"))
  testImplementation("org.junit.jupiter:junit-jupiter-api:6.0.1")
  testImplementation("org.assertj:assertj-core:3.27.6")
  testImplementation("org.mockito:mockito-core:5.21.0")
}

tasks.withType<Test> { useJUnitPlatform() }

java { toolchain { languageVersion = JavaLanguageVersion.of(21) } }

kotlin { jvmToolchain(21) }

spotless {
  java { googleJavaFormat("1.33.0").reorderImports(true).formatJavadoc(true) }
  kotlin { ktfmt("0.60").googleStyle().configure { it.setRemoveUnusedImports(true) } }
  kotlinGradle { ktfmt("0.60") }
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
            URI("https://github.com/seguri/hackerrank-kotlin/tree/main/src/main/java").toURL()
        )
        remoteLineSuffix.set("#L")
      }

      // Configure Kotlin source set
      sourceRoots.from(file("src/main/kotlin"))
      sourceLink {
        localDirectory.set(file("src/main/kotlin"))
        remoteUrl.set(
            URI("https://github.com/seguri/hackerrank-kotlin/tree/main/src/main/kotlin").toURL()
        )
        remoteLineSuffix.set("#L")
      }
    }
  }
}
