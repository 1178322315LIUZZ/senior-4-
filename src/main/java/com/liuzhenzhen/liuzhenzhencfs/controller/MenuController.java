package com.liuzhenzhen.liuzhenzhencfs.controller;


import com.liuzhenzhen.liuzhenzhencfs.entity.Menu;
import com.liuzhenzhen.liuzhenzhencfs.service.IMenuRoleService;
import com.liuzhenzhen.liuzhenzhencfs.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    IMenuService iMenuRoleService;
    @RequestMapping("list")
    public List<Menu> list(){
        return iMenuRoleService.findbypid(1);
    }
    @RequestMapping("find")
    public List<Menu> list(String username){
        return iMenuRoleService.find(username);
    }
}

