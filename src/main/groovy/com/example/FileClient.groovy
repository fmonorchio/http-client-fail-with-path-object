package com.example

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client

import java.nio.file.Path

@Client(value = '/', path = '/files')
@Produces(MediaType.APPLICATION_OCTET_STREAM)
interface FileClient extends FileOperations {

    @Override
    @Post('/upload')
    String upload(@QueryValue Path filename, @Body byte[] content)

    @Override
    @Post('/upload2')
    String upload2(@QueryValue String filename, @Body byte[] content)

}
