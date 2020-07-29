package com.liuzhenzhen.liuzhenzhencfs.controller;


import com.liuzhenzhen.liuzhenzhencfs.entity.Area;
import com.liuzhenzhen.liuzhenzhencfs.mapper.AreaMapper;
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
@RequestMapping("/area")
public class AreaController {
    @Autowired
    AreaMapper areaMapper;
    @RequestMapping("list")
    public List<Area> list(){
        return areaMapper.findpid(1);
    }
}

