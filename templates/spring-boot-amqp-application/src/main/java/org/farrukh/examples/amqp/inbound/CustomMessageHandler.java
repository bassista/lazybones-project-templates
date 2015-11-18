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

package org.farrukh.examples.amqp.inbound;

import org.farrukh.examples.amqp.inbound.domain.Request;

/**
 * Custom message holder and is delegate object for the message listener adapter.
 */
public class CustomMessageHandler {

    /**
     * Intended to get request message for the queue and makes some useful operation.
     * @param request some abstract request message to the service.
     */
    public void handleMessage(final Request request) {

    }
}
