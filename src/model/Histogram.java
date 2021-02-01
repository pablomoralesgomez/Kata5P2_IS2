package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Pablo
 */
public class Histogram<T> {
    private final Map<T, Integer> mapa = new HashMap<>();
    
    public Integer get(T key) {
        return this.mapa.get(key);
    }
    
    public Set<T> keySet() {
        return this.mapa.keySet();
    }
    
    public void increment(T key) {
        this.mapa.put(key, mapa.containsKey(key) ? this.mapa.get(key) + 1 : 1);
    }
 }
