//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //non-primitive datatypes - strings

    String firstName = "Pooja";             //String Constant Pool - location of string creation
    String firstname1 = "Pooja";

    System.out.println("two strings with same content : " + (firstName == firstname1));

    String lastName = "Sali";               //String Constant Pool - location of string creation
    String user = "Snehal";

    System.out.println("-----------------------");
    String username = new String("Snehal");     //String created on heap and reference og object created on stack

    System.out.println("\ncheck whether two strings are equal by using equals method : "
            + (user.equals(username)));                //equals method is used to compare two objects

    System.out.println("-----------------------");
    System.out.println("\ncheck whether two strings are equal by using == : "
            + (user == username));                     // == is used to compare two objects

    System.out.println("\nlower case : " + user.toLowerCase());
    System.out.println("\n upper case : " + user.toUpperCase());
    System.out.println("\n hash code : " + user.hashCode());

    System.out.println("\nsub string method : " + user.substring(4));

    System.out.println("\nsub string method : " + user.substring(2,5));
}


//public class Main{
//    public static void main(){
//        System.out.println("Welcome!");
//    }
//}