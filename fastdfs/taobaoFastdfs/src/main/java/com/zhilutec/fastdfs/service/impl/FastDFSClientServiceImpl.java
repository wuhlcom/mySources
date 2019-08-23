package com.zhilutec.fastdfs.service.impl;

import com.github.tobato.fastdfs.conn.FdfsWebServer;
import com.github.tobato.fastdfs.domain.FileInfo;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.proto.storage.DownloadByteArray;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.github.tobato.fastdfs.service.GenerateStorageClient;
import com.zhilutec.fastdfs.service.IFastDFSClientService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;


@Component
public class FastDFSClientServiceImpl implements IFastDFSClientService {
    @Autowired
    private FastFileStorageClient storageClient;

    @Autowired
    private FdfsWebServer fdfsWebServer;

    @Resource(name="defaultGenerateStorageClient")
    private GenerateStorageClient defaultGenStorageClient;

    @Override
    public String uploadFile(MultipartFile file) throws IOException {
        StorePath storePath = storageClient.uploadFile(file.getInputStream(),file.getSize(), FilenameUtils.getExtension(file.getOriginalFilename()),null);
        return getResAccessUrl(storePath);
    }
    /**
     * 下载文件
     *
     * @param fileUrl 文件URL
     * @return 文件字节
     * @throws IOException
     */
    @Override
    public byte[] downloadFile(String fileUrl) throws IOException {
        String group = fileUrl.substring(0, fileUrl.indexOf("/"));
        String path = fileUrl.substring(fileUrl.indexOf("/") + 1);
        DownloadByteArray downloadByteArray = new DownloadByteArray();
        byte[] bytes = storageClient.downloadFile(group, path, downloadByteArray);
        return bytes;
    }

    // 封装文件完整URL地址
    private String getResAccessUrl(StorePath storePath) {
//       String fileUrl = "http://39.107.71.246" + "/" + storePath.getFullPath();
        String fileUrl = fdfsWebServer.getWebServerUrl() + storePath.getFullPath();
        return fileUrl;
    }

    @Override
    public void deleteFile(String filePath) {
        storageClient.deleteFile(filePath);
    }

    @Override
    // {"groupName":"group1","path":"M00/00/00/Cmgw3FvS6GqAO7GsAAhuYZ4N61o025.png"}
    public FileInfo getFileInfo(String groupName, String path){
        return  defaultGenStorageClient.queryFileInfo(groupName,path);
    }


}
