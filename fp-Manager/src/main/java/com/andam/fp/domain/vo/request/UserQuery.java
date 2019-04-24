package com.andam.fp.domain.vo.request;

import com.andam.fp.domain.common.PageCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Classname 用户查询实体
 * @Description TODO
 * @Date 2019/4/12 18:26
 * @Created by Andam
 */
@ApiModel(value = "UserQuery",description = "用户查询实体")
@Data
public class UserQuery extends PageCondition implements Serializable {
    private static final long serialVersionUID = -254156040461774340L;
    @ApiModelProperty("用户真实姓名")
    private String userName;
    @ApiModelProperty("用户登录账号")
    private String loginId;
}
