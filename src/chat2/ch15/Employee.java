package src.chat2.ch15;

public class Employee {
    private static int serialNum = 1000;
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() {
        int i = 0;

        return serialNum;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName(String 김유신) {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }
}
