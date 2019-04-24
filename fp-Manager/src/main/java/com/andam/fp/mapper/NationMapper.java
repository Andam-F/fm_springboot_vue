package com.andam.fp.mapper;

import com.andam.fp.domain.bean.Nation;

public interface NationMapper {
    int deleteByPrimaryKey(Integer nationId);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer nationId);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);
}