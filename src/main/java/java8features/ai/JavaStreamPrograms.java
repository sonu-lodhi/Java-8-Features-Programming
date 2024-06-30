package java8features.ai;

import java.util.Arrays;
import java.util.List;

public class JavaStreamPrograms {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,5,6,1,4);
        printAvgOfAllNumbers(list);
    }

    private static void printAvgOfAllNumbers(List<Integer> list) {
        double avg = list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println("Average is : "+avg);
    }
}
