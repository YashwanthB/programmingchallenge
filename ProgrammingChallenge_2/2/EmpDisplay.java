package com.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class EmpDisplay {
	
	    public static void main(String[] args) {
	        //1. Get Employee
	        getEmployee();
	    }
	 
	    private static void getEmployee() {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter the EmployeeID:");
	         
	        try {
	            int employeeId = Integer.parseInt(br.readLine());
	            EmployeeDAO empDao = new EmployeeDAO();
	            Employee employee = empDao.getEmployee(employeeId);
	            if(employee != null)
	                displayEmployee(employee);
	            else
	                System.out.println("No Employee with Id: " + employeeId);
	        } catch (NumberFormatException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	    private static void displayEmployee(Employee employee) {
	        System.out.println("Employee ID:" + employee.getId());
	        System.out.println("Employee Name:" + employee.getName());
	        System.out.println("Employee Phone number:" + employee.getPhoneNo());
	        System.out.println("Employee Address:" + employee.getAddress());
	        
	        System.out.println();
	    }
	}
