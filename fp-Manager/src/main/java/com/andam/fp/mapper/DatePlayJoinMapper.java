package com.andam.fp.mapper;

import com.andam.fp.domain.bean.DatePlayJoin;

/**
 * @Classname DatePlayJoinMapper
 * @Description TODO
 * @Date 2019/4/9 9:59
 * @Created by Andam
 */
public interface DatePlayJoinMapper {
    int deleteByPrimaryKey(Integer datePlayJoinId);

    int insert(DatePlayJoin record);

    int insertSelective(DatePlayJoin record);

    DatePlayJoin selectByPrimaryKey(Integer datePlayJoinId);

    int updateByPrimaryKeySelective(DatePlayJoin record);

    int updateByPrimaryKey(DatePlayJoin record);
}
