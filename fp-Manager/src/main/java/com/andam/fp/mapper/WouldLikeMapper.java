package com.andam.fp.mapper;

import com.andam.fp.domain.bean.WouldLike;

public interface WouldLikeMapper {
    int deleteByPrimaryKey(Integer wouldLikeId);

    int insert(WouldLike record);

    int insertSelective(WouldLike record);

    WouldLike selectByPrimaryKey(Integer wouldLikeId);

    int updateByPrimaryKeySelective(WouldLike record);

    int updateByPrimaryKeyWithBLOBs(WouldLike record);

    int updateByPrimaryKey(WouldLike record);
}