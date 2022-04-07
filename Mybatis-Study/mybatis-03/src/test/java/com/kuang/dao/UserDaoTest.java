package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class UserDaoTest {
    @Test
    public void test() {
        MybatisUtils.getSqlSession()

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);

            System.out.println(user);

        sqlSession.close();
    }
//    select * from user where id = #{id};
//    类型处理器
//    select id,name,pwd as password from mybatis.user where id = #{id};
}
