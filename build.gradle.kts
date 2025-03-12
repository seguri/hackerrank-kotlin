plugins {
  kotlin("jvm") version "2.1.10"
  id("com.diffplug.spotless") version "7.0.2"
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
