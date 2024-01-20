package com.workintech.model;

public class Bedroom extends Room{

    private Bed bed;
    private Wardrobe wardrobe;
    private String name;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4,
                   Ceiling ceiling, Lamp lamp,  Carpet carpet,
                   Bed bed, Wardrobe wardrobe, String name) {
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

    public void createBedroom(){
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        bed.make();
        getCarpet().lying();
        wardrobe.add();
        getLamp().turnOn();
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                '}';
    }
}


