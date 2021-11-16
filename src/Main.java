public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        battle.add(new Zombie("Алиса"));
        battle.add(new Zombie("Боб"));
        battle.add(new Zombie("Ева"));
        battle.add(new GiantSnake("Каа"));
        battle.add(new GiantSnake("Сын Кааz "));
        battle.add(new Zombie("Джейк"));
        
        battle.start();
    }
}
