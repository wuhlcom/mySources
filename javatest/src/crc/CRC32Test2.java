package crc;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CRC32Test2 {
    /**
     * CRC32 = X32 + X26 + X23 + X22 + X16 + X12 + X11 + X10
     *  + X8 + X7 + X5 + X4 + X2 + X1 + X0
     */

    private static final int CN = 0x04C11DB7;

    private static int[] ptiTable = new int[256];

    static {
        build(CN);
    }

    private static void build(int cn) {
        int nData = 0;
        int nAccum = 0;

        for (int i = 0; i < 256; i++) {
            nData = i << 24;
            nAccum = 0;
            for (int j = 0; j < 8; j++) {
                if (0 != ((nData ^ nAccum) & 0x80000000)) {
                    nAccum = (nAccum << 1) ^ cn;
                } else {
                    nAccum <<= 1;
                }
                nData <<= 1;
            }
            ptiTable[i] = nAccum;
        }
    }

    public static int calculate(byte[] datas) {
        int crc32 = 0xFFFFFFFF;

        if (null == datas || datas.length < 1) {
            return crc32;
        }

        for (byte data : datas) {
            crc32 = (crc32 << 8) ^ ptiTable[(crc32 >>> 24) ^ (data & 0xFF)];
        }

        return crc32;
    }

    public static int crc(String filepath) throws IOException {
        int crc32 = 0xFFFFFFFF;
        InputStream inputStream = new BufferedInputStream(new FileInputStream(filepath));
        byte[] bytes = new byte[1024];
        while ((inputStream.read(bytes)) != -1) {
            crc32 = calculate(bytes);
        }
        inputStream.close();
        return crc32;
    }

}