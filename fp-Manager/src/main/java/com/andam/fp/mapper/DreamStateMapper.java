package com.andam.fp.mapper;

import com.andam.fp.domain.bean.DreamState;

public interface DreamStateMapper {
    int deleteByPrimaryKey(Integer dreamStateId);

    int insert(DreamState record);

    int insertSelective(DreamState record);

    DreamState selectByPrimaryKey(Integer dreamStateId);

    int updateByPrimaryKeySelective(DreamState record);

    int updateByPrimaryKey(DreamState record);
}