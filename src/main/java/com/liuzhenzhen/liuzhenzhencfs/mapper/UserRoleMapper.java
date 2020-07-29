package com.liuzhenzhen.liuzhenzhencfs.mapper;

import com.liuzhenzhen.liuzhenzhencfs.entity.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {
    @Delete("delete from user_role where uid=#{uid}")
    void removes(@Param("uid") Integer uid);
    @Delete("delete from user_role where rid=#{rid}")
    void del(@Param("rid") int parseInt);
}
