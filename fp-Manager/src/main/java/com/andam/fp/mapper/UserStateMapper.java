package com.andam.fp.mapper;

import com.andam.fp.domain.bean.UserState;

public interface UserStateMapper {
    int deleteByPrimaryKey(Integer usId);

    int insert(UserState record);

    int insertSelective(UserState record);

    UserState selectByPrimaryKey(Integer usId);

    int updateByPrimaryKeySelective(UserState record);

    int updateByPrimaryKey(UserState record);
}