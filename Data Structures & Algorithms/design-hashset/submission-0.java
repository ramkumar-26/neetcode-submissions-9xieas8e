class MyHashSet {

    List<Integer>[] buckets;
    int size;

    public MyHashSet() {
        size = 16;
        buckets = new ArrayList[size];
    }

    private int hash(int key){
        return key % size;
    }
    
    public void add(int key) {
        int index = hash(key);
        if(null == buckets[index]){
            buckets[index] = new ArrayList<>();
        }
        if(!buckets[index].contains(key)){
            buckets[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = hash(key);
        List<Integer> list = buckets[index];

        if (list != null) {
            list.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        List<Integer> list = buckets[index];

        return list != null && list.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */