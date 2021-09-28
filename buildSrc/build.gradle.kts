plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven("https://maven.minecraftforge.net")
}

dependencies {
    implementation("net.minecraftforge.gradle", "ForgeGradle", version = "5.1.+")
}