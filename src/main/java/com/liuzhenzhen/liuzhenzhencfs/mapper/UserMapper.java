package com.liuzhenzhen.liuzhenzhencfs.mapper;

import com.liuzhenzhen.liuzhenzhencfs.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> lists(User user);

    User find(@RequestParam("id") Integer id);
}
