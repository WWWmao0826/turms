/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
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

package im.turms.plugin.antispam.character;

import lombok.SneakyThrows;

public class CharNormalizer {

    private static final char[][][] cache = new char[256][][];

    private CharNormalizer() {
    }

    @SneakyThrows
    public static char[] normalize(int codepoint) {
        int high = (codepoint >> 8) & 0xFF;
        int low = codepoint & 0xFF;
        char[][] data = cache[high];
        if (data == null) {
            String className = "im.turms.plugin.antispam.character.data.U%02X".formatted(high);
            data = (char[][]) Class.forName(className)
                    .getField("DATA")
                    .get(null);
            cache[high] = data;
        }
        return data[low];
    }

}
