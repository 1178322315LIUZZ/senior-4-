package com.liuzhenzhen.liuzhenzhencfs.service.impl;

import com.liuzhenzhen.liuzhenzhencfs.entity.Menu;
import com.liuzhenzhen.liuzhenzhencfs.mapper.MenuMapper;
import com.liuzhenzhen.liuzhenzhencfs.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
    @Autowired
    MenuMapper   menuMapper;
    @Override
    public List<Menu> findbypid(int i) {
        return menuMapper.findbypid(i);
    }

    @Override
    public List<Menu> find(String username) {
        return menuMapper.finds(username);
    }
}
