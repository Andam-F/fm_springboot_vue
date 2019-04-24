package com.andam.fp.mapper;

import com.andam.fp.domain.bean.InitivatriveStudy;

public interface InitivatriveStudyMapper {
    int deleteByPrimaryKey(Integer initiativeStudyId);

    int insert(InitivatriveStudy record);

    int insertSelective(InitivatriveStudy record);

    InitivatriveStudy selectByPrimaryKey(Integer initiativeStudyId);

    int updateByPrimaryKeySelective(InitivatriveStudy record);

    int updateByPrimaryKeyWithBLOBs(InitivatriveStudy record);

    int updateByPrimaryKey(InitivatriveStudy record);
}