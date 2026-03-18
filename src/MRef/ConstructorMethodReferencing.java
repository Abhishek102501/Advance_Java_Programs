package MRef;
public class ConstructorMethodReferencing {
public static void main(String[] args) {
	Calculator.CalcFactory factory = Calculator::new;
	Calculator c = factory.create(20,4);
}
}
