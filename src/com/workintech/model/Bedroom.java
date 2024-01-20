package com.workintech.model;

public class Bedroom extends Room{
    private String name;
    private Bed bed;
    private Wardrobe wardrobe;


    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4,
                   Ceiling ceiling, Lamp lamp, String name, Carpet carpet,
                   Bed bed, Wardrobe wardrobe) {
        super(wall1, wall2, wall3, wall4, ceiling, lamp, carpet);
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }
}


