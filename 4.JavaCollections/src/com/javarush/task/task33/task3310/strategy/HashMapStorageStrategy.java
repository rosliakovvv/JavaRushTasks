package com.javarush.task.task33.task3310.strategy;


import java.util.HashMap;
import java.util.Map;

public class HashMapStorageStrategy implements StorageStrategy{
    private HashMap<Long, String> data = new HashMap<>();

    @Override
    public boolean containsKey(Long key) {

        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) {
        return data.containsValue(value);
    }

    @Override
    public void put(Long key, String value) {
        data.put(key, value);
    }

    @Override
    public Long getKey(String value) {
        Long result = 0L;
        for (Map.Entry<Long,String> pair:data.entrySet()
             ) {
            if (pair.getValue().equals(value)) result = pair.getKey();
        }



        return result;
    }

    @Override
    public String getValue(Long key) {
        /*String result = null;
        for (Map.Entry<Long,String> pair:data.entrySet()
        ) {
            if (pair.getKey().equals(key)) result = pair.getValue();
        }*/
        return data.get(key);
    }
}
