package ex1.behaviors;

import ex1.behaviors.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting with my bow ! Pew pew");
    }
}
