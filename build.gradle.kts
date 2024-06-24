plugins {
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.spotless)
    java
}

allprojects {
    apply(plugin = rootProject.libs.plugins.spotless.get().pluginId)

    repositories {
        mavenCentral()
    }

    spotless {
        ratchetFrom("origin/main")

        kotlin {
            ktlint()
        }

        kotlinGradle {
            ktlint()
        }
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = rootProject.libs.plugins.kotlinJvm.get().pluginId)

    dependencies {
        testImplementation(rootProject.libs.kotestAssertionsCore)
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }
}
