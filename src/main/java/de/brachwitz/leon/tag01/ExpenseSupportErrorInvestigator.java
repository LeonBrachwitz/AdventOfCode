package de.brachwitz.leon.tag01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpenseSupportErrorInvestigator
{
    public Integer investigateError(Integer expectedSum, List<String> input)
    {
        var values = findEntryWithSum(expectedSum, input);
        return values.stream().reduce(1, (a, b) -> a * b);
    }

    private List<Integer> findEntryWithSum(Integer expectetdSum, List<String> input)
    {
        var ergebnis = new ArrayList<Integer>();
        var konvertierterInput = konvertiereInhaltZuIntegern(input);
        for (int i = 0; i < input.size(); i++)
        {
            for (int j = 0; j < input.size() - 1; j++)
            {
                var sum = konvertierterInput.get(i) + konvertierterInput.get(j);
                if (sum == expectetdSum)
                {
                    ergebnis.add(konvertierterInput.get(i));
                }
            }
        }
        return ergebnis;
    }

    private List<Integer> konvertiereInhaltZuIntegern(List<String> input)
    {
        return input.stream().map(s -> Integer.valueOf(s)).collect(Collectors.toList());
    }
}
