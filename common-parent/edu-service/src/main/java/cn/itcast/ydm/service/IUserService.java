package cn.itcast.ydm.service;

import cn.itcast.ydm.model.User;
import cn.itcast.ydm.service.base.IBaseService;

public interface IUserService extends IBaseService<User>{
    //特有的方法
    public User login(String username, String password);
}
