package com.dept.model;

/**
 * Created by AlvinChiou on 2014/10/14.
 */
public class DeptService {
    private DeptDAO_interface deptDAO;
    public DeptService(){
        deptDAO = new DeptDAO();
    }
    public DeptVO createDept(String dname, String loc){
        DeptVO deptVO = new DeptVO();
        deptVO.setDname(dname);
        deptVO.setLoc(loc);
        deptDAO.create(deptVO);
        return deptVO;
    }
    public DeptVO updateDept(Integer deptno, String dname, String loc){
        DeptVO deptVO = new DeptVO();
        deptVO.setDeptno(deptno);
        deptVO.setDname(dname);
        deptVO.setLoc(loc);
        deptDAO.update(deptVO);
        return deptVO;
    }
}
