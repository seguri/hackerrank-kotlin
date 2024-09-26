plugins {
  kotlin("jvm") version "2.0.10"
  id("com.diffplug.spotless") version "7.0.0.BETA2"
}

group = "name.seguri.kotlin"

version = "1.0-SNAPSHOT"

repositories { mavenCentral() }

dependencies {
  testImplementation(kotlin("test"))
  testImplementation("org.assertj:assertj-core:3.26.3")
  testImplementation("org.mockito:mockito-core:5.13.0")
}

tasks.test { useJUnitPlatform() }

kotlin { jvmToolchain(21) }

spotless {
  java { googleJavaFormat().reorderImports(true).formatJavadoc(true) }
  kotlin {
    target("**/*.kt", "**/*.kts")
    // version, style and all configurations here are optional
    ktfmt("0.52").googleStyle().configure {
      it.setRemoveUnusedImports(true)
      it.setManageTrailingCommas(true)
    }
  }
}
