package ex1.behaviors;

import ex1.behaviors.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Stabity stab !");
    }
}
