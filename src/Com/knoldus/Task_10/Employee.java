package Com.knoldus.Task_10;

import java.util.Objects;

public class Employee {

    private int empId;
    private String employeeName;


    public Employee(int empId, String employeeName) {
        this.empId = empId;
        this.employeeName = employeeName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                       "empId=" + empId +
                       ", employeeName='" + employeeName + '\'' +
                       '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, employeeName);
    }
}
