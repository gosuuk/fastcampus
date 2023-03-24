package src.chat2.ch15;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employeePark = new Employee();
        employeePark.getEmployeeName("박순신");

        System.out.println(employeePark.getEmployeeId());

        Employee employeeKim = new Employee();
        employeeKim.getEmployeeName("김유신");

        System.out.println(employeePark.getEmployeeName("김유신") + "님의 사번은" +employeePark.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName("김유신") + "님의 사번은" +employeeKim.getEmployeeId());
    }
}
