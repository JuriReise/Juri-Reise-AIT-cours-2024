public class Main {
    private static Object World;

    public static void main(String[] args) {

        String myName = "Hello Word, " + "my name is Juri";
        myName.length();
        int mylenght = myName.length();
        System.out.println(mylenght);

        String uCase = myName.toUpperCase();
        System.out.println(uCase);

        String lCase = myName.toLowerCase();
        System.out.println(lCase);

        String sString = myName.substring(5);
        System.out.println(sString);

        String dString = myName.substring(5, 9);
        System.out.println(dString);

        char myChar = myName.charAt(1);
        System.out.println(myChar);

        boolean equalsOrNot = "my name is Juri".equals("my name is Juri");
        boolean equalsOrNot2 = "This is Jamie".equals("Hello Word");
        return;

    }

}