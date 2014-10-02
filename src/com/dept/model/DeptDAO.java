package com.dept.model;

import com.emp.model.EmpVO;

import java.util.List;
import java.util.Set;

/**
 * Created by AlvinChiou on 2014/10/2.
 */
public class DeptDAO implements DeptDAO_interface{
    @Override
    public void create(DeptVO deptVO) {

    }

    @Override
    public void update(DeptVO deptVO) {

    }

    @Override
    public void delete(Integer deptno) {

    }

    @Override
    public DeptVO findByPK(Integer deptno) {
        return null;
    }

    @Override
    public List<DeptVO> getAll() {
        return null;
    }

    @Override
    public Set<EmpVO> getEmpsByDeptno(Integer deptno) {
        return null;
    }
}
