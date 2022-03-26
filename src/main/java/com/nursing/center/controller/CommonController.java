package com.nursing.center.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/common")
public class CommonController {

    @Value("${web.upload-path}")
    private String path;

    @RequestMapping("upload")
    public String upload(@RequestParam("file") MultipartFile multipartFile){
        String fileName = multipartFile.getOriginalFilename();
        //命名新文件名
        String newFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));
        try {
            //创建目标文件的地址
            FileOutputStream fileOutputStream = new FileOutputStream(path+newFileName);
            //复制文件
            FileCopyUtils.copy(multipartFile.getInputStream(),fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFileName;
    }
}

