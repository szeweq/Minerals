import net.minecraftforge.gradle.userdev.UserDevExtension

plugins {
    java
}

apply(plugin = "net.minecraftforge.gradle")

fun Project.minecraft(conf: UserDevExtension.() -> Unit) = configure(conf)
