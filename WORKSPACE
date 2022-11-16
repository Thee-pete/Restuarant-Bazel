load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
android_sdk_repository(
    name = "androidsdk",
    api_level = 30,
)

RULES_JVM_EXTERNAL_TAG = "4.2"
RULES_JVM_EXTERNAL_SHA = "cd1a77b7b02e8e008439ca76fd34f5b07aecb8c752961f9640dea15e9e5ba1ca"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)
load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()



http_archive(
    name = "robolectric",
    sha256 = "7655c49633ec85a18b5a94b1ec36e250671808e45494194959b1d1d7f3e73a23",
    strip_prefix = "robolectric-bazel-4.9",
    urls = ["https://github.com/robolectric/robolectric-bazel/archive/4.9.tar.gz"],
)

load("@robolectric//bazel:robolectric.bzl", "robolectric_repositories")

robolectric_repositories()


load("@rules_jvm_external//:defs.bzl", "maven_install")



maven_install(
    name = "maven",
    artifacts = [
        "androidx.appcompat:appcompat:1.0.2",
        "androidx.annotation:annotation:1.1.0",
        "androidx.test.ext:junit:1.1.0",
        "org.robolectric:robolectric:4.9",
        "org.assertj:assertj-core:3.12.1",
        "androidx.room:room-runtime:2.2.6",
        "androidx.room:room-compiler:2.2.6",
        "androidx.room:room-testing:2.2.6",
        "androidx.lifecycle:lifecycle-viewmodel:2.0.0",
        "androidx.lifecycle:lifecycle-livedata:2.0.0",
        "androidx.lifecycle:lifecycle-common-java8:2.0.0",
        "com.google.android.material:material:1.0.0",
        "androidx.lifecycle:lifecycle-compiler:2.0.0",

    ],
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
     maven_install_json = "@//:maven_install.json",

)

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()


