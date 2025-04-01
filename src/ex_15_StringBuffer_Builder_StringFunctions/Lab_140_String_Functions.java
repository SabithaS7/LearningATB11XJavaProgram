package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_140_String_Functions {
    public static void main(String[] args) {
        String name = "Sabi";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException

        // 2. concat()
        System.out.println(name.concat(" tha"));

        // 3. contains()
        System.out.println(name.contains("om"));

        // 4. equals()
        System.out.println(name.equals("Sabi"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sabi"));

        // 6. indexOf() //  sabi -> ? o
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('b', 'B'));

        // 9. split()

        String name4 = "sabitha@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("SABITHA".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sabitha".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    Sabitha S     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Sabitha"));


        StringBuilder stringBuilder = new StringBuilder("Sabitha");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());


        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


        String s11 = "Sabi";
        String s21 = s11.concat("tha");
        System.out.println(s21);

//        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);



        String n = "sabitha";
        System.out.println(n.indexOf("t"));
        System.out.println(n.lastIndexOf("a"));
        System.out.println(n.lastIndexOf("a"));

    }
}
