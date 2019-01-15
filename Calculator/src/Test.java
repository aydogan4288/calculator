public class Test {
    public static void main(String [] argrs) {
        Calculator cal = new Calculator();
        cal.setOperandOne(1.1);
        cal.setOperation("+");
        cal.setOperandTwo(5.2);
        cal.performOperation();
        System.out.println(cal.getResult());
    }
}