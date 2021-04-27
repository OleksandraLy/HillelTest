package com.hillel.lesson13homework;

import java.util.*;

public class Class3 extends Class2{
    private List<String> stringArrayList3 = new ArrayList<>(4);
    private Set<String> stringSet3 = new HashSet<>();
    private Map<String, String> stringMap3 = new HashMap();

    public Class3(List<String> stringArrayList3, Set<String> stringSet3, Map<String, String> stringMap3) {
        this.stringArrayList3 = stringArrayList3;
        this.stringSet3 = stringSet3;
        this.stringMap3 = stringMap3;
    }

    public List<String> getStringArrayList3() {
        return stringArrayList3;
    }

    public void setStringArrayList3(List<String> stringArrayList3) {
        this.stringArrayList3 = stringArrayList3;
    }

    public Set<String> getStringSet3() {
        return stringSet3;
    }

    public void setStringSet3(Set<String> stringSet3) {
        this.stringSet3 = stringSet3;
    }

    public Map<String, String> getStringMap3() {
        return stringMap3;
    }

    public void setStringMap3(Map<String, String> stringMap3) {
        this.stringMap3 = stringMap3;
    }

    @Override
    public String toString() {
        return "Class3{" +
                "stringArrayList3=" + stringArrayList3 +
                ", stringSet3=" + stringSet3 +
                ", stringMap3=" + stringMap3 +
                '}';
    }
}
