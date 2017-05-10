package com.test;

import com.test.bean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Test {
    public static void main(String[]strings){
        try {
            findUserByIdTest();
        }catch (IOException e){

        }
    }
    public static void findUserByIdTest() throws IOException {
        // mybatis配置文件
        String resource = "mybatis-config.xml";
        // 得到配置文件流
        InputStream inputStream =  Resources.getResourceAsStream(resource);
        //创建会话工厂，传入mybatis配置文件的信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 通过SqlSession操作数据库
        // 第一个参数：映射文件中statement的id，等于=namespace+"."+statement的id
        // 第二个参数：指定和映射文件中所匹配的parameterType类型的参数
        // sqlSession.selectOne结果 是与映射文件中所匹配的resultType类型的对象
        // selectOne查询出一条记录
        Student user = sqlSession.selectOne("findUserByName", "hello");

        System.out.println(user.getId()+","+user.getName()+","+user.getScore());

        // 释放资源
        sqlSession.close();

    }
}
