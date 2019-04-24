package com.andam.fp.mapper;

import com.andam.fp.domain.bean.PlanResult;

public interface PlanResultMapper {
    int deleteByPrimaryKey(Integer punishmentResultId);

    int insert(PlanResult record);

    int insertSelective(PlanResult record);

    PlanResult selectByPrimaryKey(Integer punishmentResultId);

    int updateByPrimaryKeySelective(PlanResult record);

    int updateByPrimaryKey(PlanResult record);
}