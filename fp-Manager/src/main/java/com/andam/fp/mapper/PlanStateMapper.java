package com.andam.fp.mapper;

import com.andam.fp.domain.bean.PlanState;

public interface PlanStateMapper {
    int deleteByPrimaryKey(Integer planStateId);

    int insert(PlanState record);

    int insertSelective(PlanState record);

    PlanState selectByPrimaryKey(Integer planStateId);

    int updateByPrimaryKeySelective(PlanState record);

    int updateByPrimaryKeyWithBLOBs(PlanState record);

    int updateByPrimaryKey(PlanState record);
}