package cn.itcast.ydm.service.base;

import cn.itcast.ydm.mapper.UserMapper;
import cn.itcast.ydm.service.base.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    //统一管理dao
    @Autowired
    protected UserMapper userMapper;
}
