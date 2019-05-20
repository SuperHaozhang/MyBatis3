package com.cheer.mybatis.MapperImp;

import com.cheer.mybatis.demo.Emp;
import com.cheer.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    private static final Logger LOGGER = LogManager.getLogger(Test01.class);
    @Test
    public void  test01(){

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session =null;
            try {
                //1、获取SqlSessionFactory
                inputStream = Resources.getResourceAsStream(resource);
                SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

                //2.获取Sqlsession对象
                session = sqlSessionFactory.openSession();
                EmpMapper empMapper = session.getMapper(EmpMapper.class);
                Emp emp = empMapper.getemp(7788);
                LOGGER.info(emp);
                //System.out.println(emp);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                session.close();
                try {
                    if (inputStream!=null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
}
