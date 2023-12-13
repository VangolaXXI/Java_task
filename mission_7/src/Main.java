public class Main {
    public static void main(String[] args) {
        MyComplexType complexType = new MyComplexType("Сложный тип данных");
        MyEnum enumValue = MyEnum.OPTION1;

        SecondLevel objectA = new SecondLevel(10, enumValue, complexType);
        ThirdLevel objectB = new ThirdLevel(20);
        ThirdLevel objectC = new ThirdLevel(30);

        // Вывод свойств объекта класса SecondLevel
        System.out.println("Свойства объекта objectA (SecondLevel):");
        System.out.println("Field1: " + objectA.getField1());
        System.out.println("Field2: " + objectA.getField2());
        System.out.println("Field3: " + objectA.getField3().getData());

        // Вызов перегруженных методов объекта objectA
        objectA.overloadedMethod1();
        objectA.overloadedMethod2();
        objectA.nonOverridableMethod();

        // Вывод свойств объектов класса ThirdLevel
        System.out.println("\nСвойства объекта objectB (ThirdLevel):");
        System.out.println("Field4: " + objectB.getField4());

        System.out.println("\nСвойства объекта objectC (ThirdLevel):");
        System.out.println("Field4: " + objectC.getField4());
    }
}