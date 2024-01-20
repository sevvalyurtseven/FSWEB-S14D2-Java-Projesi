import com.workintech.enums.Direction;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(LampType.NEON, true, 100);
        lamp1.turnOn();

        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        ceiling.create();

        Bed bed = new Bed("Double", 2, 2, 2, 2);
        System.out.println(bed.toString());

        Wall northWall = new Wall(Direction.NORTH);
        Wall eastWall = new Wall(Direction.EAST);
        Wall westWall = new Wall(Direction.WEST);
        Wall southWall = new Wall(Direction.SOUTH);

        Bedroom bedroom = new Bedroom(northWall, eastWall, westWall, southWall, ceiling,
                new Lamp(LampType.LAVA, true, 120),
                new Carpet(1,3, PaintColor.GREEN),
                new Bed("DOUBLE", 2, 2, 2, 2),
                new Wardrobe(1,3,20),
                "Ebeveyn");
        System.out.println(bedroom);
        bedroom.createBedroom();
    }
}