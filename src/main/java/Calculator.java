public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return this.a + this.b;
    }


    public int substract() {
        return this.a - this.b;
    }

    public int multiply() {
        return this.a * this.b;
    }
}
