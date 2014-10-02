package com.dept.model;

import com.emp.model.EmpVO;

import java.util.List;
import java.util.Set;

/**
 * Created by AlvinChiou on 2014/10/2.
 */
public interface DeptDAO_interface {
    public void create(DeptVO deptVO);
    public void update(DeptVO deptVO);
    public void delete(Integer deptno);
    public DeptVO findByPK(Integer deptno);
    public List<DeptVO>getAll();
    public Set<EmpVO>getEmpsByDeptno(Integer deptno);
}
