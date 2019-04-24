package com.andam.fp.mapper;

import com.andam.fp.domain.bean.Support;

public interface SupportMapper {
    int deleteByPrimaryKey(Integer supportId);

    int insert(Support record);

    int insertSelective(Support record);

    Support selectByPrimaryKey(Integer supportId);

    int updateByPrimaryKeySelective(Support record);

    int updateByPrimaryKeyWithBLOBs(Support record);

    int updateByPrimaryKey(Support record);
}