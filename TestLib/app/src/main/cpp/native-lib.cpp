#include <jni.h>
#include <string>
#include "native-hanabi.h"

extern "C" JNIEXPORT jstring JNICALL
//使用者包名+类名+调用函数名
Java_com_example_testlib_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    return env->NewStringUTF(tsubasaStr().c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_usetestlib_FirstFragment_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    return env->NewStringUTF(tsubasaStr().c_str());
}