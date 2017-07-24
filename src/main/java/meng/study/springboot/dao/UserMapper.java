package meng.study.springboot.dao;

import meng.study.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by mengzhang6 on 2017/7/21.
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user ORDER BY id ")
    List<User> getUserList();

    @Select("SELECT * FROM user WHERE id = #{id} ")
    User getUserById(@Param("id") String id);

}
