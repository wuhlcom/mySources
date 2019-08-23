package crc;

import java.io.IOException;

public class TestMain {

    public static void main(String[] args) throws IOException {
        new CRC32Test().testFileCRC();
        String fPath = "E:\\test0.bin";
        int rs = CRC32Test2.crc(fPath);
        System.out.println(rs);

    }

}
