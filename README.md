# Android OpenCV + OpenGL Assessment  
**Project:** Android app using OpenCV native & Java SDK + OpenGL for real-time camera processing

## 📋 Prerequisites  
- Android Studio Arctic Fox (or newer)  
- Android SDK 34  
- NDK + CMake installed  
- OpenCV Android SDK (version e.g., 4.12.0) included in project  
- Device or emulator with camera support  

## 🛠 Build & Run  
1. Clone the repo: `git clone https://github.com/farazify7/android-opencv-opengl-assessment.git`  
2. Open in Android Studio.  
3. Sync Gradle.  
4. Connect a camera-capable device or use emulation.  
5. Click **Run** or use terminal: `./gradlew clean assembleDebug`  
6. Grant Camera permission when prompted.  
7. You should see the camera feed processed via OpenCV.

## 🧰 Key Features  
- Uses OpenCV native library (`native-lib.so` via JNI)  
- Real-time camera preview using `CameraBridgeViewBase`  
- Prefab enabled for OpenCV native integration  
- Compatible with armeabi-v7a and arm64-v8a  

## 📄 License  
This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.
