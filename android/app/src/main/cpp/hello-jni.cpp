#include <jni.h>
#include <android/log.h>

#include <GLES2/gl2.h>
#include <GLES2/gl2ext.h>

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void A(){
throw 0;
}
extern "C" {
    JNIEXPORT void JNICALL Java_com_example_A_stringFromJNI();
};

JNIEXPORT void JNICALL Java_com_example_A_stringFromJNI()
{
    A();
}
