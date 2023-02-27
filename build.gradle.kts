plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version(root.gradleVersion).apply(false)
    id("com.android.library").version(root.gradleVersion).apply(false)
    kotlin("android").version(primary.kotlinVersion).apply(false)
    kotlin("multiplatform").version(primary.kotlinVersion).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
