/*
 * Copyright (c) 2015. Farrukhjon D. Sattorov firedandy@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.farrukh.examples.amqp

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
 * Cucumber-JVM (Groovy) acceptance test runner.
 */
@CucumberOptions(
        features = ['classpath:org/farrukh/examples/amqp/acceptance.feature'],
        plugin = ['pretty', 'html:build/reports/acceptanceTests'],
        monochrome = true,
        strict = true,
        tags = ['~@slow']
)
@RunWith(Cucumber)
class AcceptanceTests {
}
