package org.example.privateClassData;

public class DataToHideClass {
    final int i1;
    final int i2;
    final int i3;

    public DataToHideClass(int i1, int i2, int i3) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }

    public int getI1() {
        return i1;
    }

    public int getI2() {
        return i2;
    }

    public int getI3() {
        return i3;
    }
}
