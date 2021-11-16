public class Zombie extends Monster implements Fighter{
    private String scream = "Aaaaaaarrrrrrgggghhhh! ";

    Zombie(String name) {
        super("Зомби по имени " + name, 5);
    }

    public void growl() {
        System.out.print(scream);
    }

    public void attack(Entity entity) {
        entity.damage(getForce());
        growl();
    }
}
