package io.pragra.learning;

public class reverseName {
//
//    @Override
//    public String toString() {
//        String()
//        return "reverseName{}";
//    }
//
//    public reverseName() {
//        String array;
//        char [] arr;
//    }

    public static String reverse(String str) {
        char[] arr= new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[str.length()-i-1] = str.charAt(i);
        }
        String str2 = new String(arr);
        return str2;
    }

    public static void main(String[] args) {

        System.out.println("Reverse of String is " + reverse("AARNIK"));
    }
}


