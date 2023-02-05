// For `KotlinCompile` task below
//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
plugins {
    kotlin("jvm")  version "1.8.10" // Kotlin version to use
    application // Application plugin. Also see 1️⃣ below the code
}
group = "cassia.hahn.kotlin"
version = "1.0-SNAPSHOT"
repositories { // Sources of dependencies. See 2️⃣
    mavenCentral() // Maven Central Repository. See 3️⃣
}
dependencies {
    testImplementation(kotlin("test"))
}
dependencies { // All the libraries you want to use. See 4️⃣
    // Copy dependencies' names after you find them in a repository
    testImplementation(kotlin("test")) // The Kotlin test library
}
tasks.test { // See 5️⃣
    useJUnitPlatform() // JUnitPlatform for tests. See 6️⃣
}
kotlin { // Extension for easy setup
    jvmToolchain(8) // Target version of generated JVM bytecode. See 7️⃣
}
application {
    mainClass.set("MainKt")
}