package io.pragra.learning;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String p = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nisl ex, ultricies vitae egestas et, lobortis sit amet velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vivamus placerat sem quis semper rhoncus. Aenean lacus nisi, dictum vitae pulvinar et, mattis et mi. Quisque ut arcu in elit rutrum ultricies. Proin iaculis mauris consequat leo luctus, eget porttitor tortor mattis. Vestibulum ut euismod nulla, ac tempus libero. Aenean molestie, odio a ornare rhoncus, ipsum purus eleifend lacus, et accumsan sem enim eu nisl. Duis condimentum, nunc a aliquet semper, ipsum sapien aliquet mi, luctus commodo velit turpis sit amet quam. Etiam felis nisi, ornare et condimentum id, pharetra ut ante. Ut vehicula scelerisque dapibus. Curabitur blandit quis erat vel tempor. Donec fermentum purus eget eros porta malesuada";
        String[] s = p.split(" ");
        int countW = 0;
        for (int i = 0; i < s.length; i++) {
            String x = s[i];
            char Array[] = x.toCharArray();
            if (x.length() <= 5) {
                countW++;
            }
        }
        String[] v = p.split(" ");
        int countA = 0;
        for (int i = 0; i < v.length; i++) {
            String x = s[i];
            char[] y = x.toCharArray();
            for (int j=0;j<y.length; j++) {
                char z = y[j];
                if (z =='A' || z == 'a'){
                    countA++;

                }

            }

        }
        System.out.println("Total number of words <=5 "+countW);
        System.out.println("Total number of 'a' letters in the paragraph " +countA);
        //create an Array to hold 10 names initial it should be defaulted to guest *//
        String[]names=new String[10];
        names[0]="Yagna";
        names[1]="Jahnvi Patel";
        names[2]="Amonjot";
        names[3]="Manpreet";
        names[4]="Sukhvinder";
        names[5]="Geetha";
        names[6]="Bhagyashree";
        names[7]="Saveetha";
        names[8]="Rachel";
        names[9]="Justina";

        System.out.println(Arrays.binarySearch(names, "Enayat"));
        System.out.println(Arrays.compare(new int[]{1, 2, 4},1,2 ,new int[]{3, 2, 4},1,2));
        String[] copy = Arrays.copyOfRange(names, 0,5, String[].class);
        System.out.println(Arrays.toString(copy));

        int[] nums =new int[10];
        Arrays.fill(nums,50);
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

//        Student [] students=new Student[5];
//        students[0]=new Student("Ramu","Java");
//        students[1]=new Student("Somu","Java");
//        students[2]=new Student("Manpreet","Devops");
//        students[3]=new Student("Rahul","QA");
//        students[4]=new Student("Shankar","MERN");

//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

        Student student=new Student("Yagna","No course","647-343-6457");
        System.out.println("647-343-6457".matches("[0-9,-]+"));
        StringBuffer st=new StringBuffer("JAVA");
        st.delete(3,4);
        System.out.println(st);
    }
}

class Student implements Comparable<Student>{
    private String name;
    private String course;
    private String phone;

    public Student(String name, String course,String phone) {
        this.name = name;
        this.course = course;
        if(true){
            this.phone=phone;
        }

    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
