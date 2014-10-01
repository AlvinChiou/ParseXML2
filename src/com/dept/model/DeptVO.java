package com.dept.model;

import com.com.emp.model.EmpVO;

import java.util.Collection;

/**
 * Created by Alvin on 2014/10/1.
 */
public class DeptVO {
    private Integer deptno;
    private String dname;
    private String loc;
    private Collection<EmpVO> empsByDeptno;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptVO that = (DeptVO) o;

        if (deptno != that.deptno) return false;
        if (dname != null ? !dname.equals(that.dname) : that.dname != null) return false;
        if (loc != null ? !loc.equals(that.loc) : that.loc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptno;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (loc != null ? loc.hashCode() : 0);
        return result;
    }

    public Collection<EmpVO> getEmpsByDeptno() {
        return empsByDeptno;
    }

    public void setEmpsByDeptno(Collection<EmpVO> empsByDeptno) {
        this.empsByDeptno = empsByDeptno;
    }
}
