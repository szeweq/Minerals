plugins {
    `forge-compat`
}

val versionMC = "1.17.1"
val versionForge = "1.17.1-37.0.72"

java.toolchain.languageVersion.set(JavaLanguageVersion.of(16))

minecraft {
    println("CONFIGURING MC 1.17")
    mappings("official", versionMC)
    runs {
        create("client") {
            workingDirectory(project.file("run"))
            property("forge.logging.markers", "REGISTRIES")
            property("forge.logging.console.level", "debug")
            mods {
                create("minerals") {
                    source(sourceSets["main"])
                }
            }
        }
    }
}

dependencies {
    "minecraft" ("net.minecraftforge:forge:$versionForge")
}