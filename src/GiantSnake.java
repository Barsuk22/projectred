public class GiantSnake extends Monster implements Fighter{

    public static String scream = "Ssssss ";

    public GiantSnake(String name) {
        super("Гигантский змей " + name, 5);
    }

    public void growl(){
        System.out.print(scream);
    }


    public void attack(Entity entity) {
        entity.damage(getForce());
        growl();
    }
}
