package com.liuzhenzhen.liuzhenzhencfs.service;

import com.liuzhenzhen.liuzhenzhencfs.entity.Menu;
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
public interface IMenuService extends IService<Menu> {
    List<Menu> findbypid(int i);

    List<Menu> find(String username);
}
