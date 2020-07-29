package com.liuzhenzhen.liuzhenzhencfs.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import com.liuzhenzhen.liuzhenzhencfs.entity.MenuRole;
import com.liuzhenzhen.liuzhenzhencfs.entity.Role;
import com.liuzhenzhen.liuzhenzhencfs.entity.UserRole;
import com.liuzhenzhen.liuzhenzhencfs.mapper.MenuRoleMapper;
import com.liuzhenzhen.liuzhenzhencfs.mapper.RoleMapper;
import com.liuzhenzhen.liuzhenzhencfs.mapper.UserRoleMapper;
import com.liuzhenzhen.liuzhenzhencfs.service.IMenuRoleService;
import com.liuzhenzhen.liuzhenzhencfs.service.IRoleService;
import com.liuzhenzhen.liuzhenzhencfs.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    IRoleService iRoleService;
    @Autowired
    UserRoleMapper userRoleMapper;
    @Autowired
    MenuRoleMapper menuRoleMapper;
    @RequestMapping("list")
    public List<Role> list(){
        return iRoleService.list();
    }
    @RequestMapping("lists")
    public PageInfo<Role> lists(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize,Role role){
        PageInfo<Role> page=iRoleService.lists(pageNum,pageSize,role);
        return page;
    }
    @RequestMapping("dels")
    public boolean del(String rid){
        String[] split = rid.split(",");
        for (String s : split) {
            userRoleMapper.del(Integer.parseInt(s));
            menuRoleMapper.del(Integer.parseInt(s));
            iRoleService.removeById(s);
        }
        return true;
    }
    @RequestMapping("update")
    @Transactional
    public Boolean update(@RequestBody Role role){
        return iRoleService.saveOrUpdate(role);
    }
}

