package com.liuzhenzhen.liuzhenzhencfs.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liuzhenzhen.liuzhenzhencfs.entity.UserRole;
import com.liuzhenzhen.liuzhenzhencfs.mapper.UserRoleMapper;
import com.liuzhenzhen.liuzhenzhencfs.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
@RestController
@RequestMapping("/userRole")
public class UserRoleController {
    @Autowired
    IUserRoleService iUserRoleService;
    @Autowired
    UserRoleMapper userRoleMapper;
    @RequestMapping("update")
    @Transactional
    public boolean update(Integer uid, String rids){
        userRoleMapper.removes(uid);
        String[] split = rids.split(",");
        for (String s : split) {
            UserRole userRole=new UserRole();
            userRole.setUid(uid);
            userRole.setRid(Integer.parseInt(s));
            userRoleMapper.insert(userRole);
        }
        return true;
    }
}

