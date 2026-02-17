package AdvJava01;

class Sum {
    int a, b;

    Sum(int a, int b){
        this.a = a;
        this.b = b;
    }

    void add() {
        System.out.println("Addition: " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication: " + (a * b));
    }

    void div() {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class Constructor01 {
    public static void main(String[] args) {
        Sum s = new Sum(15, 3);
        s.mul();
        s.add();
        s.sub();
        s.div();
    }
}
