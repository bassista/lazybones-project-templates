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

package org.farrukh.examples.integration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Custom application configuration holder object.
 */
@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {

    /**
     * the queue name.
     */
    private String queueName;

    /**
     * the exchange name.
     */
    private String exchangeName;

    /**
     * rabbit exchange durable.
     */
    private boolean rabbitExchangeDurable;

    /**
     * Returns the RabbitMQ message queue name.
     * @return the message queue.
     */
    public String getQueueName() {
        return queueName;
    }

    /**
     * Sets the RabbitMQ message queue name.
     * @param queueName message queue name.
     */
    public void setQueueName(final String queueName) {
        this.queueName = queueName;
    }

    /**
     * Returns the RabbitMQ message exchange name.
     * @return name of the message exchange.
     */
    public String getExchangeName() {
        return exchangeName;
    }

    /**
     * Sets the RabbitMQ message exchange name.
     * @param exchangeName name for the message exchange.
     */
    public void setExchangeName(final String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public boolean isRabbitExchangeDurable() {
        return rabbitExchangeDurable;
    }

    public void setRabbitExchangeDurable(final boolean rabbitExchangeDurable) {
        this.rabbitExchangeDurable = rabbitExchangeDurable;
    }

}
