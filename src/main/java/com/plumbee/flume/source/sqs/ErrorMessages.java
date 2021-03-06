/*
 * Copyright 2015 Plumbee Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.plumbee.flume.source.sqs;

public final class ErrorMessages {

    private ErrorMessages() {
        // Prevent instantiation
    }

    public static final String MISSING_MANDATORY_PARAMETER =
        "Mandatory configuration parameter %s must be specified";

    public static final String NEGATIVE_PARAMETER_VALUE =
        "Parameter %s must be greater than 0";
}
