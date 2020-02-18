package fan.stu.spring.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import fan.stu.spring.model.MyFile;

@Controller
public class MainController {

    @RequestMapping(value = {"/", "/index"})
    public String index(Model model) {

        model.addAttribute("myFile", new MyFile());

        return "index";
    }

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFile(MyFile myFile, Model model) {

        String description = myFile.getDescription();

        try {
            MultipartFile multipartFile = myFile.getMultipartFile();
            String fileName = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("/home/fanthao/filesupload", fileName));
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("des", description + ": Fail");
        }
        model.addAttribute("des", description + ": Success");

        return "index";
    }

}
