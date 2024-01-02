package Percobaan2;

import Percobaan1.employee;
import Percobaan1.permanentEmployee;

public class tester2 {
    public static void main(String[] args) {
        permanentEmployee pEmp = new permanentEmployee("Dedik", 500);
        employee e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("----------------------");
        System.out.println("" + pEmp.getEmployeeInfo());
    }
}
