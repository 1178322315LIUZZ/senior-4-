package com.liuzhenzhen.liuzhenzhencfs.service.impl;

import com.liuzhenzhen.liuzhenzhencfs.entity.Menu;
import com.liuzhenzhen.liuzhenzhencfs.entity.MenuRole;
import com.liuzhenzhen.liuzhenzhencfs.mapper.MenuMapper;
import com.liuzhenzhen.liuzhenzhencfs.mapper.MenuRoleMapper;
import com.liuzhenzhen.liuzhenzhencfs.service.IMenuRoleService;
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
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {
    @Autowired
    MenuRoleMapper menuRoleMapper;
    @Override
    public List<MenuRole> finds(Integer rid) {
        return menuRoleMapper.finds(rid);
    }
}
