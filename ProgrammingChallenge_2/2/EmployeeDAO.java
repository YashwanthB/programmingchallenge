package com.challenge;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class EmployeeDAO {
    private Connection connection;
    private Statement statement;
 
    public EmployeeDAO() { }
 
    public Employee getEmployee(int employeeId) throws SQLException {
        String query = "SELECT * FROM employee WHERE emp_id=" + employeeId;
        ResultSet rs = null;
        Employee employee = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            if (rs.next()) {
                employee = new Employee();
                employee.setId(rs.getInt("emp_id"));
                employee.setName(rs.getString("emp_name"));
                employee.setPhoneNo(rs.getInt("phoneNo"));
                employee.setAddress(rs.getString("address"));
                
            }
        } finally {
            DbUtil.close(rs);
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
        return employee;
    }
}
