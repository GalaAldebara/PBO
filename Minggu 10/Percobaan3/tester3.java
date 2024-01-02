package Percobaan3;

import Percobaan1.electricityBill;
import Percobaan1.employee;
import Percobaan1.internshipEmployee;
import Percobaan1.payable;
import Percobaan1.permanentEmployee;

public class tester3 {
    permanentEmployee pEmp = new permanentEmployee("Dedik", 500);
    internshipEmployee iEmp = new internshipEmployee("Sunarto", 5);
    electricityBill eBill = new electricityBill(5, "A-1");
    employee e[] = { pEmp, iEmp };
    payable p[] = { pEmp, eBill };
}
