package ex1;

public class Troll extends Character{
    @Override
    public void fight() {
        System.out.println("Akala miam miam ?");
        wp.useWeapon();
    }
}
