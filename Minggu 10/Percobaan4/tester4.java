package Percobaan4;

import Percobaan1.electricityBill;
import Percobaan1.internshipEmployee;
import Percobaan1.permanentEmployee;

public class tester4 {
    public static void main(String[] args) {
        owner ow = new owner();
        electricityBill eBill = new electricityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("---------------------------------");

        permanentEmployee pEmp = new permanentEmployee("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("---------------------------------");

        internshipEmployee iEmp = new internshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("---------------------------------");
        ow.showMyEmployee((iEmp));
    }
}
