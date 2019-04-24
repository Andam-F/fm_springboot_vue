package com.andam.fp.service;

import com.andam.fp.domain.bean.User;
import com.andam.fp.domain.vo.request.UserQuery;
import com.andam.fp.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname UserServcie
 * @Description TODO
 * @Date 2019/4/3 17:03
 * @Created by Andam
 */
@Service
public class UserServcie {
    @Autowired
    private UserMapper userMapper;

    public PageInfo<User> listUserPage(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPage(),userQuery.getSize());
        List<User> userList = userMapper.listUserPage(userQuery);
        return new PageInfo<>(userList);
    }

    public User getUserById(Integer id) {
       return userMapper.selectUserById(id);
    }

    public int addUser(User user) {
        return userMapper.insertUser(user);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public int deleteUser(Integer userId){
        return userMapper.deleteUserById(userId);
    }

    public int deleteUserBatch(List<Integer> userIdList){
        return userMapper.deleteUserBatch(userIdList);
    }
}
