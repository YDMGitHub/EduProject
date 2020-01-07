package cn.itcast.ydm.controller;

import cn.itcast.ydm.model.User;
import cn.itcast.ydm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("login")
    public String findById(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return "Default";
    }
    @RequestMapping("manager")
    public String manager(){
        return "User/UserManage";
    }
    @RequestMapping("info")
    public String info(){
        return "User/UserInfo";
    }
    @RequestMapping("edit")
    public String edit(){
        return "User/UserEdit";
    }
}
