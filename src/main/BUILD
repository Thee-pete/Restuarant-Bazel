#load("@rules_jvm_external//:defs.bzl", "artifact")

android_library(
    name = "my_lib",
    srcs = glob(["java/com/pete/restaurant/*.java"]),
    custom_package = "com.pete.restaurant",
    manifest = "java/AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    visibility = ["//src/test:__subpackages__"],
    deps = [
            "@maven//:androidx.appcompat:appcompat",
            "@maven//:androidx.annotation:annotation",
            "@maven//:androidx.test.ext:junit",
            "@maven//:org.robolectric:robolectric",
            "@maven//:org.assertj:assertj-core",
            "@maven//:androidx.room:room-runtime",
            "@maven//:androidx.room:room-compiler",
            "@maven//:androidx.room:room-testing",
             "@maven//:androidx.lifecycle:lifecycle-viewmodel",
             "@maven//:androidx.lifecycle:lifecycle-livedata",
             "@maven//:androidx.lifecycle:lifecycle-common-java8",
             "@maven//:com.google.android.material:material",
    ],
)
android_binary(
    name = "app",
    custom_package = "com.example.android.persistence",
    manifest = "java/AndroidManifest.xml",
    multidex = "native",
    deps = [":my_lib"],
)
java_plugin(
    name = "androidx_lifecycle_lifecycle_compiler_plugin",
    processor_class = "androidx.lifecycle.LifecycleProcessor",
    deps = [
        "@maven//:androidx_lifecycle_lifecycle_compiler",
    ],
)

java_library(
    name = "androidx_lifecycle_lifecycle_compiler_library",
    exported_plugins = [
        ":androidx_lifecycle_lifecycle_compiler_plugin",
    ],
    neverlink = True,
    exports = [
        "@maven//:androidx_lifecycle_lifecycle_compiler",
        "@maven//:androidx_lifecycle_lifecycle_extensions",
        "@maven//:androidx_lifecycle_lifecycle_runtime",
        "@maven//:androidx_lifecycle_lifecycle_viewmodel",
    ],
)

java_plugin(
    name = "androidx_room_room_compiler_plugin",
    processor_class = "androidx.room.RoomProcessor",
    deps = [
        "@maven//:androidx_room_room_compiler",
    ],
)
java_library(
    name = "androidx_room_room_compiler_library",
    exported_plugins = [
        ":androidx_room_room_compiler_plugin",
    ],
    neverlink = True,
    exports = [
        "@maven//:androidx_room_room_common",
        "@maven//:androidx_room_room_compiler",
        "@maven//:androidx_room_room_runtime",
        "@maven//:androidx_room_room_rxjava2",
    ],
)



