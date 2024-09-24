package Tuan2;

import java.util.Scanner;

public class Bai2 {
    private String ten;
    private   double chieuCao;
    private int tuoi;
    private boolean thichLapTrinh;

    public Bai2() {
    }

    public Bai2(String ten, boolean thichLapTrinh, int tuoi, double chieuCao) {
        this.ten = ten;
        this.thichLapTrinh = thichLapTrinh;
        this.tuoi = tuoi;
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return "information " + "\n"+
                "ten='" + ten + '\'' +
                ", chieuCao=" + chieuCao +
                ", tuoi=" + tuoi +
                ", thichLapTrinh=" + (thichLapTrinh ? "Co " :"Khong")
                ;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isThichLapTrinh() {
        return thichLapTrinh;
    }

    public void setThichLapTrinh(boolean thichLapTrinh) {
        this.thichLapTrinh = thichLapTrinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public void Nhap (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi");
        this.tuoi=sc.nextInt();
        System.out.println("Nhap Ten");
        this.ten=sc.next();
        System.out.println("Nhap Chieu cao");
        this.chieuCao=sc.nextDouble();
        System.out.println("Co thich lap trinh khong (true/false)");
        this.thichLapTrinh=sc.hasNext();
        sc.close();
    }
    public void  In() {
        System.out.println(this.toString());
    }
}
