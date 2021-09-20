package org.bankstatement;

public class SavingAccount
{
    private double savingBalance = 0.0;
    public static double annualInterestRate=0.0;

    public void calMonthlyInterest( double savingBalNew) {

        this.savingBalance=savingBalNew;
        savingBalance= (savingBalance * annualInterestRate) / 12;
        System.out.println(savingBalance+annualInterestRate);

        }
        protected static void modifyInterestRate( double newInterestRate)
        {
            annualInterestRate=newInterestRate;
        }
        public SavingAccount( double newSavingBal){
         this.savingBalance=newSavingBal;

          }





}
