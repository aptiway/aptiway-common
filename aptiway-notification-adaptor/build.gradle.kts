plugins {
    id("aptiway.kotlin")
}

dependencies {
    api(project(":aptiway-notification"))
    implementation ("javax.mail:javax.mail-api:1.6.2")
    implementation ("com.sun.mail:javax.mail:1.6.2")
    implementation ("org.slf4j:slf4j-log4j12:1.7.29")
}