/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.intertechno.internal.parser;

import java.util.List;

import org.openhab.model.item.binding.BindingConfigParseException;

/**
 * All parsers for Intertechno configs need to implement this interface.
 *
 * @author Till Klocke
 * @since 1.4.0
 */
public interface IntertechnoAddressParser {

    /**
     * Parse the config from the given config parts. After this method was called
     * the on and off commands can be read with getCommand(ON|OFF).
     * 
     * @param addressParts
     *            String list, which contains config items like this:
     *            <name>=<value>.
     * @throws BindingConfigParseException
     */
    public void parseConfig(List<String> configParts) throws BindingConfigParseException;

    /**
     * Returns the ON command, generated by the concrete parser.
     * 
     * @return The ON command
     */
    public String getCommandON();

    /**
     * Returns the OFF command, generated by the concrete parser.
     * 
     * @return The OFF command.
     */
    public String getCommandOFF();

}
