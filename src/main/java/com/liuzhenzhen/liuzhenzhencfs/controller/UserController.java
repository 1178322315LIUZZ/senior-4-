package com.liuzhenzhen.liuzhenzhencfs.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import com.liuzhenzhen.liuzhenzhencfs.entity.User;
import com.liuzhenzhen.liuzhenzhencfs.mapper.AreaMapper;
import com.liuzhenzhen.liuzhenzhencfs.mapper.UserRoleMapper;
import com.liuzhenzhen.liuzhenzhencfs.service.IUserRoleService;
import com.liuzhenzhen.liuzhenzhencfs.service.IUserService;
import com.starter.upload.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

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
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService iUserService;
    @Autowired
    UploadService uploadService;
    @Autowired
    UserRoleMapper userRoleMapper;
    @Autowired
    AreaMapper areaMapper;
    @RequestMapping("list")
    public PageInfo<User> list(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "3") int size,User user){
        PageInfo<User> page=iUserService.lists(user,pageNum,size);
        return page;
    }
    @RequestMapping("add")
    @Transactional
    public boolean add(@RequestBody User user){
        return iUserService.saveOrUpdate(user);
    }
    @RequestMapping("upload")
    public String upload(MultipartFile file) throws Exception {
        return "http://localhost/img/"+uploadService.upload(file);
    }
    @RequestMapping("find")
    public User find(Integer id){
        return iUserService.find(id);
    }
    @RequestMapping("update")
    @Transactional
    public boolean update(@RequestBody User user){
        return iUserService.saveOrUpdate(user);
    }
    @RequestMapping("dels")
    public boolean del(String id){
        String[] split = id.split(",");
        for (String s : split) {
            iUserService.removeById(s);
            userRoleMapper.removes(Integer.parseInt(s));
        }
        return true;
    }
    @RequestMapping("finds")
    public User finds(@RequestBody User user){
        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.eq("username",user.getUsername());
        queryWrapper.eq("password",user.getPassword());
        return iUserService.getOne(queryWrapper);
    }








}

