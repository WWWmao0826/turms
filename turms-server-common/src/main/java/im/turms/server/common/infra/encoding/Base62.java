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

package im.turms.server.common.infra.encoding;

import im.turms.server.common.infra.lang.StringUtil;

import java.util.Arrays;

/**
 * @author James Chen
 */
public class Base62 {

    private static final int STANDARD_BASE = 256;
    private static final int TARGET_BASE = 62;
    private static final double SCALE = Math.log(STANDARD_BASE) / Math.log(TARGET_BASE);
    private static final int ESTIMATED_BASE62_LONG_LENGTH = ((int) (SCALE * Long.BYTES)) + 1;
    private static final byte[] GMP = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'
    };

    private final byte[] alphabet;

    public Base62() {
        this.alphabet = GMP;
    }

    public Base62(String alphabet) {
        if (!StringUtil.isLatin1(alphabet)) {
            throw new IllegalArgumentException("The charset must only contain Latin-1 bytes, but got [" +
                    alphabet +
                    "]");
        }
        if (alphabet.length() != TARGET_BASE) {
            throw new IllegalArgumentException("The length of charset must be " + TARGET_BASE);
        }
        this.alphabet = StringUtil.getBytes(alphabet);
    }

    public byte[] encode(byte[] data) {
        int dataLength = data.length;
        int estimatedLength = ((int) (SCALE * dataLength)) + 1;
        byte[] out = new byte[estimatedLength];
        int outWriterIndex = estimatedLength - 1;
        byte[] quotient = new byte[dataLength];
        int quotientWriterIndex;
        int remainder;
        byte[] localAlphabet = alphabet;
        while (dataLength > 0) {
            quotientWriterIndex = 0;
            remainder = 0;
            for (int i = 0; i < dataLength; i++) {
                int accumulator = (data[i] & 0xFF) + remainder * STANDARD_BASE;
                int digit = (accumulator - (accumulator % TARGET_BASE)) / TARGET_BASE;
                remainder = accumulator % TARGET_BASE;
                if (quotientWriterIndex > 0 || digit > 0) {
                    quotient[quotientWriterIndex++] = (byte) digit;
                }
            }
            out[outWriterIndex--] = localAlphabet[(byte) remainder];
            data = quotient;
            dataLength = quotientWriterIndex;
        }
        if (outWriterIndex >= 0) {
            out = Arrays.copyOfRange(out, outWriterIndex + 1, estimatedLength);
        }
        return out;
    }

    public byte[] encode(long base10) {
        byte[] out = new byte[ESTIMATED_BASE62_LONG_LENGTH];
        int writerIndex = ESTIMATED_BASE62_LONG_LENGTH - 1;
        byte[] localAlphabet = alphabet;
        do {
            int remainder = (int) (base10 % TARGET_BASE);
            out[writerIndex--] = localAlphabet[remainder];
            base10 /= TARGET_BASE;
        } while (base10 > 0);
        if (writerIndex >= 0) {
            out = Arrays.copyOfRange(out, writerIndex + 1, ESTIMATED_BASE62_LONG_LENGTH);
        }
        return out;
    }

}