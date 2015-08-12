/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.common.node;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 */
public interface Node {

    /**
     * Start the node. If the node is already started, this method is no-op.
     */
    void start();

    /**
     * Stops the node. If the node is already stopped, this method is no-op.
     */
    void stop();

    /**
     * Returns the node name.
     *
     * @return The node name.
     */
    String name();
}
