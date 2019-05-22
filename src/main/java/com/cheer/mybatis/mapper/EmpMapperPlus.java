package com.cheer.mybatis.mapper;

import com.cheer.mybatis.demo.Emp;

import java.util.List;

public interface EmpMapperPlus {

    Emp getemp(Integer empno);

    //查询部门和员工表信息
    Emp getempanddept(Integer empno);

    //分布查询
    Emp getempStep(Integer empno);

    List<Emp> getEmpByDeptID(Integer deptno);
}
