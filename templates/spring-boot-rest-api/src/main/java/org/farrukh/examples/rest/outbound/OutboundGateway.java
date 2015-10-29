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
package org.farrukh.examples.rest.outbound;

import org.farrukh.examples.rest.outbound.domain.Resource;

import java.util.UUID;

/**
 * Base interfaces for storage outbound gateways.
 */
public interface OutboundGateway {

    /**
     * Stores some resource to a outbound gateway.
     *
     * @param resource - some resource.
     * @return UUID of the resource.
     */
    UUID store(final Resource resource);

    /**
     * Retrieves a resources from outbound gateway using id.
     *
     * @param resourceId - an id of the resource.
     * @return Some resource.
     */
    Resource retrieve(final UUID resourceId);

}
