class MyHashSet {
    int size = 1000;
    public List<List<Integer>> buckets;

    public MyHashSet() {
        buckets = new ArrayList<>(size);
        for(int i = 0;i<size;i++){
            buckets.add(new ArrayList<>());
        }
        
    }
    
    public void add(int key) {
        int hash = key % size;
        List<Integer> bucket = buckets.get(hash);
        if(!bucket.contains(key)){
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int hash = key%size;
        List<Integer> bucket = buckets.get(hash);
        bucket.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
     int hash = key %size;
     List<Integer> bucket = buckets.get(hash)   ;
     return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */