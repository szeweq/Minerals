buildscript {
    repositories {
        maven("https://maven.minecraftforge.net")
        mavenCentral()
    }
    dependencies {
        classpath("net.minecraftforge.gradle", "ForgeGradle", version = "5.1.+") {
            isChanging = true
        }
    }
}

allprojects {
    group = "szeweq.minerals"
}

println("Java: " + System.getProperty("java.version") + " JVM: " + System.getProperty("java.vm.version") + '(' + System.getProperty("java.vendor") + ") Arch: " + System.getProperty("os.arch"))
/* minecraft {
    // accessTransformer = file('src/main/resources/META-INF/accesstransformer.cfg')

    runs {
        client {
            workingDirectory project.file('run')
            property 'forge.logging.markers', 'REGISTRIES'

            // Recommended logging level for the console
            // You can set various levels here.
            // Please read: https://stackoverflow.com/questions/2031163/when-to-use-the-different-log-levels
            property 'forge.logging.console.level', 'debug'

            mods {
                examplemod {
                    source sourceSets.main
                }
            }
        }

        server {
            workingDirectory project.file('run')

            // Recommended logging data for a userdev environment
            // The markers can be changed as needed.
            // "SCAN": For mods scan.
            // "REGISTRIES": For firing of registry events.
            // "REGISTRYDUMP": For getting the contents of all registries.
            property 'forge.logging.markers', 'REGISTRIES'

            // Recommended logging level for the console
            // You can set various levels here.
            // Please read: https://stackoverflow.com/questions/2031163/when-to-use-the-different-log-levels
            property 'forge.logging.console.level', 'debug'

            mods {
                examplemod {
                    source sourceSets.main
                }
            }
        }
    }
} */

/* dependencies {
    // Specify the version of Minecraft to use, If this is any group other then 'net.minecraft' it is assumed
    // that the dep is a ForgeGradle 'patcher' dependency. And it's patches will be applied.
    // The userdev artifact is a special name and will get all sorts of transformations applied to it.
    minecraft 'net.minecraftforge:forge:1.16.5-36.2.6'

    // You may put jars on which you depend on in ./libs or you may define them like so..
    // compile "some.group:artifact:version:classifier"
    // compile "some.group:artifact:version"

    // Real examples
    // compile 'com.mod-buildcraft:buildcraft:6.0.8:dev'  // adds buildcraft to the dev env
    // compile 'com.googlecode.efficient-java-matrix-library:ejml:0.24' // adds ejml to the dev env

    // The 'provided' configuration is for optional dependencies that exist at compile-time but might not at runtime.
    // provided 'com.mod-buildcraft:buildcraft:6.0.8:dev'

    // These dependencies get remapped to your current MCP mappings
    // deobf 'com.mod-buildcraft:buildcraft:6.0.8:dev'

    // For more info...
    // http://www.gradle.org/docs/current/userguide/artifact_dependencies_tutorial.html
    // http://www.gradle.org/docs/current/userguide/dependency_management.html

} */

// Example for how to get properties into the manifest for reading by the runtime..
/* jar {
    manifest {
        attributes([
            "Specification-Title": "examplemod",
            "Specification-Vendor": "examplemodsareus",
            "Specification-Version": "1", // We are version 1 of ourselves
            "Implementation-Title": project.name,
            "Implementation-Version": "${version}",
            "Implementation-Vendor" :"examplemodsareus",
            "Implementation-Timestamp": new Date().format("yyyy-MM-dd'T'HH:mm:ssZ")
        ])
    }
} */

// Example configuration to allow publishing using the maven-publish task
// This is the preferred method to reobfuscate your jar file
//jar.finalizedBy('reobfJar')
// However if you are in a multi-project build, dev time needs unobfed jar files, so you can delay the obfuscation until publishing by doing
//publish.dependsOn('reobfJar')
/*
publishing {
    publications {
        mavenJava(MavenPublication) {
            artifact jar
        }
    }
    repositories {
        maven {
            url "file:///${project.projectDir}/mcmodsrepo"
        }
    }
} */
