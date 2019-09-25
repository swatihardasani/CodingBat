public class Employee {
    private String firstname;
    private String lastname;
    private Date birthDate;
    private Date hireDate;

    public Employee(String firstname, String lastname, Date birthDate, Date hireDate){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.hireDate = hireDate;



    }

    public String toString(){
        return String.format("%s, %s Hired: %s Birthday: %s", firstname, lastname, hireDate, birthDate);
    }
}
