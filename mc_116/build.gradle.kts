plugins {
    `forge-compat`
}

val versionMC = "1.16.5"
val versionForge = "1.16.5-36.2.6"

java.toolchain.languageVersion.set(JavaLanguageVersion.of(8))

minecraft {
    println("CONFIGURING MC 1.16")
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
