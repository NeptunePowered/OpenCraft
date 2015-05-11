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
package org.neptunepowered.opencraft.session;

import org.spacehq.mc.auth.UserType;

public enum Type {

    /**
     * LEGACY represents the old authentication method
     */
    LEGACY("legacy", UserType.LEGACY),
    /**
     * MOJANG represents the new authentication method
     */
    MOJANG("mojang", UserType.MOJANG);

    private final UserType userType;
    private String type;

    /**
     * Represents the way a user logs in
     *
     * @param type the String representation
     */
    Type(String type, UserType userType) {
        this.type = type;
        this.userType = userType;
    }

    /**
     * Gets this type as a {@link UserType}
     *
     * @return the type as a {@link UserType}
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * Gets the type by it's String representation
     *
     * @param type it's String representation
     * @return it's type
     */
    public static Type fromString(String type) {
        for (Type t : values()) {
            if (t.toString().equalsIgnoreCase(type)) {
                return t;
            }
        }
        return LEGACY;
    }

    /**
     * The String representation of this type
     *
     * @return the String representation
     */
    @Override
    public String toString() {
        return type;
    }
}
