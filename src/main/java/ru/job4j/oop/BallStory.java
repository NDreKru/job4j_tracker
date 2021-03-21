package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
    Ball ball = new Ball();
    Hare hare = new Hare();
    hare.tryEat(ball);
    Wolf wolf = new Wolf();
    wolf.tryEat(ball);
    Fox fox = new Fox();
    fox.tryEat(ball);
    }
}

class Ball {

}

class Hare {

    public void tryEat(Ball ball) {
        System.out.println("Hare couldn't eat Ball, Ball ran away");
    }
}

class Wolf {

    public void tryEat(Ball ball) {
        System.out.println("Wolf couldn't eat Ball, Ball ran away");
    }
}

class Fox {

    public void tryEat(Ball ball) {
        System.out.println("Fox was able to eat Ball, Ball was defeated");
    }
}
