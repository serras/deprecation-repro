buildscript {
    repositories {
        mavenCentral()
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap")
    }
}

repositories {
    mavenCentral()
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap")
}

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.20-dev-6963"
    `java-library`
}

dependencies {

}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
