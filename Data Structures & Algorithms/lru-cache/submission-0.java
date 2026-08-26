class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {

    private int cap;
    private HashMap<Integer, Node> cache;
    private Node least;
    private Node most;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.least = new Node(0, 0);
        this.most = new Node(0, 0);
        this.least.next = this.most;
        this.most.prev = this.least;
        
    }

    private void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node){
        Node prev = this.most.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.most;
        this.most.prev = node;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);

        if (cache.size() > cap){
            Node lru = this.least.next;
            remove(lru);
            cache.remove(lru.key);
        }
        
    }
}
