plugins {
    kotlin("jvm") version libs.versions.kotlin apply false
    java
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.jetbrains.kotlin.jvm")

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