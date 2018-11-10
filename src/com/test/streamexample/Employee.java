/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.streamexample;

/**
 *
 * @author Prabhath
 */
class Employee {
    
    private int empNo;
    private String empName;
    private int empSalary;

    public Employee(int empNo, String empName, int empSalary) {
        this.empName = empName;
        this.empNo = empNo;
        this.empSalary = empSalary;
    }

    /**
     * @return the empNo
     */
    public int getEmpNo() {
        return empNo;
    }

    /**
     * @param empNo the empNo to set
     */
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    /**
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return the empSalary
     */
    public int getEmpSalary() {
        return empSalary;
    }

    /**
     * @param empSalary the empSalary to set
     */
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
    
}
