package com.dept.model;

import com.emp.model.EmpVO;
import com.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.context.CurrentSessionContext;
import org.hibernate.SessionFactory;

import javax.management.Query;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Created by AlvinChiou on 2014/10/2.
 */
public class DeptDAO implements DeptDAO_interface{
    private final String GET_ALL_STMT = "FROM DeptVO ORDER BY deptno";

    Session session = null;
    @Override
    public void create(DeptVO deptVO) {
        /**
         * Note:使用getCurrentSession()操作當前的session時，在commit之後
         * 不得將session關閉。
         * */
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            //資料庫操作邏輯寫在這裡...
            session.saveOrUpdate(deptVO);
            session.getTransaction().commit();
        }catch (RuntimeException e){
            //一旦發生例外事件執行rollback
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public void update(DeptVO deptVO) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.saveOrUpdate(deptVO);
            session.getTransaction().commit();
        }catch (RuntimeException e){
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public void delete(Integer deptno) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            DeptVO deptVO = (DeptVO)session.get(DeptVO.class, deptno);
            session.delete(deptVO);
            session.getTransaction().commit();
        }catch (RuntimeException e){
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public DeptVO findByPK(Integer deptno) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        DeptVO deptVO = null;
        try{
            session.beginTransaction();
            deptVO = (DeptVO)session.get(DeptVO.class,deptno);
            session.getTransaction().commit();
        }catch(RuntimeException e){
            session.getTransaction().rollback();
        }
        return deptVO;
    }

    @Override
    public List<DeptVO> getAll() {
        List<DeptVO> listDeptVO = null;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            org.hibernate.Query query = session.createQuery(GET_ALL_STMT);
            /**
             * query.list()會直接回傳以list型態的查詢結果
             */
            listDeptVO = query.list();
            session.getTransaction().commit();
        }catch (RuntimeException e){
            session.getTransaction().rollback();
            throw e;
        }

        return listDeptVO;
    }

    @Override
    public Set<EmpVO> getEmpsByDeptno(Integer deptno) {
        return null;
    }
}
