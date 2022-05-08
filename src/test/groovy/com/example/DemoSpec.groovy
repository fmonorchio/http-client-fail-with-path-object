package com.example

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject

import java.nio.file.Path

@MicronautTest
class DemoSpec extends Specification {

    @Inject
    EmbeddedApplication<?> application

    @Inject
    FileClient fileClient

    void 'There is an error with "Path" object as query param'() {

        given:
        def filename = Path.of('folder/profile-image.png')
        def content = 'A simple byte array'.bytes

        when:
        def res = fileClient.upload(filename, content)

        then:
        res == 'Uploaded'
    }

    void 'No error with "String" object as query param'() {

        given:
        def filename = 'folder/profile-image.png'
        def content = 'A simple byte array'.bytes

        when:
        def res = fileClient.upload2(filename, content)

        then:
        res == 'Uploaded'
    }

}
