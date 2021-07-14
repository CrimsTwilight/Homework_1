public class Task7 {
    public static void main(String[] args) {
        int a = 293723;
        if ((a % 100 > 10 && a % 100 < 20) || a % 10 == 0 || a % 10 > 4) {
            System.out.println(a + " программистов");
        } else if (a % 10 == 1) {
            System.out.println(a + " программист");
        } else {
            System.out.println(a + " программиста");
        }
    }
}
