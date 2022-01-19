public class Die {
    
    public int rollDie() {
        int roll1 = (int) (Math.random() * 6) + 1;
        int roll2 = (int) (Math.random() * 6) + 1;
        int valAdded = roll1 + roll2;
        System.out.println("You rolled: " + valAdded);
        return valAdded;
    }
}