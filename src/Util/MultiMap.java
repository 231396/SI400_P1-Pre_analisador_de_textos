
package Util;

import java.util.*;


/**
* Multimap implemantition using java, T for the key, K for the values
*/
public class MultiMap<T, K>
{
    /**
    * The map who is used to implement the multimap
    * T have is the key value
    * Collection<K> is where all values are stored
    */
    private Map<T, Collection<K>> map = new HashMap<>();
 
    /**
    * Get the Collection of values in a given key in the multimap
    * @param key the key whose associated value is to be returned
    * @return Collection of values of given key or null if don't exist
    */
    public Collection<K> get(T key) {
        return map.get(key);
    }
    
    /**
    * Get the Collection of keys in the multimap
    * @return Collection of keys
    */
    public Collection<T> getKeys() {
        return map.keySet();
    }
 
    /**
    * Add only the key (The key can't exist) to the multimap
    * @param key the new key
    */
    public void add(T key) {
        if (get(key) == null)
            map.put(key, new ArrayList<>());
    }
    
    /**
    * Add new a key with value, if the key already exist, only the value will be add
    * @param key key with which the specified value is to be associated
    * @param value value to be associated with the specified key
    */
    public void add(T key, K value) {
    	add(key); 
        get(key).add(value);
    }
 
    /**
    * Returns true if this multimap contains a given key.
    * @param key key to verify if exist on multimap
    * @return if the given key exist or not in the multimap
    */
    public boolean containsKey(T key) {
        return map.containsKey(key);
    } 
 
    /**
    * Get the number of keys existing in the multimap.
    * @return the number of keys.
    */
    public int keySize() {
        return map.size();
    }

    
    /**
    * Get the number of values existing in specified key in the multimap.
    * @param key the key whose associated numbers of values is to be returned
    * @return the number of values in a given key.
    */
    public int valueSize(T key) {
        return get(key).size();
    }
 
    /**
    * Returns true if this multimap contains no key-value mappings.
    * @return true if this multimap contains no key-value mappings
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
    * @param key key whose mapping is to be removed from the map
    * @return the previous value associated with key, or null if there was no mapping for key.
    */
    public Collection<K> remove(T key) {
        return map.remove(key);
    }
    
    /**
    * Removes the value for the specified key
    * @param key the key of the value to removed
    * @param value the value to removed, if present
    * @return if the remove was a success or not
    */
    public boolean remove(T key, K value) {
        if (get(key) != null)
            return get(key).remove(value); 
        return false;
    }
 
    /**
    * Replaces the entry for the specified key only if currently
    * mapped to the specified value and return true if replaced
    * @param key the key that contains the values
    * @param oldValue the value to be removed
    * @param newValue the value to be add on where oldValue was
    */
    public boolean replace(T key, K oldValue, K newValue) { 
        if (get(key) != null) {
            if (get(key).remove(oldValue))
                return get(key).add(newValue);
        }
        return false;
    }
}