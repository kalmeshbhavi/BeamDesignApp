package com.beamdesign.component.columndesign.model;

public class Result {

    private Integer puValue;
    private Integer puKNValue;
    private Double steelPerc;

    public Integer getPuValue() {
        return puValue;
    }

    public void setPuValue(Integer puValue) {
        this.puValue = puValue;
    }

    public Double getSteelPerc() {
        return steelPerc;
    }

    public void setSteelPerc(Double steelPerc) {
        this.steelPerc = steelPerc;
    }

    public Integer getPuKNValue() {
        return puKNValue;
    }

    public void setPuKNValue(Integer puKNValue) {
        this.puKNValue = puKNValue;
    }

    @Override
    public String toString() {
        return "Result{" +
                "puValue=" + puValue +
                ", puKNValue=" + puKNValue +
                ", steelPerc=" + steelPerc +
                '}';
    }
}
