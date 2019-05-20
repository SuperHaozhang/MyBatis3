package com.cheer.mybatis.demo;

public class Emp {
    private Double com;
    private String ename;
    private Integer mgr;
    private Integer empno;
    private String job;
    private java.sql.Date hiredate;
    private Integer deptno;
    private Double sal;


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
    public Integer getDeptno(){
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
    public void setDeptno(Integer deptno){
        this.deptno=deptno;
    }
    public void setSal(Double sal){
        this.sal=sal;
    }
    @Override
    public String toString() {
        return "EmpMapper [com=" + com + ", ename=" + ename + ", mgr=" + mgr + ", empno=" + empno + ", job=" + job
                + ", hiredate=" + hiredate + ", deptno=" + deptno + ", sal=" + sal + "]";
    }
}
