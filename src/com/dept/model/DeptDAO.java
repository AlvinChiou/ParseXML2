package com.dept.model;

import com.emp.model.EmpVO;
import com.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.context.CurrentSessionContext;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Set;

/**
 * Created by AlvinChiou on 2014/10/2.
 */
public class DeptDAO implements DeptDAO_interface{
    private final String GET_ALL_STMT = "FROM DeptVO ORDER BY deptno";
    SessionFactory sessionFactory = null;
    @Override
    public void create(DeptVO deptVO) {
        sessionFactory = HibernateUtil.getSessionFactory();
        try {
            /**
            * Note:使用getCurrentSession()操作當前的session時，在commit之後
            * 不得將session關閉。
            * */
            sessionFactory.getCurrentSession().beginTransaction();
            //資料庫操作邏輯寫在這裡...

            sessionFactory.getCurrentSession().getTransaction().commit();
        }catch (RuntimeException e){
            //一旦發生例外事件執行rollback
            sessionFactory.getCurrentSession().getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public void update(DeptVO deptVO) {
        sessionFactory = HibernateUtil.getSessionFactory();
        try{
            sessionFactory.getCurrentSession().beginTransaction();

            sessionFactory.getCurrentSession().getTransaction().commit();
        }catch (RuntimeException e){
            sessionFactory.getCurrentSession().getTransaction().rollback();
            throw e;
        }
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
