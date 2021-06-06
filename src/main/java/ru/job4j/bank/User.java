package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банковского счета
 * @author Andrey Kruglov
 * @version 1.0
 */
public class User {
    /**
     * Номер паспорта пользователя хранится в строковом представлении
     */
    private String passport;
    /**
     * Имя пользователя хранится в строковом представлении
     */
    private String username;

    /**
     * Конструктор класса, принимает на вход
     * @param passport - номер паспорта пользователя
     * @param username - имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Геттер для получения номера паспорта пользователя
     * @return номер данного пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Сеттер для изменения номера паспорта пользователя
     * @param passport - новый номер паспорта пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Геттер для получения имени пользователя
     * @return имя данного пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Сеттер для изменения имени пользователя
     * @param username - новое имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
