package com.emp.model;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Alvin on 2014/10/10.
 */
public class EmpDAO_Main {
    public static void main(String[] args) {
        String getInputCommand;
        Scanner scanner = new Scanner(System.in);
        getInputCommand = scanner.next();
        System.out.println("請輸入以下命令:");
        System.out.println("create:新增資料");
        System.out.println("update:更新資料");
        System.out.println("delete:刪除資料");
        System.out.println("select:查詢資料");
        System.out.println("select *:查詢所有資料");
        EmpDAO empDAO = new EmpDAO();
        EmpVO empVO = new EmpVO();
        if("create".equals(getInputCommand)){
            empDAO.create(empVO);
            //TODO:Show create result
        }
        if("update".equals(getInputCommand)){
            empDAO.update(empVO);
            //TODO: Show update result
        }
        if ("delete".equals(getInputCommand)){
            System.out.println("請輸入員工編號:");
            String getEmpno = scanner.next();
            if(!getEmpno.matches("[0-9]") && getEmpno.length()!=4){
                System.out.println("員工編號輸入錯誤!");
            }else {
                empDAO.delete(Integer.getInteger(getEmpno));
                //TODO: Show delete result
            }

        }
        if("select".equals(getInputCommand)){
            System.out.println("請輸入員工編號:");
            String getEmpno = scanner.next();
            if(!getEmpno.matches("[0-9]") && getEmpno.length()!=4){
                System.out.println("員工編號輸入錯誤!");
            }else {
                empVO = empDAO.findByPK(Integer.getInteger(getEmpno));
                System.out.println(empVO.getEmpno());
                System.out.println(empVO.getEname());
                System.out.println(empVO.getJob());
                System.out.println(empVO.getHiredate());
                System.out.println(empVO.getSal());
                System.out.println(empVO.getComm());
                System.out.println(empVO.getDeptByDeptno());
            }
        }

        if("select *".equals(getInputCommand)){
            List<EmpVO> list = empDAO.getAll();
            for(EmpVO elementEmpVO:list){
                System.out.println(elementEmpVO.getEmpno());
                System.out.println(elementEmpVO.getEname());
                System.out.println(elementEmpVO.getJob());
                System.out.println(elementEmpVO.getHiredate());
                System.out.println(elementEmpVO.getSal());
                System.out.println(elementEmpVO.getComm());
                System.out.println(elementEmpVO.getDeptByDeptno());
                System.out.println("=================================");
            }
        }

    }
}
