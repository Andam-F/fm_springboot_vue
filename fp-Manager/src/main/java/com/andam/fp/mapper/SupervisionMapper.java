package com.andam.fp.mapper;

import com.andam.fp.domain.bean.Supervision;

public interface SupervisionMapper {
    int deleteByPrimaryKey(Integer supervisionId);

    int insert(Supervision record);

    int insertSelective(Supervision record);

    Supervision selectByPrimaryKey(Integer supervisionId);

    int updateByPrimaryKeySelective(Supervision record);

    int updateByPrimaryKey(Supervision record);
}