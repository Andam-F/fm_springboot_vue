package com.andam.fp.mapper;

import com.andam.fp.domain.bean.Award;

public interface AwardMapper {
    int deleteByPrimaryKey(Integer awardId);

    int insert(Award record);

    int insertSelective(Award record);

    Award selectByPrimaryKey(Integer awardId);

    int updateByPrimaryKeySelective(Award record);

    int updateByPrimaryKeyWithBLOBs(Award record);

    int updateByPrimaryKey(Award record);
}