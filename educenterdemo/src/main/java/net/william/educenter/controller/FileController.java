package net.william.educenter.controller;

import lombok.extern.slf4j.Slf4j;
import net.william.educenter.entity.Attachment;
import net.william.educenter.entity.AttachmentExample;
import net.william.educenter.service.AttachmentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class FileController {

    private static final String filePath = "D:\\JavaEE\\Educenter\\downloads\\";
    @Resource
    private AttachmentService attachmentService;

    @RequestMapping(value = "/upload")
    public String upload(@RequestParam("file") MultipartFile file, Integer courseId, HttpSession session) {
        Integer tId = (Integer)session.getAttribute("tId");
        Attachment attachment = new Attachment();
        if (file.isEmpty()) {
            return "文件为空";
        }
        try {
            //获取文件名
            String fileName = file.getOriginalFilename();
            log.info("上传的文件名称为》》》,{}", fileName);
            //设置文件存储路径
            String path = filePath + fileName;
            File dest = new File(path);
            //检测是否存在目录
            if (!dest.getParentFile().exists()) {
                //新建文件夹
                dest.getParentFile().mkdirs();
            }
            attachment.setAttachmentUrl(filePath);
            attachment.setFilename(fileName);
            attachment.setFilesize(file.getSize()/1024 +"KB");
            attachment.setAttachmentType(file.getContentType());
            attachment.setAttachmentTime(new Date().toString());
            attachment.setcId(courseId);
            attachment.settId(tId);
            attachmentService.insertAttachment(attachment);
            //文件写入
            file.transferTo(dest);
            return "文件上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    @RequestMapping(value = "/uploadTrain")
    public String uploadTrain(@RequestParam("file") MultipartFile file, Integer trainId, HttpSession session) {
        Integer tId = (Integer)session.getAttribute("tId");
        Attachment attachment = new Attachment();
        if (file.isEmpty()) {
            return "文件为空";
        }
        try {
            //获取文件名
            String fileName = file.getOriginalFilename();
            log.info("上传的文件名称为》》》,{}", fileName);
            //设置文件存储路径
            String path = filePath + fileName;
            File dest = new File(path);
            //检测是否存在目录
            if (!dest.getParentFile().exists()) {
                //新建文件夹
                dest.getParentFile().mkdirs();
            }
            attachment.setAttachmentUrl(filePath);
            attachment.setFilename(fileName);
            attachment.setFilesize(file.getSize()/1024 +"KB");
            attachment.setAttachmentType(file.getContentType());
            attachment.setAttachmentTime(new Date().toString());
            attachment.setTrainId(trainId);
            attachment.settId(tId);
            attachmentService.insertAttachment(attachment);
            //文件写入
            file.transferTo(dest);
            return "文件上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    @PostMapping("/batch")
    public String handleFileUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("files");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    stream = new BufferedOutputStream(new FileOutputStream(
                            //设置文件的路径及名字
                            new File(filePath + file.getOriginalFilename())));
                    //写入
                    stream.write(bytes);
                    stream.close();

                } catch (IOException e) {

                    stream = null;
                    return "第" + i + "个文件上传失败=====>" + e.getMessage();
                }

            } else {
                return "第" + i + "个文件上传失败，因为文件为空";
            }
        }
        return "上传成功";
    }

    @RequestMapping("/download")
    public String downloadFile(HttpServletResponse res, Integer attachmentId){
        AttachmentExample attachmentExample = new AttachmentExample();
        AttachmentExample.Criteria criteria = attachmentExample.createCriteria();
        criteria.andAttachmentIdEqualTo(attachmentId);
        Attachment attachment = attachmentService.selectByExample(attachmentExample).get(0);
        //文件名称
        String fileName = attachment.getFilename();
        String filePath = attachment.getAttachmentUrl();
        File file = new File(filePath + fileName);
        res.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        byte[] buff = new byte[1024];
        BufferedInputStream bis = null;
        OutputStream os = null;
        try {
            os = res.getOutputStream();
            bis = new BufferedInputStream(new FileInputStream(file));
            int i = bis.read(buff);
            while (i != -1) {
                os.write(buff, 0, buff.length);
                os.flush();
                i = bis.read(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("success");
        return "下载失败";
    }
}