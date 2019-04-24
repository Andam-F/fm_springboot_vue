package com.andam.fp.service;

import com.andam.fp.domain.bean.Dream;
import com.andam.fp.domain.vo.request.DreamQuery;
import com.andam.fp.mapper.DreamMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname DremService
 * @Description TODO
 * @Date 2019/4/13 15:30
 * @Created by Andam
 */
@Service
public class DremService {
    @Autowired
    private DreamMapper dreamMapper;

    public int insertDream(Dream dream) {
        return dreamMapper.insertDream(dream);
    }

    public PageInfo<Dream> listDreamPage(DreamQuery dreamQuery) {
        PageHelper.startPage(dreamQuery.getPage(),dreamQuery.getSize());
        List<Dream> dreamList = dreamMapper.listDreamPage(dreamQuery);
        return new PageInfo<>(dreamList);
    }

    public int updateDream(Dream dream) {
        return dreamMapper.updateDream(dream);
    }

    public int deleteDream(Integer dreamId) {
        return dreamMapper.deleteDreamById(dreamId);
    }
}
