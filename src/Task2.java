public class Task2 {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Такого треугольника не существует");
        } else {
            System.out.println("Треугольник существует");
        }
    }
}
