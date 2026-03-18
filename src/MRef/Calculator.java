package MRef;

class Calculator {

    Calculator() {
        System.out.println("Default Constructor Called!");
    }

    Calculator(int n1, int n2) {
        System.out.println("Division: " + (n1 / n2));
    }

    @FunctionalInterface
    interface CalcFactory {
        Calculator create(int n1, int n2);
    }
}

