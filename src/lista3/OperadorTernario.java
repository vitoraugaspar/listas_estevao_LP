package lista3;

public class OperadorTernario {
    static void main() {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        System.out.println(a < b ? "a < b" : "a >= b");
    }
}
