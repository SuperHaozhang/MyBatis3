package com.cheer.mybatis.demo;

import java.sql.Date;
public class Emp {
    private Integer empno;
    private String ename;
    private Integer mgr;
    private String job;
    private java.sql.Date hiredate;
    private Double sal;
    private Double com;
    private Dept deptno;



    public Double getCom(){
        return com;
    }
    public String getEname(){
        return ename;
    }
    public Integer getMgr(){
        return mgr;
    }
    public Integer getEmpno(){
        return empno;
    }
    public String getJob(){
        return job;
    }
    public java.sql.Date getHiredate(){
        return hiredate;
    }
    public Dept getDeptno(){
        return deptno;
    }
    public Double getSal(){
        return sal;
    }
    public void setCom(Double com){
        this.com=com;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public void setMgr(Integer mgr){
        this.mgr=mgr;
    }
    public void setEmpno(Integer empno){
        this.empno=empno;
    }
    public void setJob(String job){
        this.job=job;
    }
    public void setHiredate(java.sql.Date hiredate){
        this.hiredate=hiredate;
    }
    public void setDeptno(Dept deptno){
        this.deptno=deptno;
    }
    public void setSal(Double sal){
        this.sal=sal;
    }
    public Emp(){}

    public Emp(Integer empno, String ename, Integer mgr, String job, Date hiredate, Double sal, Double com, Dept deptno) {
        this.empno = empno;
        this.ename = ename;
        this.mgr = mgr;
        this.job = job;
        this.hiredate = hiredate;
        this.sal = sal;
        this.com = com;
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", mgr=" + mgr +
                ", job='" + job + '\'' +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", com=" + com +
                ", deptno=" + deptno +
                '}';
    }
}
