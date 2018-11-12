import java.util.*;

/*
Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

Follow up: Could you do both operations in O(1) time complexity?

eg.
LRUCache cache = new LRUCache(2); //initial capacity

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4
*/

public class LRUCache {
    private int totalCapacity;
    private int currentCapacity;
    private Map<Integer, Node> map; // to make get and put an O(1) operation
    private Deque<Node> deque;

    public LRUCache(int capacity) {
        totalCapacity = capacity;
        currentCapacity = 0;
        map = new HashMap<>();
        deque = new LinkedList<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            deque.remove(node);
            deque.addFirst(node); // to make it most recently used
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) { // already exists..so we update the value and set it at head
            Node node = map.get(key);
            node.value = value;
            deque.remove(node);
            deque.addFirst(node); // to make it most recently used
        } else {
            if (currentCapacity >= totalCapacity) { // need to make room for new item. so remove last item as it is lru
                currentCapacity--;
                map.remove(deque.getLast().key);
                deque.removeLast();
            }
            Node node = new Node(key, value);
            map.put(key, node);
            deque.addFirst(node);
            currentCapacity++;
        }
    }
}

class Node {
    public int key;
    public int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}