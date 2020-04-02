package com.Classes;

import com.Experimentations.Automobile;
import com.Refactoring.MortgageCalculator;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        var mortgage = new MortgageCalculator(180_000,4.0,10);
        System.out.println(mortgage.getMortgage());
        System.out.println();

        for (double amount: mortgage.getMonthlyBalance() )

            System.out.println(NumberFormat.getCurrencyInstance().format(amount));

        // TEST LINE FOR REBASING

    }


}
