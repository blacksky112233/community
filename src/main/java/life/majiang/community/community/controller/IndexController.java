package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//自动扫描该类，把它作为一个bean来管理
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
