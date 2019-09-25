public class EmployeeTest {
    public static void main(String args[]){
        Date birth = new Date(7, 24, 1985);
        Date hire = new Date(3,12,1988);
        Employee employee = new Employee("Bob", "blue", birth, hire);

        System.out.println(employee);
    }
}
