package com.liuzhenzhen.liuzhenzhencfs.service;

import com.github.pagehelper.PageInfo;
import com.liuzhenzhen.liuzhenzhencfs.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
public interface IUserService extends IService<User> {

    PageInfo<User> lists(User user, int pageNum,int size);

    User find(Integer id);
}
