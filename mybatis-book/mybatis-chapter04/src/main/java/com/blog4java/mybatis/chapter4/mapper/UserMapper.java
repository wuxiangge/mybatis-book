package com.blog4java.mybatis.chapter4.mapper;

import com.blog4java.mybatis.chapter4.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    UserEntity getUserByUserId(@Param("userId") Integer userId);

    List<UserEntity> getUserByEntity(UserEntity user);

    List<UserEntity> listAllUser();

    @Select("select * from user where id=#{userId,jdbcType=INTEGER}")
    UserEntity getUserById(@Param("userId") String userId);


    UserEntity getUserByPhone(@Param("phone") String phone);


}