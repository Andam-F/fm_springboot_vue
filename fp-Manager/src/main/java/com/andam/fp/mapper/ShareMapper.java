package com.andam.fp.mapper;

import com.andam.fp.domain.bean.Share;
import com.andam.fp.domain.bean.ShareWithBLOBs;

public interface ShareMapper {
    int deleteByPrimaryKey(Integer shareId);

    int insert(ShareWithBLOBs record);

    int insertSelective(ShareWithBLOBs record);

    ShareWithBLOBs selectByPrimaryKey(Integer shareId);

    int updateByPrimaryKeySelective(ShareWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ShareWithBLOBs record);

    int updateByPrimaryKey(Share record);
}