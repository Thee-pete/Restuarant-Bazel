load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
android_sdk_repository(
    name = "androidsdk",
    api_level = 30,
     build_tools_version = "30.0.2"
)

http_archive(
    name = "android_tools",
    sha256 = "ed5290594244c2eeab41f0104519bcef51e27c699ff4b379fcbd25215270513e",
    url = "https://mirror.bazel.build/bazel_android_tools/android_tools_pkg-0.23.0.tar.gz",
)

http_archive(
    name = "rules_android",
    urls = ["https://github.com/bazelbuild/rules_android/archive/v0.1.1.zip"],
    sha256 = "cd06d15dd8bb59926e4d65f9003bfc20f9da4b2519985c27e190cddc8b7a7806",
    strip_prefix = "rules_android-0.1.1",
)

RULES_JVM_EXTERNAL_TAG = "2.4"
RULES_JVM_EXTERNAL_SHA = "2393f002b0a274055a4e803801cd078df90d1a8ac9f15748d1f803b97cfcdc9c"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)



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

    ],
    repositories = [
        "https://maven.google.com",
        "https://jcenter.bintray.com",
        "https://repo1.maven.org/maven2",
    ],
    fetch_sources = True,

)


