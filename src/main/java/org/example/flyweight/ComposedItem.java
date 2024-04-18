package org.example.flyweight;

public class ComposedItem {
    private final CommonPart common;
    private String dataThatCanBeOftenDifferent;
    public ComposedItem(int number, String text, String dataThatCanBeOftenDifferent) {
        this.common = CommonPartFlyweightStoreAndFactory.getCommonPart(number, text);
        this.dataThatCanBeOftenDifferent = dataThatCanBeOftenDifferent;
    }

    public CommonPart getCommon() {
        return common;
    }

    public String getDataThatCanBeOftenDifferent() {
        return dataThatCanBeOftenDifferent;
    }

    public void setDataThatCanBeOftenDifferent(String dataThatCanBeOftenDifferent) {
        this.dataThatCanBeOftenDifferent = dataThatCanBeOftenDifferent;
    }
}
