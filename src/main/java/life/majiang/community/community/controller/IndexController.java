package life.majiang.community.community.controller;

import life.majiang.community.community.mapper.UserMapper;
import life.majiang.community.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

//自动扫描该类，把它作为一个bean来管理
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String index(HttpServletRequest request){
        //UserMapper的方法 传入token  返回 User对象  方法 findByToken
       Cookie[] cookies = request.getCookies();
       for(Cookie cookie: cookies){
           if(cookie.getName().equals("token")){
               String token = cookie.getValue();
               User user =  userMapper.findByToken(token);
               if(user != null){
                   request.getSession().setAttribute("user",user);
               }
               break;
           }
       }



        return "index";
    }
}
