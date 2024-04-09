package sample;

import java.sql.ResultSet;
import java.sql.SQLException;

class EmployeeThread extends Thread {
    @Override
    public void run() {
        DatabaseDAO dao = new DatabaseDAO();
        try {
            ResultSet resultSet = dao.executeQuery("SELECT * FROM emp");

            while (resultSet.next()) {
                System.out.println("Employee ID: " + resultSet.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class DepartmentThread extends Thread {
    @Override
    public void run() {
        DatabaseDAO dao = new DatabaseDAO();
        try {
            ResultSet resultSet = dao.executeQuery("SELECT * FROM Dept");

            while (resultSet.next()) {
                System.out.println("Department ID: " + resultSet.getInt("deptid"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class ProjectThread extends Thread {
    @Override
    public void run() {
        DatabaseDAO dao = new DatabaseDAO();
        try {
            ResultSet resultSet = dao.executeQuery("SELECT * FROM Project");

            while (resultSet.next()) {
                System.out.println("Project ID: " + resultSet.getInt("projectid"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        EmployeeThread employeeThread = new EmployeeThread();
        DepartmentThread departmentThread = new DepartmentThread();
        ProjectThread projectThread = new ProjectThread();

        employeeThread.start();
        departmentThread.start();
        projectThread.start();
    }
}

