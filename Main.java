public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Archer archer = new Archer();


        
        warrior.attack();
        warrior.defend();

        mage.attack();
        mage.defend();

        archer.attack();
        archer.defend();

        warrior.getHealth();
        mage.getHealth();
        archer.getHealth();

        warrior.takeDamage(20);
        mage.takeDamage(20);
        archer.takeDamage(20);




    }
}