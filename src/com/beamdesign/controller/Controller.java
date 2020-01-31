package com.beamdesign.controller;

import com.beamdesign.model.Column;

import java.util.Arrays;
import java.util.List;

public class Controller {

    public List<Column> getAreaColumnDetails() {
        return Arrays.asList(
                new Column(10,20, 200, "mm²"),
                new Column(10,20, 200, "32mmØ"),
                new Column(10,20, 200, "25mmØ"),
                new Column(0,0, 0, "20mmØ"),
                new Column(0,0, 0, "16mmØ"),
                new Column(0,0, 0, "12mmØ"));
    }

}
