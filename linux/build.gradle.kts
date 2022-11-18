plugins {
    kotlin("jvm") version "1.7.20"
}

val lwjglVersion = ext.get("lwjglVersion")

dependencies {
    testImplementation(kotlin("test"))
    implementation(project(":common"))
    implementation("org.lwjgl:lwjgl:$lwjglVersion:natives-linux")
    implementation("org.lwjgl:lwjgl-glfw:$lwjglVersion:natives-linux")
    implementation("org.lwjgl:lwjgl-opengl:$lwjglVersion:natives-linux")
    implementation("org.lwjgl:lwjgl-stb:$lwjglVersion:natives-linux")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
