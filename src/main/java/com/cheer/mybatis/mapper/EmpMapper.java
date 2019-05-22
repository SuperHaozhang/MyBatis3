package com.cheer.mybatis.mapper;

import com.cheer.mybatis.demo.Emp;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface EmpMapper {
    Emp getemp(Integer empno);



    //查询List集合
    List<Emp> getEmpbyNameLike(String ename);

    //返回map集合，key是列名，值是对应的值
    Map<String,Object> getEmpByempnoReturnMap(Integer empno);

    //返回map集合，key是主键，值是对应的值
    //告诉mybatis封装哪个属性作为主键
    @MapKey("empno")
    Map<Integer,Emp> getEmpByEnameReturnMap(String ename);

    int insert(Emp e);

    int update(Emp e);

    int delete(Integer empno);


}
