package com.liuzhenzhen.liuzhenzhencfs.mapper;

import com.liuzhenzhen.liuzhenzhencfs.entity.MenuRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzz
 * @since 2020-06-29
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {
    @Delete("delete from menu_role where rid=#{rid}")
    void del(@Param("rid") int parseInt);
    @Select("select * from menu_role where rid=#{rid}")
    List<MenuRole> finds(@Param("rid") Integer rid);
}
