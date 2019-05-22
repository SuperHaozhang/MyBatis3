package com.cheer.mybatis.MapperImp;

import com.cheer.mybatis.demo.Dept;
import com.cheer.mybatis.demo.Emp;
import com.cheer.mybatis.mapper.DeptMapper;
import com.cheer.mybatis.mapper.EmpMapperPlus;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test02 {
    private static final Logger LOGGER = LogManager.getLogger(Test01.class);
    @Test
    public void test01(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session =null;
        try {
            //1、获取SqlSessionFactory
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //2.获取Sqlsession对象
            session = sqlSessionFactory.openSession();
            EmpMapperPlus empMapper = session.getMapper(EmpMapperPlus.class);
            //Emp e = empMapper.getemp(7788);
            //Emp e = empMapper.getempanddept(7788);
            //Emp e = empMapper.getempanddept(7788);
            Emp e = empMapper.getempStep(7788);

            System.out.println(e);
            System.out.println(e.getEmpno());
            LOGGER.info(e);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                if (session!=null) {
                    session.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void test02(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session =null;
        try {
            //1、获取SqlSessionFactory
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //2.获取Sqlsession对象
            session = sqlSessionFactory.openSession();
            DeptMapper empMapper = session.getMapper(DeptMapper.class);
            //Dept e = empMapper.getDeptBynoPlus(20);
            Dept e = empMapper.getDeptBynoStep(20);
            System.out.println(e);
            System.out.println(e.getEmps());
            LOGGER.info(e);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                if (session!=null) {
                    session.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
