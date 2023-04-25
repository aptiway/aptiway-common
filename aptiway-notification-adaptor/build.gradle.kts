plugins {
    id("aptiway.kotlin")
}

dependencies {
    api(project(":aptiway-notification"))
    implementation ("javax.mail:javax.mail-api:1.6.2")
    implementation ("com.sun.mail:javax.mail:1.6.2")
}