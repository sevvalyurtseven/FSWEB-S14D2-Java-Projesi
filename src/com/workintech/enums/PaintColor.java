package com.workintech.enums;

import java.util.SplittableRandom;

public enum PaintColor {
    BLUE("#0096FF"),
    RED("#FF0000"),
    GREEN("#228B22"),
    WHITE("#FFFFFF");

    private String hexCode;

    PaintColor(String hexCode){
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
