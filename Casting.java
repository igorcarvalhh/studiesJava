public class Casting {
    public static void main(String[] args) {
        // Type casting is when you assign a value of one primitive data type to another type.

        float myFloat = 2.33f;
        // int myInt = myFloat; ERROR
        int myInt = (int) myFloat;
        
        System.out.println(myInt);
    }
}
