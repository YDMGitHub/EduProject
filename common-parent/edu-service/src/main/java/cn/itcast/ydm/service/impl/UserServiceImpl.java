package cn.itcast.ydm.service.impl;

import cn.itcast.ydm.model.User;
import cn.itcast.ydm.service.IUserService;
import cn.itcast.ydm.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUuid(String id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUuid(String id) {

    }

    @Override
    public void insert(User user) {

    }

    @Override
    public void update(User user) {

    }
}
