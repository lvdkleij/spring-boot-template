plugins {
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.spotless)
    java
}

allprojects {
    apply(plugin = rootProject.libs.plugins.spotless.get().pluginId)

    spotless {
        ratchetFrom("origin/main")

        kotlin {
            target("**/*.kt")
            ktlint()
        }

        kotlinGradle {
            target("**/*.gradle.kts")

            ktlint()
        }
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = rootProject.libs.plugins.kotlinJvm.get().pluginId)

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation(rootProject.libs.kotestAssertionsCore)
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }
}
