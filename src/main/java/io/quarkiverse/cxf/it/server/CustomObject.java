package io.quarkiverse.cxf.it.server;

public class CustomObject {
    private String field1;
    private String field2;

    // Constructors
    public CustomObject() {}

    public CustomObject(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    // Getters and Setters
    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    // Override toString
    @Override
    public String toString() {
        return "CustomObject{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                '}';
    }
}
