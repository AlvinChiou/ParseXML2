package com.emp.model;

import java.util.List;
import java.util.Map;

/**
 * Created by AlvinChiou on 2014/10/2.
 */
public interface EmpDAO_interface {
    public void create(EmpVO empVO);
    public void update(EmpVO empVO);
    public void delete(Integer empno);
    public EmpVO findByPK(Integer empno);
    public List<EmpVO>getAll();
    public List<EmpVO>getAllByMap(Map<String, String[]>map);
}
