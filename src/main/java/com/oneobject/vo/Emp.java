package com.oneobject.vo;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
    private Integer empno;
    private String ename;
    private String job;
    private Date hiredate;
    private Double sal;
    private Double comm;
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public Double getComm() {
        return comm;
    }
}
