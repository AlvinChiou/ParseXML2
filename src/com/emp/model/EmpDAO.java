package com.emp.model;

import com.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

/**
 * Created by AlvinChiou on 2014/10/2.
 */
public class EmpDAO implements EmpDAO_interface{
    private final String GET_ALL_STMT = "FROM EmpVO ORDER BY empno";
    Session session = null;
    @Override
    public void create(EmpVO empVO) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.saveOrUpdate(empVO);
            session.getTransaction().commit();
        }catch (RuntimeException e){
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public void update(EmpVO empVO) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.saveOrUpdate(empVO);
            session.getTransaction().commit();
        }catch (RuntimeException e){
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public void delete(Integer empno) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        EmpVO empVO = null;
        try {
            session.beginTransaction();
            empVO = (EmpVO)session.get(EmpVO.class, empno);
            session.delete(empVO);
            session.getTransaction().commit();
        }catch (RuntimeException e){
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public EmpVO findByPK(Integer empno) {
        return null;
    }

    @Override
    public List<EmpVO> getAll() {
        return null;
    }

    @Override
    public List<EmpVO> getAllByMap(Map<String, String[]> map) {
        return null;
    }
}
