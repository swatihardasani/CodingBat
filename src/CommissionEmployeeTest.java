public class CommissionEmployeeTest {
    public static void main(String args[]){

        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones",
                "222-222-222", 10000, .06);

        System.out.println("Employee information obtained by get methods: ");
        System.out.printf("%n%s %s%n","First name is: " , employee.getFirstname());
        System.out.printf("%s %s%n","Last name is: " , employee.getLastname());
        System.out.printf("%s %s%n", "Social Security number: ",  employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","Gross Sales is: ", employee.getGrossSales());
        System.out.printf("%s %.2f%n","Commission rate is: ",  employee.getCommissionRate());
        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s: %n%n%s%n", "Updated Information: " , employee);
    }
}
