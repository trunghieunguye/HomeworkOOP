package Ex3;

import java.util.Scanner;

public class Rectange {
    double width;
    double height;
    String color;

    public Rectange() {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth() {
        System.out.print("Enter new width : ");
        this.width = new Scanner(System.in).nextDouble();
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight() {
        System.out.print("Enter new height : ");
        this.height= new Scanner(System.in).nextDouble();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor() {
        System.out.print("Enter new color : ");
        this.color= (new Scanner(System.in).nextLine());
    }
    public void findArea() {
        System.out.println("The area of rectange : " + this.width * this.height);
    }
    public void findPerimeter(){
        System.out.println("The perimeter of rectange " + (this.width+this.height)*2);
    }
    public void letInter(){
        System.out.print("Enter width : ");
        this.width = new Scanner(System.in).nextDouble();
        System.out.print("Enter height : ");
        this.height = new Scanner(System.in).nextDouble();
        System.out.print("Enter color : ");
        this.color = new  Scanner(System.in).nextLine();
    }
}
