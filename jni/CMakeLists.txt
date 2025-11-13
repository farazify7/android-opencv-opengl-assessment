cmake_minimum_required(VERSION 3.10.2)
project(AndroidOpenCVApp)

# Set path to OpenCV
set(OpenCV_DIR ${CMAKE_SOURCE_DIR}/opencv-4.12.0-android-sdk/sdk/native/jni)

find_package(OpenCV REQUIRED)

# Include OpenCV headers
include_directories(${OpenCV_INCLUDE_DIRS})

# Add your native source files (for now, placeholder)
add_library(native-lib SHARED jni/native-lib.cpp)

# Link OpenCV libraries
target_link_libraries(native-lib ${OpenCV_LIBS} log)
