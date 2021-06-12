plugins {
	kotlin("jvm")
	id("application")
}

application {
	mainClassName = "org.jellyfin.sample.console.MainKt"
}

repositories {
	mavenCentral()

	// Repository needed for kotlinx-cli
	maven("https://kotlin.bintray.com/kotlinx")
}

dependencies {
	// Depend on the library project
	implementationProject(":library")

	// Use Kotlin stdlib
	implementationKotlinStdlib()

	// Use Kotlin coroutines to interact with the library
	implementation(Dependencies.KotlinX.coroutinesCore)

	// The CLI library
	implementation(Dependencies.KotlinX.cli)

	// Use JSON
	implementation(Dependencies.gson)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
	kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlinx.cli.ExperimentalCli"
}
