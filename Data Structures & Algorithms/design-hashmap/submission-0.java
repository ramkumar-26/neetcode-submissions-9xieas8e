class MyHashMap {

    static class Pair {
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
    }

    private List<Pair>[] buckets;
    private int size;

    public MyHashMap() {
        size = 769;
        buckets = new ArrayList[size];
    }

    private int hash(int key){
        return key % size;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        if(null == buckets[index]){
            buckets[index] = new ArrayList<Pair>();
        }
        for (Pair p : buckets[index]) {
            if (p.key == key) {
                p.value = value; // update
                return;
            }
        }
        buckets[index].add(new Pair(key, value));

    }
    
    public int get(int key) {
        int index = hash(key);

        if (buckets[index] != null) {
            for (Pair p : buckets[index]) {
                if (p.key == key) {
                    return p.value;
                }
            }
        }

        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);

        if (buckets[index] != null) {
            Iterator<Pair> it = buckets[index].iterator();
            while (it.hasNext()) {
                if (it.next().key == key) {
                    it.remove();
                    return;
                }
            }
        }
    }
}



/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */