package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета пользователя
 * @author Andrey Kruglov
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты счета хранятся в строковом представлении String
     */
    private String requisite;
    /**
     * Текущий баланс счета хранится как вещественное число double
     */
    private double balance;

    /**
     * Конструктор класса, принимает на вход
     * @param requisite - реквизиты счета
     * @param balance - текущий баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Геттер для получения реквизитов счета
     * @return реквизиты данного счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Сеттер для изменения реквизитов данного счета
     * @param requisite - новые реквизиты счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Геттер для получения баланса счета
     * @return баланс данного счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Сеттер для изменения баланса данного счета
     * @param balance - новые баланс счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
