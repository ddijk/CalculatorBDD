package nl.dijkrosoft;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by dickdijk on 01/11/16.
 */
public class Calculator {

    private double result;

    public Calculator() {
        System.out.println("Creating Calculator " + LocalDate.now());
    }

    List<Integer> numbers = new ArrayList<>();

    public void add(int i) {
        numbers.add(i);
    }

    public void calculateSum()
    {
        // add them
        result = numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public double getResult() {
        return result;
    }

    public void calculateDifference() {

        if ( numbers.size() > 1) {
            int first = numbers.get(0);
            result = first;
            for ( int i = 1 ; i< numbers.size();i++) {
                result = first - numbers.get(i);
            }
        }
    }
}
