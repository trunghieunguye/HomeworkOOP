package Ex1;

import java.util.Scanner;
public class Student {
    public int Id;
    public String Name;
    public String Class;
    public String Course;


    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Class='" + Class + '\'' +
                ", Course='" + Course + '\'' +
                '}';
    }


    public void nhapthongtin() {
        System.out.print("Nhập mã sinh viên: ");
        this.Id = new Scanner(System.in).nextInt();

        System.out.print("Nhập tên sinh viên: ");
        this.Name = new Scanner(System.in).nextLine();

        System.out.print("Nhập lớp sinh viên: ");
        this.Class = new Scanner(System.in).nextLine();

        System.out.print("Nhập khóa sinh viên: ");
        this.Course = new Scanner(System.in).nextLine();
    }

    public void tensinhvien() {
        System.out.print("Nhập tên sinh viên: ");
        this.Name = new Scanner(System.in).nextLine();
    }


    public void in() {
        Object ten;
        System.out.printf(String.valueOf(Id), Name, Class, Course);
    }

    public void equalsIgnoreCase(String s) {
        return;
    }
}




