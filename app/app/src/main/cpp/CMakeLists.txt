cmake_minimum_required(VERSION 3.18.1)
project("native-lib")

add_library( # Name of the library
        native-lib

        # Type of library (shared = .so)
        SHARED

        # Source file
        native-lib.cpp )

find_library( # Locate Android log library
        log-lib
        log )

target_link_libraries( # Link the log library
        native-lib
        ${log-lib} )
