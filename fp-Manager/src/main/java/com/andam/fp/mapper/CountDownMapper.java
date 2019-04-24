package com.andam.fp.mapper;

import com.andam.fp.domain.bean.CountDown;

public interface CountDownMapper {
    int deleteByPrimaryKey(Integer countDownId);

    int insert(CountDown record);

    int insertSelective(CountDown record);

    CountDown selectByPrimaryKey(Integer countDownId);

    int updateByPrimaryKeySelective(CountDown record);

    int updateByPrimaryKey(CountDown record);
}