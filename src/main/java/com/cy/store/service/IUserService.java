package com.cy.store.service;

import com.cy.store.entity.User;

/**
 * 用户模块业务层接口
 */
public interface IUserService {
    //用来完成注册的功能,参数是User类型的
    void reg(User user);

    /**
     * 用户登录功能
     * @param username
     * @param password
     * @return 当前匹配的用户数据，如果没有则返回null
     */
    User login(String username,String password);

   void changePassword(Integer uid,String username,
                       String oldPassword,String newPassword);

    /**
     * 根据用户的id查询用户的数据
     * @param uid
     * @return
     */
   User getByUid(Integer uid);

    /**
     * 更新用户的数据
     * @param uid
     * @param username
     * @param user
     */
   void changeInfo(Integer uid,String username,User user);

    /**
     * 用来修改用户的头像
     * @param uid
     * @param avatar 用户头像
     * @param username 用户的名字
     */
    void changeAvatar(Integer uid,String avatar,String username);



}
