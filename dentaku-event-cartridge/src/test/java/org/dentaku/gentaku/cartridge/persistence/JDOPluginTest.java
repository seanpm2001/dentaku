/**
 *
 *  Copyright 2004 Brian Topping
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.dentaku.gentaku.cartridge.persistence;

import org.dentaku.gentaku.cartridge.AbstractXMLGeneratingPluginTestBase;
import org.dentaku.services.metadata.JMICapableMetadataProvider;
import org.generama.Plugin;
import org.generama.MetadataProvider;
import org.generama.WriterMapper;
import org.generama.JellyTemplateEngine;

import java.net.URL;

public class JDOPluginTest extends AbstractXMLGeneratingPluginTestBase {
    protected Plugin createPlugin(MetadataProvider metadataProvider, WriterMapper writerMapper) throws Exception {
        return new JDOPlugin(new JellyTemplateEngine(), (JMICapableMetadataProvider)metadataProvider, writerMapper);
    }

    protected URL getExpected() throws Exception {
        return null;
    }
}
