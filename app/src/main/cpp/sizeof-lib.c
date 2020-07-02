#include <string.h>
#include <jni.h>
#include <limits.h>
#include <android/log.h>

/**
 * Macro to make method declaration less cumbersome.
 */
#define JNI_METHOD(RETURN, METHOD_NAME) \
    JNIEXPORT RETURN JNICALL Java_hurdleg_commonsizeofandroid_MainActivity_##METHOD_NAME
/**
 * Macro to make Logging a little easier
 */
#define LOG(MESSAGE) \
    __android_log_print(ANDROID_LOG_VERBOSE, "SIZEOF-ANDROID", MESSAGE);

JNI_METHOD(jint, getChar)(JNIEnv* env, jobject obj){
    LOG("sizeof( char )");
    return sizeof( char );
}
JNI_METHOD(jint, getCharBit)(JNIEnv* env, jobject obj){
    LOG("CHAR_BIT");
    return CHAR_BIT;
}
JNI_METHOD(jint, getCharPtr)(JNIEnv* env, jobject obj){
    LOG("sizeof( char * )");
    return sizeof( char * );
}
JNI_METHOD(jint, getDouble)(JNIEnv* env, jobject obj){
    LOG("sizeof( double )");
    return sizeof( double );
}
JNI_METHOD(jint, getFloat)(JNIEnv* env, jobject obj){
    LOG("sizeof( float )");
    return sizeof( float );
}
JNI_METHOD(jint, getDoublePtr)(JNIEnv* env, jobject obj){
    LOG("sizeof( double * )");
    return sizeof( double * );
}
JNI_METHOD(jint, getInt)(JNIEnv* env, jobject obj){
    LOG("sizeof( int )");
    return sizeof( int );
}
JNI_METHOD(jint, getIntPtr)(JNIEnv* env, jobject obj){
    LOG("sizeof( int * )");
    return sizeof( int * );
}
JNI_METHOD(jint, getLong)(JNIEnv* env, jobject obj){
    LOG("sizeof( long )");
    return sizeof( long );
}
JNI_METHOD(jint, getLongPtr)(JNIEnv* env, jobject obj){
    LOG("sizeof( long * )");
    return sizeof( long * );
}
JNI_METHOD(jint, getShort)(JNIEnv* env, jobject obj){
    LOG("sizeof( short )");
    return sizeof( short );
}

