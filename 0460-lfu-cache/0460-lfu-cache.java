import java.util.HashMap;
import java.util.Map;

class LFUCache {
    final int capacity;
    int curSize;
    int minFrequency;
    Map<Integer, DLLNode> cache;                // key -> node
    Map<Integer, DoubleLinkedList> frequencyMap; // freq -> DLL

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.curSize = 0;
        this.minFrequency = 0;
        this.cache = new HashMap<>();
        this.frequencyMap = new HashMap<>();
    }

    public int get(int key) {
        DLLNode curNode = cache.get(key);
        if (curNode == null) {
            return -1;
        }
        updateNode(curNode);
        return curNode.val;
    }

    public void put(int key, int value) {
        if (capacity <= 0) return;

        if (cache.containsKey(key)) {
            DLLNode curNode = cache.get(key);
            curNode.val = value;
            updateNode(curNode);
        } else {
            curSize++;
            if (curSize > capacity) {
                DoubleLinkedList minFreqList = frequencyMap.get(minFrequency);
                DLLNode nodeToRemove = minFreqList.removeLastNode();
                cache.remove(nodeToRemove.key);
                curSize--;
            }
            minFrequency = 1;
            DLLNode newNode = new DLLNode(key, value);
            DoubleLinkedList curList = frequencyMap.getOrDefault(1, new DoubleLinkedList());
            curList.addNode(newNode);
            frequencyMap.put(1, curList);
            cache.put(key, newNode);
        }
    }

    private void updateNode(DLLNode curNode) {
        int curFreq = curNode.frequency;
        DoubleLinkedList curList = frequencyMap.get(curFreq);
        curList.removeNode(curNode);

        if (curFreq == minFrequency && curList.listSize == 0) {
            minFrequency++;
        }

        curNode.frequency++;
        DoubleLinkedList newList = frequencyMap.getOrDefault(curNode.frequency, new DoubleLinkedList());
        newList.addNode(curNode);
        frequencyMap.put(curNode.frequency, newList);
    }
}

// Node for doubly linked list
class DLLNode {
    int key, val, frequency;
    DLLNode prev, next;

    public DLLNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.frequency = 1;
    }
}

// Doubly linked list for nodes of the same frequency
class DoubleLinkedList {
    DLLNode head, tail;
    int listSize;

    public DoubleLinkedList() {
        head = new DLLNode(0, 0);
        tail = new DLLNode(0, 0);
        head.next = tail;
        tail.prev = head;
        listSize = 0;
    }

    public void addNode(DLLNode node) {
        DLLNode nextNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
        listSize++;
    }

    public void removeNode(DLLNode node) {
        DLLNode prevNode = node.prev;
        DLLNode nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        listSize--;
    }

    public DLLNode removeLastNode() {
        if (listSize > 0) {
            DLLNode lastNode = tail.prev;
            removeNode(lastNode);
            return lastNode;
        }
        return null;
    }
}


/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */