/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.apache.groovy.parser;

import org.apache.groovy.parser.antlr4.Antlr4PluginFactory;
import org.codehaus.groovy.control.CompilerConfiguration;

/**
 * The Antlr4 parser for creating a module node.
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * Created on    2016/08/14
 */
public class Antlr4Parser extends AbstractParser {
    private final CompilerConfiguration compilerConfiguration;

    public Antlr4Parser() {
        this.compilerConfiguration = new CompilerConfiguration(CompilerConfiguration.DEFAULT);
    }

    public Antlr4Parser(CompilerConfiguration compilerConfiguration) {
        this.compilerConfiguration = compilerConfiguration;
    }

    @Override
    protected CompilerConfiguration getCompilerConfiguration() {
        compilerConfiguration.setPluginFactory(new Antlr4PluginFactory(compilerConfiguration));

        return compilerConfiguration;
    }
}
