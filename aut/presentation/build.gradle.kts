plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.ejoe.aut.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.aut.domain)
}