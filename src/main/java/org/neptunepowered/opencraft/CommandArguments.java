/*
 * This file is part of OpenCraft, licensed under the MIT License (MIT).
 *
 * Copyright (c) Jamie Mansfield <https://github.com/jamierocks>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.neptunepowered.opencraft;

import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;

public class CommandArguments {

    @Parameter
    private List<String> parameters = new ArrayList<String>();

    @Parameter(names = { "--username" })
    private String username = "Player";

    @Parameter(names = { "--version" })
    private String version = "open-1.8.4";

    @Parameter(names = { "--gameDir" })
    private String gameDir;

    @Parameter(names = { "--assetsDir" })
    private String assetsDir;

    @Parameter(names = { "--assetIndex" })
    private String assetIndex;

    @Parameter(names = { "--uuid" })
    private String uuid;

    @Parameter(names = { "--accessToken" })
    private String accessToken;

    @Parameter(names = { "--userType" })
    private String userType;

    public List<String> getParameters() {
        return parameters;
    }

    public String getUsername() {
        return username;
    }

    public String getVersion() {
        return version;
    }

    public String getAssetsDir() {
        return assetsDir;
    }

    public String getAssetIndex() {
        return assetIndex;
    }

    public String getUuid() {
        return uuid;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getUserType() {
        return userType;
    }
}
