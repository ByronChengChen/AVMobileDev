#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_testjni2_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_testjni2_MainActivity_tsubasaFromJNI(
        JNIEnv* env,
jobject /* this */) {
std::string hello = "Hello from tsubasa";
return env->NewStringUTF(hello.c_str());
}