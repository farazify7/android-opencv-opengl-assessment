#include <jni.h>
#include <opencv2/opencv.hpp>

using namespace cv;

extern "C"
JNIEXPORT jlong JNICALL
Java_com_example_androidopencv_MainActivity_processFrameJNI(
        JNIEnv* env, jobject /* this */, jlong matAddr) {
    Mat& frame = *(Mat*)matAddr;
    Mat gray, edges;
    cvtColor(frame, gray, COLOR_RGBA2GRAY);
    Canny(gray, edges, 80, 150);
    cvtColor(edges, frame, COLOR_GRAY2RGBA);
    return (jlong)&frame;
}
