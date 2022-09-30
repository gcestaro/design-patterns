package com.github.gcestaro.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NoteFlyweight {

    public static final Map<String, MusicalNote> notes = new HashMap<>();

    // create the object once and reuse it everywhere it is needed
    static {
        notes.put("do", new MusicalNote("do"));
        notes.put("re", new MusicalNote("re"));
        notes.put("mi", new MusicalNote("mi"));
        notes.put("fa", new MusicalNote("fa"));
        notes.put("sol", new MusicalNote("sol"));
        notes.put("la", new MusicalNote("la"));
        notes.put("si", new MusicalNote("si"));
    }
}
