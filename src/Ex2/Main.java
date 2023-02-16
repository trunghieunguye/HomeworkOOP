package Ex2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int j;

    public static void main(String[] args) {
        System.out.print("Enter the number of students : ");
        int n = new Scanner(System.in).nextInt();
        Students[] students = new Students[n];
        for (j = 0; j < students.length; j++) {
            students[j] = new Students();
            students[j].enterInfor();
            System.out.println(students[j]);


        }
        System.out.println(students.toString());
    }
}

