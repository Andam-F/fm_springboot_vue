package com.andam.fp.mapper;

import com.andam.fp.domain.bean.DatePlay;

/**
 * @Classname DatePlayMapper
 * @Description TODO
 * @Date 2019/4/9 9:59
 * @Created by Andam
 */
public interface DatePlayMapper {
    int deleteByPrimaryKey(Integer datePlayId);

    int insert(DatePlay record);

    int insertSelective(DatePlay record);

    DatePlay selectByPrimaryKey(Integer datePlayId);

    int updateByPrimaryKeySelective(DatePlay record);

    int updateByPrimaryKeyWithBLOBs(DatePlay record);

    int updateByPrimaryKey(DatePlay record);
}
