package com.dms.cloud.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuperMapper<T> extends BaseMapper<T> {

    /**
     * 自定义分页查询
     * @param page 分页对象
     * @param wrapper 查询操作wrapper
     * @return
     */
    IPage<T> pageList(Page<T> page, @Param("ew") Wrapper<?> wrapper);

    /**
     * 自定义多表查询
     * @param wrapper 查询操作wrapper
     * @return
     */
    List<EntityMap> getEntityMap(@Param("ew") Wrapper<?> wrapper);

}
