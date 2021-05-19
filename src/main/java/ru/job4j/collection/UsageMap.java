package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

    public static void main(String[] args) {
        Map<String, String> mapExample = new HashMap<>();
        mapExample.put("ivanov@ii.com", "Иванов Иван Иванович");
        for (String key : mapExample.keySet()) {
            System.out.println(key + " = " + mapExample.get(key));
        }
    }
}
