package com.andam.fp.mapper;

import com.andam.fp.domain.bean.Plan;

public interface PlanMapper {
    int deleteByPrimaryKey(Integer planId);

    int insert(Plan record);

    int insertSelective(Plan record);

    Plan selectByPrimaryKey(Integer planId);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKey(Plan record);
}