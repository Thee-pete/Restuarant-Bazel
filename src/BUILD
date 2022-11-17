load("@rules_jvm_external//:defs.bzl", "artifact")
load("@rules_android//android:rules.bzl", "android_binary")

android_library(
    name = "my_lib",
    srcs = glob(["main/java/com/pete/restaurant/*.java"]),
    custom_package = "com.pete.restaurant",
    manifest = "main/AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    visibility = ["//src/test:__subpackages__"],
    deps = [
            artifact("androidx.lifecycle:lifecycle-runtime"),
            artifact("androidx.lifecycle:lifecycle-viewmodel"),
            artifact("androidx.lifecycle:lifecycle-common"),
            artifact("androidx.appcompat:appcompat"),
            artifact("androidx.annotation:annotation"),
            artifact("com.google.android.material:material") ,
            artifact("androidx.room:room-runtime"),
            artifact("androidx.room:room-compiler"),
            artifact("androidx.room:room-testing"),
            "@maven//:androidx_sqlite_sqlite",
    ],
)
android_binary(
    name = "app",
    custom_package = "com.pete.restaurant",
    manifest = "main/AndroidManifest.xml",
    deps = [":my_lib"],
)



