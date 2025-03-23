public class employee
{
    String firstname,lastname;
    double monthlysal;
    double yrsal,incsal;
    employee(String fnm,String lnm,double msal)
    {
      firstname=fnm;
      lastname=lnm;
      monthlysal=msal;
 
    }
    public void setFirstname()
    {
        firstname="Rutuja";
        System.out.println("First Name:"+"\t"+firstname);   
    }
    public String getFirstname()
    {
        return firstname;
    }
    public void setLastname()
    {
        lastname="Sapkal";
        System.out.println("Last Name:"+"\t"+lastname);   
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setMonthlySal()
    {
        monthlysal=12000.00;
        System.out.println("Monthly Salary:"+"\t"+monthlysal);
    }
    public double getMonthlySal()
    {
        if(monthlysal<0)
        {
            monthlysal=0.0;
        }
        return monthlysal;
    }
    public void employeeTest()
    {
        yrsal=monthlysal*12;
       System.out.println("Yearly Salary: "+"\t"+yrsal);
       incsal=(yrsal*10);
       System.out.println("Incremented Salary;"+"/t"+incsal);
    }
    public void display()
    {
        System.out.println("First Name:"+"\t"+getFirstname()+"\n"+"last Name:"+"\t"+getLastname()+"\n"+"Monthly Salary:"+"\t"+getMonthlySal());
    }
    public static void main(String[] args)
    {
      employee e1=new employee("Ram","Reddy",10000.00);
      e1.display();
      e1.employeeTest();
      System.out.println("\n");
      e1.setFirstname();
      e1.getFirstname();
      e1.setLastname();
      e1.getLastname();
      e1.setMonthlySal();
      e1.getMonthlySal();
      e1.employeeTest();
    }


}