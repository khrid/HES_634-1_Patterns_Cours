package ex1_ArchitectOffice.factory;

import ex1_ArchitectOffice.doors.Door;
import ex1_ArchitectOffice.wall.Wall;
import ex1_ArchitectOffice.windows.Window;

public interface HouseElementsFactory {
    public Door createDoor();
    public Window createWindow();
    public Wall createWall();

}
