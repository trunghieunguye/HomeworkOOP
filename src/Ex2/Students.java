package Ex2;
import java.util.Collections;
import java.util.Scanner;

public class Students {
        int idNumber;
        String name;
        int studentClass;
        int academicYear;

        public Students() {
            this.idNumber = idNumber;
            this.name = name;
            this.studentClass = studentClass;
            this.academicYear = academicYear;
        }

    @Override
    public String toString() {
        return "Students{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", academicYear=" + academicYear +
                '}';
    }


    public void enterInfor() {
                System.out.print("Enter student's name :");
                this.name = new Scanner(System.in).nextLine();
                System.out.print("Enter student's ID number :");
                this.idNumber = new Scanner(System.in).nextInt();
                System.out.print("Enter student's class :");
                this.studentClass = new Scanner(System.in).nextInt();
                System.out.print("Enter the academic-year of student :");
                this.academicYear = new Scanner(System.in).nextInt();

            }

    public void displayInfor() {

    }
}
