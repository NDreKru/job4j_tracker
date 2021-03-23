package ru.job4j.oop;

public class Max {

    public static int max(int first, int second) {
        boolean isMax = first > second;
        return isMax ? first : second;
    }

    public static int max(int first, int second, int third) {
        int firstResult = max(first, second);
        boolean isMax = firstResult > third;
        return isMax ? firstResult : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(max(first, second), third), fourth);
    }
}
