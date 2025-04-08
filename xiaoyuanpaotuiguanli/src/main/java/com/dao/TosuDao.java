package com.dao;

import com.entity.TosuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TosuView;

/**
 * 投诉信息 Dao 接口
 *
 * @author 
 */
public interface TosuDao extends BaseMapper<TosuEntity> {

   List<TosuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
