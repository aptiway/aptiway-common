import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java")
    id("kotlin")
    kotlin("jvm")
}

val JVM_TARGET = "11"
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

group = "com.aptiway"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
	gradlePluginPortal()
}

dependencies {
    // ---{ kotlin }---
    // ========================================================================

    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    // ---{ junit }---
    // ========================================================================

    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // ---{ mockito }---
    // ========================================================================

    testImplementation(platform("org.mockito:mockito-bom:5.3.0"))
    testImplementation("org.mockito:mockito-core")
    testImplementation("org.mockito:mockito-junit-jupiter")
    testImplementation("org.mockito.kotlin:mockito-kotlin:4.1.0")

    // ---{ assertj }---
    // ========================================================================

    testImplementation("org.assertj:assertj-core:3.24.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = JVM_TARGET
    }
}

tasks.test {
    useJUnitPlatform()
}
