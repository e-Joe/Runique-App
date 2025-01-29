plugins {
    alias(libs.plugins.runique.android.library)
}

android {
    namespace = "com.ejoe.run.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
    implementation(projects.run.domain)
}