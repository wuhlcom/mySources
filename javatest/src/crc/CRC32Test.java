package crc;

import org.junit.Test;

import java.io.*;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public class CRC32Test {

    /**
     * 采用BufferedInputStream的方式加载文件
     */
    public static long checksumBufferedInputStream(String filepath) throws IOException {
        InputStream inputStream = new BufferedInputStream(new FileInputStream(filepath));
        CRC32 crc = new CRC32();
        byte[] bytes = new byte[1024];
        int cnt;
        while ((cnt = inputStream.read(bytes)) != -1) {
            crc.update(bytes, 0, cnt);
        }
        inputStream.close();
        return crc.getValue();
    }

    /**
     * 使用CheckedInputStream计算CRC
     */
    public static Long getCRC32(String filepath) throws IOException {
        CRC32 crc32 = new CRC32();
        FileInputStream fileinputstream = new FileInputStream(new File(filepath));
        CheckedInputStream checkedinputstream = new CheckedInputStream(fileinputstream, crc32);
        while (checkedinputstream.read() != -1) {
        }
        checkedinputstream.close();
        return crc32.getValue();
    }

    public static String getCRC32Hex(String filepath) throws IOException {
        Long crc32 = getCRC32(filepath);
        String crc32Hex = Long.toHexString(crc32);
        return crc32Hex;
    }

    @Test
    public void testFileCRC() {
        try {
            // String fPath = "E:\\test0.bin";
            String fPath = "E:\\tmp\\mar.png";

            // String fPath = "192.168.10.166:8888/group1/M00/00/01/wKgKplrVjEiACZN5AAFZVJKVsB0525.bin";
            System.out.println(getCRC32(fPath));
            System.out.println(checksumBufferedInputStream(fPath));
            System.out.println(getCRC32Hex(fPath));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}