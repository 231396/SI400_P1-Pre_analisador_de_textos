
package Util;

import java.util.*;

class MultiMap<T, K>
{
    private Map<T, Collection<K>> map = new HashMap<>();
 
    /**
    * Returns a Collection which the specified key is mapped or null if don't exist.
    */
    public Collection<K> get(T key) {
        return map.get(key);
    }
    
    /**
    * Returns a Collection view of Collection of the values present in this multimap.
    */
    public Collection<Collection<K>> values() {
        return map.values();
    }
 
    /**
    * Add only the key (The key can't exist) to the multimap
    */
    public void add(T key) {
        if (map.get(key) == null)
            map.put(key, new ArrayList<>());
    }
    
    /**
    * Add new a key with value, if the key already exist, only the value will be add
    */
    public void add(T key, K value) {
    	add(key); 
        get(key).add(value);
    }
 
    /**
    * Returns true if this multimap contains a given key.
    */
    public boolean containsKey(T key) {
        return map.containsKey(key);
    } 
 
    /**
    * Returns the number of keys in the multimap.
    */
    public int keySize() {
        return map.size();
    }

    
    /**
    * Returns the number of values in a specified key multimap.
    */
    public int valueSize(T key) {
        return get(key).size();
    }
 
    /**
    * Returns true if this multimap contains no key-value mappings.
    */
    public boolean isEmpty() {
        return map.isEmpty();
    }
 
    /**
    * Removes all pairs from this multimap.
    */
    public void clear() {
        map.clear();
    }
    
    /**
    * Removes the mapping for the specified key from this multimap if present
    * and returns the Collection of previous values associated with key, or
    * null if there was no mapping for key.
    */
    public Collection<K> remove(T key) {
        return map.remove(key);
    }
    
    /**
    * Removes the entry for the specified
    * @return If the remove was a success
    */
    public boolean remove(T key, K value) {
        if (map.get(key) != null)
            return map.get(key).remove(value); 
        return false;
    }
 
    /**
    * Replaces the entry for the specified key only if currently
    * mapped to the specified value and return true if replaced
    */
    public boolean replace(T key, K oldValue, K newValue) { 
        if (get(key) != null) {
            if (get(key).remove(oldValue))
                return get(key).add(newValue);
        }
        return false;
    }
}