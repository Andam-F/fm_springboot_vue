package com.andam.fp.controller;

import com.andam.fp.domain.common.ErrorCodeEnum;
import com.andam.fp.domain.common.ResponsePage;
import com.andam.fp.domain.common.ReturnInfo;
import com.andam.fp.domain.bean.User;
import com.andam.fp.domain.vo.request.UserQuery;
import com.andam.fp.service.UserServcie;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/4/3 17:06
 * @Created by Andam
 */
@RestController
@RequestMapping("/user")
@Api(tags = "/user",description = "Operations about user")
public class UserController {
    @Autowired
    private UserServcie userServcie;

    @ApiOperation("find user by id")
    @ApiImplicitParam(name = "userId",value = "用户ID",required = true,dataType = "Integer")
    @GetMapping(value = "/getUserById/{userId}")
    public ReturnInfo getUserById (Integer userId) {
        User user = userServcie.getUserById(userId);
        return ReturnInfo.getInstance().setResult(ErrorCodeEnum.SUCCESS).setData(user);
    }

    @ApiOperation("分页查询用户")
    @ApiImplicitParam(name = "UserQuery",value = "用户查询实体")
    @PostMapping(value = "/listUserPage")
    public ReturnInfo<ResponsePage<User>> listUsertPage(@RequestBody UserQuery userQuery) {
        PageInfo<User> pageInfo = userServcie.listUserPage(userQuery);
        ResponsePage<User> userResponsePage = ResponsePage.getInstance().setPageNum(pageInfo.getPageNum())
                .setPages(pageInfo.getPages())
                .setTotal(pageInfo.getTotal())
                .setList(pageInfo.getList());
        return ReturnInfo.getInstance().setResult(ErrorCodeEnum.SUCCESS).setData(userResponsePage);
    }

    @ApiOperation("添加用户")
    @ApiImplicitParam(name = "User", value = "用户实体",required = true,dataType = "User")
    @PostMapping(value = "/addUser")
    public ReturnInfo addUser(@RequestBody User user) {
        int flag = userServcie.addUser(user);
        ErrorCodeEnum ee = flag > 0 ?ErrorCodeEnum.SUCCESS:ErrorCodeEnum.FAILED;
        return ReturnInfo.getInstance().setResult(ee).setData(null);
    }

    @ApiOperation("更新用户")
    @ApiImplicitParam(name = "User",value = "用户实体",required = true,dataType = "User")
    @PutMapping("/updateUser")
    public ReturnInfo updateUser(@RequestBody User user) {
        int flag = userServcie.updateUser(user);
        ErrorCodeEnum ee = flag > 0 ?ErrorCodeEnum.SUCCESS:ErrorCodeEnum.FAILED;
        return ReturnInfo.getInstance().setResult(ee).setData(null);
    }

    @ApiOperation("删除用户")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true,dataType = "Integer")
    @DeleteMapping("/deleteUser/{userId}")
    public ReturnInfo deleteUserById(Integer userId) {
        int flag = userServcie.deleteUser(userId);
        ErrorCodeEnum ee = flag > 0 ?ErrorCodeEnum.SUCCESS:ErrorCodeEnum.FAILED;
        return ReturnInfo.getInstance().setResult(ee).setData(null);
    }

    /**
     * 批量删除传list 或者Array
     * @param userIdList
     * @return
     */
    @ApiOperation("批量删除用户")
    @ApiImplicitParam(name = "userIdList", value = "批量删除用户的id集合", required = true, dataType = "list")
    @DeleteMapping("/deleteUserBatch")
    public ReturnInfo deleteUserBatch(@RequestParam List<Integer> userIdList) {
        int flag = userServcie.deleteUserBatch(userIdList);
        ErrorCodeEnum ee = flag > 0 ? ErrorCodeEnum.SUCCESS:ErrorCodeEnum.FAILED;
        return ReturnInfo.getInstance().setResult(ee).setData(null);
    }

}
