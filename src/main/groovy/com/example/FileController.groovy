package com.example

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.QueryValue
import io.micronaut.validation.Validated

import java.nio.file.Path

@Consumes(MediaType.APPLICATION_OCTET_STREAM)
@Controller('/files')
@Validated
class FileController implements FileOperations {

    @Override
    @Post('/upload')
    String upload(@QueryValue Path filename, @Body byte[] content) {
        return 'Uploaded'
    }

    @Override
    @Post('/upload2')
    String upload2(@QueryValue String filename, @Body byte[] content) {
        return 'Uploaded'
    }

}
