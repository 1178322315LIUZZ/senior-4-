package com.liuzhenzhen.liuzhenzhencfs.service;

import com.github.pagehelper.PageInfo;
import com.liuzhenzhen.liuzhenzhencfs.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
public interface IRoleService extends IService<Role> {

    PageInfo<Role> lists(int pageNum, int pageSize, Role role);
}
