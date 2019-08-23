package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileDemo {
    public static boolean mkdirs(String dirs) {
        File file = new File(dirs);
        //如果文件夹不存在则创建
        if (!file.exists() && !file.isDirectory()) {
            // logger.info("目录 {} 不存在，将创建目录", dirs);
            return file.mkdirs();
        } else {
            // logger.info("目录 {} 已存在", dirs);
            return true;
        }
    }

    public static boolean createFile(String file) {
        File myFilePath = new File(file);
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            return myFilePath.exists();
        } catch (Exception e) {
            System.out.println("新建文件操作出错");
            e.printStackTrace();
            return false;
        }
    }

    public static void writeFile(String file, String content) {
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(content);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String dir="e:/filetest/file";
        FileDemo.mkdirs(dir);
        String filePath=dir+"/"+"abc.txt";
        FileDemo.createFile(filePath);
        FileDemo.writeFile(filePath,"wq dkdkd");
    }


}
