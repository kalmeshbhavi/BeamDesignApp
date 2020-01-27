package com.beamdesign.model;

public class Column {

    private Integer length;
    private Integer width;
    private Integer area;
    private String unit;

    public Column() {
    }

    public Column(Integer length, Integer width, Integer area, String unit) {
        this.length = length;
        this.width = width;
        this.area = area;
        this.unit = unit;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
