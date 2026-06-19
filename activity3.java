
public class activity3 {
    public static void main(String[] args) {
        // Primitive data types
        int myInt = 10;
        double myDouble = 3.14;
        char myChar = 'A';
        boolean myBoolean = true;
        float myFloat = 2.5f;
        long myLong = 100000L;


        // Reference data types
        String myString = "Hello, World!";
        int[] myArray = {1, 2, 3, 4, 5};

        // Output the values
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);
        System.out.print("Array: ");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println("long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Data types in Java include primitive types (int, double, char, boolean, float, long) and reference types (String, arrays).");
        System.out.println("Primitive types are stored directly in memory, while reference types store a reference to the object in memory.");
        System.out.println("String is a special class in Java that represents a sequence of characters and provides various methods for string manipulation.");

        //Non Primitive data types
        String name = "ben Dover"; // String is a non-primitive data type
        System.out.println("Name: " + name);