package com.liuzhenzhen.liuzhenzhencfs.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liuzhenzhen.liuzhenzhencfs.entity.Menu;
import com.liuzhenzhen.liuzhenzhencfs.entity.MenuRole;
import com.liuzhenzhen.liuzhenzhencfs.entity.UserRole;
import com.liuzhenzhen.liuzhenzhencfs.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
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
@RequestMapping("/menuRole")
public class MenuRoleController {
    @Autowired
    IMenuRoleService iMenuRoleService;
    @RequestMapping("find")
    public List<MenuRole> find(Integer rid){
        QueryWrapper<MenuRole> queryWrapper=new QueryWrapper<MenuRole>();
        queryWrapper.eq("rid",rid);
        return iMenuRoleService.list(queryWrapper);
    }
    @RequestMapping("update")
    @Transactional
    public boolean update(Integer rid, String mid){
        QueryWrapper<MenuRole> queryWrapper=new QueryWrapper<MenuRole>();
        queryWrapper.eq("rid",rid);
        iMenuRoleService.remove(queryWrapper);
        if(mid!=""){
            String[] split = mid.split(",");
            for (String s : split) {
                MenuRole menuRole=new MenuRole();
                menuRole.setRid(rid);
                menuRole.setMid(Integer.parseInt(s));
                iMenuRoleService.saveOrUpdate(menuRole);
            }
        }
        return true;
    }
}

