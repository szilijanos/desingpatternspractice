package org.example.flyweight;

public class CommonPart {
    private final int someCommonProp1;

    private final String someCommonProp2;

    public CommonPart(int someCommonProp1, String someCommonProp2) {
        this.someCommonProp1 = someCommonProp1;
        this.someCommonProp2 = someCommonProp2;
    }

    public int getSomeCommonProp1() {
        return someCommonProp1;
    }

    public String getSomeCommonProp2() {
        return someCommonProp2;
    }
}
