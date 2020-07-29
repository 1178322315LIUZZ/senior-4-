package com.liuzhenzhen.liuzhenzhencfs.mapper;

import com.liuzhenzhen.liuzhenzhencfs.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> lists(Role role);
}
