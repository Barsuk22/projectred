abstract public class Monster extends Entity {
    private int force;

    Monster(String name, int force) {
        super(name);
        this.force = force;

        System.out.println(name + " Заспавнился! ");
    }
    
    protected int getForce() {
        return force;
    }
}
