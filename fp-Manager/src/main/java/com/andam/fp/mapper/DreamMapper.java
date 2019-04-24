package com.andam.fp.mapper;

import com.andam.fp.domain.bean.Dream;
import com.andam.fp.domain.vo.request.DreamQuery;

import java.util.List;

public interface DreamMapper {

    int insertDream(Dream record);

    List<Dream> listDreamPage(DreamQuery dreamQuery);

    int updateDream(Dream record);

    int deleteDreamById(Integer dreamId);
}