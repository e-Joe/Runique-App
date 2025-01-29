plugins {
    alias(libs.plugins.runique.android.library)
}

android {
    namespace = "com.ejoe.run.network"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}