package ru.job4j.stream;

import org.junit.Test;


import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {

    @Test
    public void collectWhenUnique() {
        Address address1 = new Address("Moscow", "Lenina", 120, 25);
        Address address2 = new Address("Yekaterinburg", "Gotvalda", 20, 5);
        List<Profile> profilesList = List.of(new Profile(address1), new Profile(address2));
        List<Address> expected = List.of(address1, address2);
        Profiles profiles = new Profiles();
        assertThat(profiles.collect(profilesList), is(expected));
    }

    @Test
    public void collectWhenNotUnique() {
        Address address1 = new Address("Moscow", "Lenina", 120, 25);
        Address address2 = new Address("Yekaterinburg", "Gotvalda", 20, 5);
        Address address3 = new Address("Moscow", "Lenina", 120, 25);
        List<Profile> profilesList = List.of(
                new Profile(address2),
                new Profile(address1),
                new Profile(address3));
        List<Address> expected = List.of(address1, address2);
        Profiles profiles = new Profiles();
        assertThat(profiles.collect(profilesList), is(expected));
    }
}