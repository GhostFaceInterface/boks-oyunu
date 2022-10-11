public class cu{
    public static void main(String[] args) {
        fighter f1 = new fighter("Mark", 15, 100, 90, 20);
        fighter f2 = new fighter("Alex", 10, 95, 100, 25);
        ring r = new ring(f1, f2, 90, 100);
        r.run();
    }



}