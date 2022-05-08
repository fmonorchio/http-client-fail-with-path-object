package com.example

import java.nio.file.Path

interface FileOperations {

    String upload(Path filename, byte[] content)

    String upload2(String filename, byte[] content)

}
