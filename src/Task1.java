public class Task1 {
    public static void main(String[] args) {
        int a = -125;
        if (a > 0 && a < 10) {
            System.out.println("Это однозначное положительное число");
        } else if (a < 0 && a > -10) {
            System.out.println("Это однозначное отрицательное число");
        } else if (a == 0) {
            System.out.println("Это ноль");
        } else if (a >= 10 && a < 100) {
            System.out.println("Это двузначное положительное число");
        } else if (a <= -10 && a > -100) {
            System.out.println("Это двузначное отрицательное число");
        } else if (a >= 100 && a < 1000) {
            System.out.println("Это трёхзначное положительное число");
        } else if (a <= -100 && a > -1000) {
            System.out.println("Это трёхзначное отрицательное число");
        } else if (a >= 1000 && a >= -1000) {
            System.out.println("Больше 3 цифр..");
        }
    }
}
