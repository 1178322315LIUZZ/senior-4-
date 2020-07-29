package com.liuzhenzhen.liuzhenzhencfs.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuzhenzhen.liuzhenzhencfs.entity.Role;
import com.liuzhenzhen.liuzhenzhencfs.mapper.RoleMapper;
import com.liuzhenzhen.liuzhenzhencfs.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public PageInfo<Role> lists(int pageNum, int pageSize, Role role) {
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<Role>(roleMapper.lists(role));
    }
}
