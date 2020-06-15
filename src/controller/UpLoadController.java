package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传
 * created by xu-jp on 2020/6/12
 **/
@Controller
public class UpLoadController {
    // jsp 视图控制器
    @RequestMapping("/upload")
    public void  upload(){}
    // 上传文件控制器
    @ResponseBody
    @RequestMapping("/uploadfile")
    public void uploadfile(@RequestParam( value="picture",required = false) MultipartFile pic ){
        System.out.println(pic.getOriginalFilename());
    }
}
