apply {
    from("$rootDir/compose-module.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.coreUi))
    "implementation"(project(Modules.trackerDomain))

    "implementation"(Glide.glideCompose)
    "kapt"(Glide.glideCompiler)
    "implementation"(Glide.glideLandscapistCompose)
}