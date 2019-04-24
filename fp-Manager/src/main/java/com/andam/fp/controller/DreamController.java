package com.andam.fp.controller;

import com.andam.fp.domain.bean.Dream;
import com.andam.fp.domain.common.ErrorCodeEnum;
import com.andam.fp.domain.common.PageCondition;
import com.andam.fp.domain.common.ResponsePage;
import com.andam.fp.domain.common.ReturnInfo;
import com.andam.fp.domain.vo.request.DreamQuery;
import com.andam.fp.service.DremService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DreamController
 * @Description TODO
 * @Date 2019/4/13 15:33
 * @Created by Andam
 */
@RestController
@RequestMapping("/dream")
@Api(tags = "/dream",description = "Opearations about dream")
public class DreamController {
    @Autowired
    private DremService dremService;

    @ApiOperation("添加梦想")
    @ApiImplicitParam(name = "Dream", value = "梦想实体", required = true, dataType = "Dream")
    @PostMapping("/insertDream")
    public ReturnInfo insertDream(@RequestBody Dream dream) {
        int flag = dremService.insertDream(dream);
        ErrorCodeEnum ee = flag > 0 ? ErrorCodeEnum.SUCCESS:ErrorCodeEnum.FAILED;
        return ReturnInfo.getInstance().setResult(ee).setData(null);
    }

    @ApiOperation("分页查询梦想")
    @ApiImplicitParam(name = "DremQuery", value = "梦想查询实体", dataType = "DreamQuery")
    @PostMapping("/listDreamPage")
    public ReturnInfo<ResponsePage<Dream>> listDreamPage(@RequestBody DreamQuery dreamQuery) {
        PageInfo<Dream> dreamPageInfo = dremService.listDreamPage(dreamQuery);
        ResponsePage<Dream> dreamResponsePage = ResponsePage.getInstance().setPageNum(dreamPageInfo.getPageNum())
                .setPages(dreamPageInfo.getPages())
                .setTotal(dreamPageInfo.getTotal())
                .setList(dreamPageInfo.getList());
        return ReturnInfo.getInstance().setResult(ErrorCodeEnum.SUCCESS).setData(dreamResponsePage);
    }

    @ApiOperation("更新梦想")
    @ApiImplicitParam(name = "Dream", value = "梦想实体", required = true, dataType = "Dream")
    @PostMapping("/updateDream")
    public ReturnInfo updateDream(@RequestBody Dream dream) {
        int flag = dremService.updateDream(dream);
        ErrorCodeEnum ee = flag > 0 ? ErrorCodeEnum.SUCCESS:ErrorCodeEnum.FAILED;
        return ReturnInfo.getInstance().setResult(ee).setData(null);
    }

    @ApiOperation("删除梦想")
    @ApiImplicitParam(name = "Dream", value = "梦想ID", required = true, dataType = "dreamId")
    @PostMapping("/deleteDreamById/{dreamId}")
    public ReturnInfo deleteDreamById(Integer dreamId) {
        int flag = dremService.deleteDream(dreamId);
        ErrorCodeEnum ee = flag > 0 ? ErrorCodeEnum.SUCCESS:ErrorCodeEnum.FAILED;
        return ReturnInfo.getInstance().setResult(ee).setData(null);
    }

}
