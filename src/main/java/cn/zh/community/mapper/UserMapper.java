package cn.zh.community.mapper;

import cn.zh.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: zhanghuan
 * @Date: 2019/10/9 16:39
 * @Description: 对数据库进行数据持久化操作
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate}, #{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select *from user where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select *from user where id = #{id}")
    User findById(@Param("id")Integer creator);
}
