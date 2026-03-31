class Greater {

    static {
        int num1 = 190;
        int num2 = 50;

        if(num1 > num2){
            System.out.println("%d is greater".formatted(num1));
        } else {
            System.out.println("%d is greater".formatted(num2));
        }

        System.exit(0); // important
    }

    public static void main(String[] args) {
        // empty main (required by JVM)
    }
}