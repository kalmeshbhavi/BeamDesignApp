package com.beamdesign.controller;

import com.beamdesign.model.Column;
import com.beamdesign.model.MassForceDetails;

import java.util.Arrays;
import java.util.List;

public class Controller {

    public List<Column> getAreaColumnDetails() {
        return Arrays.asList(
                new Column(10, 20, 200, "mm²"),
                new Column(10, 20, 200, "32mmØ"),
                new Column(10, 20, 200, "25mmØ"),
                new Column(0, 0, 0, "20mmØ"),
                new Column(0, 0, 0, "16mmØ"),
                new Column(0, 0, 0, "12mmØ"));
    }

    public String[] getMassForceList() {
        return new String[]{
                "M 15 = 4 Fe 250= 130",
                "M 20 = 5 Fe 415= 190",
                "M 25 = 6 Fe 500= 190",
                "M 30 = 8 Fe 500= 190"
        };
    }

}
