plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}
android {
    namespace = "com.htmltoapk.blood"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.htmltoapk.blood"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
dependencies {
    implementation(platform("com.google.firebase:firebase-bom:35.0.2"))
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-firestore")
    implementation("com.google.firebase:firebase-messaging")
    implementation("androidx.appcompat:appcompat:1.7.0")
}
