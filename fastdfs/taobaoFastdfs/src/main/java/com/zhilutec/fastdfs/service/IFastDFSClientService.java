package com.zhilutec.fastdfs.service;

import com.github.tobato.fastdfs.domain.FileInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IFastDFSClientService {


    String uploadFile(MultipartFile file) throws IOException;

    byte[] downloadFile(String fileUrl) throws IOException;

    void deleteFile(String filePath);

    FileInfo getFileInfo(String groupName, String path);
}
