package com.javarush.task.task37.task3708.for_java_rush.right.retrievers;

import com.javarush.task.task37.task3708.for_java_rush.right.cache.LRUCache;
import com.javarush.task.task37.task3708.for_java_rush.right.storage.Storage;

public class CachingProxyRetriever implements Retriever {
    LRUCache<Long, Object> cache = new LRUCache<>(10);
    OriginalRetriever originalRetriever;

    @Override
    public Object retrieve(long id) {
        Object result = cache.find(id);
        if (result == null) {
            Object o = originalRetriever.retrieve(id);
            cache.set(id, o);
            return o;
        }
        System.out.println("Returning cached object!");
        return result;
    }

    public CachingProxyRetriever(Storage storage) {
        originalRetriever = new OriginalRetriever(storage);
    }
}
