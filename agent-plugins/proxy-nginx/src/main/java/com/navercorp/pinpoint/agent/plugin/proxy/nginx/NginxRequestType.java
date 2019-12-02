/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.agent.plugin.proxy.nginx;

import com.navercorp.pinpoint.agent.plugin.proxy.common.ProxyRequestType;

/**
 * @author jaehong.kim
 */
public class NginxRequestType implements ProxyRequestType {
    @Override
    public String getHttpHeaderName() {
        return "Pinpoint-ProxyNginx";
    }

    @Override
    public String getDisplayName() {
        return "PROXY(NGINX)";
    }

    @Override
    public int getCode() {
        return 2;
    }
}