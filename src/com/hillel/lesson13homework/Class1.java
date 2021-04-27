package com.hillel.lesson13homework;

import java.util.*;

public class Class1 {
    private List<String> stringArrayList = new ArrayList<>(4);
    private Set<String> stringSet= new HashSet<>();
    private Map<String, String> stringMap= new HashMap();

    public Class1() {
    }

    public Class1(List<String> stringArrayList, Set<String> stringSet, Map<String, String> stringMap) {
        this.stringArrayList = stringArrayList;
        this.stringSet = stringSet;
        this.stringMap = stringMap;
    }

    public List<String> getStringArrayList() {
        return stringArrayList;
    }

    public void setStringArrayList(List<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "stringArrayList=" + stringArrayList +
                ", stringSet=" + stringSet +
                ", stringMap=" + stringMap +
                '}';
    }
}
