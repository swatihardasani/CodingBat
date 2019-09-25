public class CommissionEmployee extends Object {

    private final String firstname;
    private final String lastname;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstname, String lastname, String socialSecurityNumber, double grossSales,
                              double commissionRate){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross Sales must be >= 0.0");
        }

        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.firstname = firstname;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public void setGrossSales(double grossSales){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross Sales must be >= 0.0");
        }

        this.grossSales = grossSales;

    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public double earnings(){
        return commissionRate * grossSales;
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", getFirstname(), getLastname(),
                "social security number ", getSocialSecurityNumber(), "gross sales", getGrossSales(), "commission rate",
                getCommissionRate());
    }

}
