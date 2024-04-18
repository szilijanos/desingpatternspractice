package org.example.privateClassData;

public class MainDataClass {
    private int i4;
    private final DataToHideClass restrictedAccessData;

    public MainDataClass(int i1, int i2, int i3, int i4) {
        this.restrictedAccessData = new DataToHideClass(i1, i2, i3);
        this.i4 = i4;
    }

    public int getI1() {
        return restrictedAccessData.getI1();
    }
    public int getI2() {
        return restrictedAccessData.getI2();
    }
    public int getI3() {
        return restrictedAccessData.getI3();
    }
    public int getI4() { return i4; }
    public void setI4(int i4) { this.i4 = i4; }
}
