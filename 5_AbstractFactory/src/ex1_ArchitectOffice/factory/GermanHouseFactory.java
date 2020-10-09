package ex1_ArchitectOffice.factory;

import ex1_ArchitectOffice.doors.Door;
import ex1_ArchitectOffice.doors.LargeDoor;
import ex1_ArchitectOffice.wall.GlassWall;
import ex1_ArchitectOffice.wall.Wall;
import ex1_ArchitectOffice.windows.StructureWindow;
import ex1_ArchitectOffice.windows.Window;

public class GermanHouseFactory implements HouseElementsFactory {
    @Override
    public Door createDoor() {
        return new LargeDoor();
    }

    @Override
    public Window createWindow() {
        return new StructureWindow();
    }

    public Wall createWall() {
        return new GlassWall();
    }
}
