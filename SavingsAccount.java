public class SavingsAccount {
    static double annualInterestRate=0.4;
    static double SavingsBalance;
    double m_interest;
    //double  m_interest;
    SavingsAccount(int sb)
    {
        SavingsBalance=sb;
    }
    void display()
    {
        System.out.println("Saving Balance is:  "+SavingsBalance);
    }
    void calculatemonthlyInterest()
    {
        m_interest=(SavingsBalance*annualInterestRate)/12;
        System.out.println("Monthely Interest is: "+m_interest);
        SavingsBalance=SavingsBalance+m_interest;
        System.out.println("Saving Balence after adding Newer interest: "+SavingsBalance);
    }
    void modifyInterest()
    {
        double newannualInterestRate=0.5;
        System.out.println("New modified INTREST RATE is:"+newannualInterestRate);
        calculatemonthlyInterest();
        
    }
    public static void main(String[] args)
    {
        SavingsAccount saver1=new SavingsAccount(2000);
        saver1.display();
        saver1.calculatemonthlyInterest();
        saver1.modifyInterest();
        System.out.println();
        SavingsAccount saver2=new SavingsAccount(3000);
        saver2.display();
        saver2.calculatemonthlyInterest();
        saver2.modifyInterest();
    }
}
