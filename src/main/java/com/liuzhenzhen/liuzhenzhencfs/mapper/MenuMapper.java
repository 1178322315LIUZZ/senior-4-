package com.liuzhenzhen.liuzhenzhencfs.mapper;

import com.liuzhenzhen.liuzhenzhencfs.entity.Menu;
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
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> findbypid(int i);

    List<Menu> finds(String username);
}
