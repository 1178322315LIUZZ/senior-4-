package com.liuzhenzhen.liuzhenzhencfs.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuzhenzhen.liuzhenzhencfs.entity.User;
import com.liuzhenzhen.liuzhenzhencfs.mapper.UserMapper;
import com.liuzhenzhen.liuzhenzhencfs.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public PageInfo<User> lists(User user, int pageNum,int size) {
        PageHelper.startPage(pageNum,size);
        return new PageInfo<User>(userMapper.lists(user));
    }

    @Override
    public User find(Integer id) {
        return userMapper.find(id);
    }
}
