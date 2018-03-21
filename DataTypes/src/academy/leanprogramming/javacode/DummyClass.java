package academy.leanprogramming.javacode;

import java.util.Arrays;

public class DummyClass
{
    public String isVacationTime(boolean isVacation)
    {
        return isVacation ? "I am on vacation!" : "I am working";
    }

    public void printNumbers(int[] ints)
    {
        Arrays.stream(ints).forEach(System.out::println);
    }
}
