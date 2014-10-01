package com.emp.model;

import com.dept.model.DeptVO;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Alvin on 2014/10/1.
 */
public class EmpVO implements Serializable{
    private Integer empno;
    private String ename;
    private String job;
    private Date hiredate;
    private Integer sal;
    private Integer comm;
    private DeptVO deptByDeptno;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpVO empEntity = (EmpVO) o;

        if (empno != empEntity.empno) return false;
        if (comm != null ? !comm.equals(empEntity.comm) : empEntity.comm != null) return false;
        if (ename != null ? !ename.equals(empEntity.ename) : empEntity.ename != null) return false;
        if (hiredate != null ? !hiredate.equals(empEntity.hiredate) : empEntity.hiredate != null) return false;
        if (job != null ? !job.equals(empEntity.job) : empEntity.job != null) return false;
        if (sal != null ? !sal.equals(empEntity.sal) : empEntity.sal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empno;
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (sal != null ? sal.hashCode() : 0);
        result = 31 * result + (comm != null ? comm.hashCode() : 0);
        return result;
    }

    public DeptVO getDeptByDeptno() {
        return deptByDeptno;
    }

    public void setDeptByDeptno(DeptVO deptByDeptno) {
        this.deptByDeptno = deptByDeptno;
    }
}
