public class Task5 {
    public static void main(String[] args) {
        int a = -5, b = -3, c = 1, x = 0, y = 0;
        if (a > 0) {
            x++;
        }
        if (a < 0) {
            y++;
        }
        if (b > 0) {
            x++;
        }
        if (b < 0) {
            y++;
        }
        if (c > 0) {
            x++;
        }
        if (c < 0) {
            y++;
        }
        System.out.println("Положительных - " + x);
        System.out.println("Отрицательных - " + y);
    }
}
