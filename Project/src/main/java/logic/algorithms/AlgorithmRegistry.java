package main.java.logic.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AlgorithmRegistry {

    private static AlgorithmRegistry algorithmRegistry;

    private Map<String, Class<? extends Algorithm>> classes = new HashMap<>();

    public static AlgorithmRegistry getInstance(){
        if(algorithmRegistry == null)
            algorithmRegistry = new AlgorithmRegistry();
        return algorithmRegistry;
    }

    private AlgorithmRegistry() {
    }


    public void addAlgorithm(String name, Class algorithm){
        classes.putIfAbsent(name,algorithm);
    }

    public Algorithm getAlgorithmInstanceByName(String name){
        if(classes.containsKey(name)) {
            try {
                return classes.get(name).newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return new DefaultAlgorithm();
    }

    public ArrayList<String> getAlgorithms() {
        ArrayList<String> retlist = new ArrayList<String>();
        retlist.addAll(classes.keySet());
        return retlist;
    }
}
