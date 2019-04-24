package com.andam.fp.mapper;

import com.andam.fp.domain.bean.Punishment;

public interface PunishmentMapper {
    int deleteByPrimaryKey(Integer punishmentId);

    int insert(Punishment record);

    int insertSelective(Punishment record);

    Punishment selectByPrimaryKey(Integer punishmentId);

    int updateByPrimaryKeySelective(Punishment record);

    int updateByPrimaryKeyWithBLOBs(Punishment record);

    int updateByPrimaryKey(Punishment record);
}