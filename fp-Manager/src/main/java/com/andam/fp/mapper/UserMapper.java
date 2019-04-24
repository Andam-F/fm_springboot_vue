package com.andam.fp.mapper;

import com.andam.fp.domain.bean.User;
import com.andam.fp.domain.vo.request.UserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> listUserPage(UserQuery userQuery);
    User selectUserById(Integer id);
    int insertUser(User record);
    int updateUser(User user);
    int deleteUserById(Integer userId);
    int deleteUserBatch(@Param("userIdList") List<Integer> userIdList);
}