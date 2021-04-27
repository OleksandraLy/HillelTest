package com.hillel.lesson13homework;

import java.util.*;

public class Class2 extends Class1{
    private List<String> stringArrayList2 = new ArrayList<>(4);
    private Set<String> stringSet2 = new HashSet<>();
    private Map<String, String> stringMap2 = new HashMap();

    public Class2() {
    }

    public Class2(List<String> stringArrayList2, Set<String> stringSet2, Map<String, String> stringMap2) {
        this.stringArrayList2 = stringArrayList2;
        this.stringSet2 = stringSet2;
        this.stringMap2 = stringMap2;
    }

    public List<String> getStringArrayList2() {
        return stringArrayList2;
    }

    public void setStringArrayList2(List<String> stringArrayList2) {
        this.stringArrayList2 = stringArrayList2;
    }

    public Set<String> getStringSet2() {
        return stringSet2;
    }

    public void setStringSet2(Set<String> stringSet2) {
        this.stringSet2 = stringSet2;
    }

    public Map<String, String> getStringMap2() {
        return stringMap2;
    }

    public void setStringMap2(Map<String, String> stringMap2) {
        this.stringMap2 = stringMap2;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "stringArrayList2=" + stringArrayList2 +
                ", stringSet2=" + stringSet2 +
                ", stringMap2=" + stringMap2 +
                '}';
    }
}
