package ru.job4j.stream;

import org.junit.Test;


import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {

    @Test
    public void collect() {
        Address address1 = new Address("Moscow", "Lenina", 120, 25);
        Address address2 = new Address("Yekaterinburg", "Gotvalda", 20, 5);
        List<Profile> profilesList = List.of(new Profile(address1), new Profile(address2));
        List<Address> expected = List.of(address1, address2);
        Profiles profiles = new Profiles();
        assertThat(profiles.collect(profilesList), is(expected));
    }
}