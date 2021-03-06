/*
 * Copyright (c) 2015. Farrukhjon D. Sattorov firedandy@gmail.com.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.farrukh.examples.rest.inbound

import org.farrukh.examples.rest.BaseInboundIntegrationTest
import org.farrukh.examples.rest.inbound.domain.Greeting
import org.farrukh.examples.rest.inbound.domain.metadata.Request
import org.farrukh.examples.rest.inbound.domain.metadata.Response
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus

/**
 * Experimental test for requesting greeting message.
 */
@SuppressWarnings('UnnecessaryGetter')
class GreetingInboundGatewayIntegrationTest extends BaseInboundIntegrationTest {

    def expectedMediaType = Response.JSON_MEDIA_TYPE

    def 'exercise happy path for requesting a greeting'() {
        given:
        def expectedMessage = 'Hello World!'
        def path = 'greeting'
        def url = createUrl(path)

        and:
        def headers = new HttpHeaders()
        headers.setAccept([Response.JSON_MEDIA_TYPE])

        when:
        def response = restTemplate.getForEntity(url, Response, headers)

        then:
        response.statusCode == HttpStatus.OK
        def greeting = response.body.payload as Greeting
        response.headers.getContentType() == expectedMediaType
        greeting.message == expectedMessage
    }

    def 'exercise happy path for converting a greeting'() {
        given: 'the message for converting'
        def messageForConvert = new Greeting(message: 'hello world!')

        and: 'expected results'
        def expectedMessage = 'HELLO WORLD!'

        and: 'the proper request is created'
        def url = createUrl('convert')
        def request = new Request<Greeting>(payload: messageForConvert)

        when: 'the request is sent to the controller'
        def response = restTemplate.postForEntity(url, request, Response)

        then: 'the expected result is returned'
        response.statusCode == HttpStatus.OK
        response.headers.getContentType() == expectedMediaType
        def greeting = response.body.payload as Greeting
        greeting.message == expectedMessage
    }

}
