package com.liuzhenzhen.liuzhenzhencfs.service;

import com.liuzhenzhen.liuzhenzhencfs.entity.Menu;
import com.liuzhenzhen.liuzhenzhencfs.entity.MenuRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
public interface IMenuRoleService extends IService<MenuRole> {


    List<MenuRole> finds(Integer rid);
}
