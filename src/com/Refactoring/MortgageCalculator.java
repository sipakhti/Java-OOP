package com.Refactoring;


public class MortgageCalculator {
    private final static byte PERCENT = 100, MONTHS_IN_YEAR = 12;

    private int principal;
    private float interestRate;
    private int months;
    private double mortgage;
    private double[] monthlyBalance;

    public MortgageCalculator(int principal, double interestRate, int years) {
        setPrincipal(principal);
        setInterestRate((float) interestRate);
        setMonths(years);
        setMortgage();
        setMonthlyBalance();
    }

    private void setPrincipal(int principal) {
        if ( principal < 1000 || principal > 1000000)
            throw new IllegalArgumentException("Principal amount cannot be less than '1000' and greater than 1,000,000 !");
        this.principal = principal;
    }

    private void setInterestRate(float interestRate) {
        if (interestRate <= 0 || interestRate > 30)
            throw new IllegalArgumentException("Interest rate cannot be less than 0 or exceed 30 !");
        this.interestRate = interestRate / PERCENT / MONTHS_IN_YEAR;
    }

    private void setMonths(int years) {
        if (years <= 0 || years > 30)
            throw new IllegalArgumentException("Years cannot be less than 0 or exceed 30 !");
        this.months = years * MONTHS_IN_YEAR;
    }

    public double getMortgage() {
        return mortgage;
    }

    public double[] getMonthlyBalance() {
        /**
         * @returns : list of remaining balance in a descending order
         */
        return monthlyBalance;
    }

    private void setMortgage() {

        int numberOfPayments = months;
        float monthlyInterest = interestRate / PERCENT / MONTHS_IN_YEAR;

        mortgage = principal
                * ((monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments)))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

    }

    private void setMonthlyBalance() {

        int numberOfPayments = months;
        monthlyBalance = new double[months];
        for (int paymentsMade = 1; paymentsMade <= numberOfPayments; paymentsMade++)

            monthlyBalance[paymentsMade - 1] = principal
                    * ((Math.pow((1 + interestRate), numberOfPayments) - Math.pow((1 + interestRate), paymentsMade))
                    / (Math.pow((1 + interestRate), numberOfPayments) - 1));
    }
}

