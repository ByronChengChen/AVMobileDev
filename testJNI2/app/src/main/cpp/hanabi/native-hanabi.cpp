#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_testjni2_MainActivity_hanabi(
        JNIEnv* env,
jobject /* this */) {
std::string hello = "Hello from hanabi";
return env->NewStringUTF(hello.c_str());
}