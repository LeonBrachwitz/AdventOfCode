package de.brachwitz.leon.tag01;

import de.brachwitz.leon.utils.FileReader;

public class Main
{
    public static void main(String[] args)
    {
        var fileReader = new FileReader();
        final var dateninput = fileReader.readCsvFile("/tag01/input.csv");

        var expenseSupportErrorInvestigator = new ExpenseSupportErrorInvestigator();
        System.out.println(expenseSupportErrorInvestigator.investigateError(2020, dateninput));
    }
}
