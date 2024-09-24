package Tuan2;

import java.util.Scanner;

public class Bai1 {
    private String name;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao Ten ");
        this.name = sc.nextLine();

    }

    public void in() {
        System.out.println(this.name);
    }

    private String ten;
}
