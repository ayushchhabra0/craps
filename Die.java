public class Die {
    
    public int dieRoll() {
        int roll1 = (int) Math.random() * 6 + 1;
        int roll2 = (int) Math.random() + 6 + 1;
        return roll1 + roll2;
    }
}