package com.lee.demo.dao;

import com.lee.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from tb_user")
    List<User> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findByid(String id);

    /**
     * 添加用户
     * @param user
     */
    void add(User user);

    /**
     * 修改用户
     * @param user
     */
    void update(User user);
}
