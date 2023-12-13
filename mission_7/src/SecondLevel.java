class SecondLevel extends FirstLevel {
    private MyComplexType field3;

    public SecondLevel(int field1, MyEnum field2, MyComplexType field3) {
        super(field1, field2);
        this.field3 = field3;
    }

    public MyComplexType getField3() {
        return field3;
    }

    // Перегруженный метод 1
    public void overloadedMethod1() {
        System.out.println("Это перегруженный метод 1 в SecondLevel");
    }

    // Перегруженный метод 2
    public void overloadedMethod2() {
        System.out.println("Это перегруженный метод 2 в SecondLevel");
    }

    // Неперезаписываемый метод
    public final void nonOverridableMethod() {
        System.out.println("Этот метод нельзя переопределить");
    }
}
