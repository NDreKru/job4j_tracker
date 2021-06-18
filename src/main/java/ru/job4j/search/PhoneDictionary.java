package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> namePredicate = n -> key.equals(n.getName());
        Predicate<Person> surnamePredicate = n -> key.equals(n.getSurname());
        Predicate<Person> phonePredicate = n -> key.equals(n.getPhone());
        Predicate<Person> addressPredicate = n -> key.equals(n.getAddress());
        Predicate<Person> combine = namePredicate.or(
                surnamePredicate.or(
                        phonePredicate.or(
                                addressPredicate)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
