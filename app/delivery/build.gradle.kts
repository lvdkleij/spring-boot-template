plugins {
    alias(libs.plugins.detekt) apply true
}

dependencies {
    implementation(libs.springBootStarterWeb)

    testImplementation(libs.springBootStarterTest)
}
