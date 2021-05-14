package com.madhurtoppo.leetcode.heapsandmaps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    private LRUCache lruCache;
    private int capacity;

    @BeforeEach
    void setUp() {
        capacity = 2;
        lruCache = new LRUCache(capacity);
    }

    @Test
    void testLRUCache() {
        lruCache.put(1, 1);
        lruCache.put(2, 2);

        assertEquals(1, lruCache.get(1));

        lruCache.put(3, 3);

        assertEquals(-1, lruCache.get(2));

        lruCache.put(4, 4);

        assertEquals(-1, lruCache.get(1));
        assertEquals(3, lruCache.get(3));
        assertEquals(4, lruCache.get(4));
    }
}