package com.cheer.mybatis.mapper;

import com.cheer.mybatis.demo.Dept;

public interface DeptMapper {

    /**
     * 联合查询
     * @param deptno
     * @return
     */
    Dept getDeptByno(Integer deptno);

    /**
     * 集合查询
     * @param deptno
     * @return
     */
    Dept getDeptBynoPlus(Integer deptno);

    /**
     * 分步查询
     * @param deptno
     * @return
     */
    Dept getDeptBynoStep(Integer deptno);
}
