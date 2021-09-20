package org.bankstatement;

public class SavingAccountTest  {
    public static void main(String[] args)
    {
        SavingAccount server1 = new SavingAccount(2000);
        SavingAccount server2 = new SavingAccount(3000);
        server1.modifyInterestRate(04);
        server1.calMonthlyInterest(2000);
        server2.modifyInterestRate(05);
        server2.calMonthlyInterest(3000);

    }
}
