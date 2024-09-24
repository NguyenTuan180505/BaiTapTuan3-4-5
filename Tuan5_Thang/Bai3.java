package Tuan2;

import java.util.Scanner;

public class Bai3 {
    private int a;
    private int b;
    public void nhapHaiSoNguyen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
       this.a= sc.nextInt();
System.out.println("Nhap b:");
this.b= sc.nextInt();

    }
    public int tong(){
        return this.a+this.b;
    }
    public  int hieu(){
        return this.a-this.b;
    }
    public int nhan(){
        return this.a*this.b;
    }
    public double thuong(){
        return this.a*1.0/this.b;
    }
    public double phanDu(){
        return this.a*1.0 % this.b;
    }
}
