package ru.job4j.oop;

public class Max {

    public static int max(int first, int second) {
        boolean isMax = first > second;
        return  isMax ? first : second;
    }

    public static int max(int first, int second, int third) {
        int firstResult = max(first, second);
        boolean isMax = firstResult > third;
        return  isMax ? firstResult : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int firstResult = max(first, second, third);
        boolean isMax = firstResult > fourth;
        return  isMax ? firstResult : fourth;
    }
}
