package Java;

import java.util.Scanner;
public class BTH_1 {

    public void Cau1()
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ban kinh duong tron: ");
        int r = sc.nextInt();
        System.out.println("Chu vi duong tron: " + (float)2*Math.PI*r);
    }
    public void Cau2() {
        //Bài 2
        System.out.print("Nhap so a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.print("Nhap so b: ");
        float b = new Scanner(System.in).nextFloat();
        float x = a/b;
        System.out.printf("%.3f",x);
    }
    public void Cau3() {

    class phanso {
    int tu, mau;
public phanso(int tu, int mau) {
    super();
    this.tu = tu;
    this.mau = mau;
}
public int getTu() {
    return tu;
}
public int getMau() {
    return mau;
}
public void setTu(int tu) {
    this.tu = tu;
}
public void setMau(int mau) {
    this.mau = mau;
}

    

    public int timUSCLN(int a, int b) {
        if(b==0) return a;
        else return timUSCLN(b, a%b);
    }
    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
 
    public void congPhanSo(phanso ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        phanso phanSoTong = new phanso(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tong hai phan so = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
  
    public void truPhanSo(phanso hieu) {
        int ts = this.getTu() * hieu.getMau() - hieu.getTu() * this.getMau();
        int ms = this.getMau() * hieu.getMau();
        phanso phanSoHieu = new phanso(ts, ms);
        System.out.println("Hieu hai phan so = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
 
    public void nhanPhanSo(phanso nhan) {
        int ts = this.getTu() * nhan.getTu();
        int ms = this.getMau() * nhan.getMau();
        phanso phanSoTich = new phanso(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tich hai phan so = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
 
    public void chiaPhanSo(phanso thuong) {
        int ts = this.getTu() * thuong.getMau();
        int ms = this.getMau() * thuong.getTu();
        phanso phanSoThuong = new phanso(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thuong hai phan so = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
    }
    System.out.println("Nhap phan so dau tien");
    System.out.print("Nhap tu so: ");
    int tu1 = new Scanner(System.in).nextInt();
    System.out.print("Nhap mau so: ");
    int mau1 = new Scanner(System.in).nextInt();
    System.out.println("Nhap phan so thu hai");
    System.out.print("Nhap tu so: ");
    int tu2 = new Scanner(System.in).nextInt();
    System.out.print("Nhap mau so: ");
    int mau2 = new Scanner(System.in).nextInt();

    phanso ps1 = new phanso(tu1, mau1);
    phanso ps2 = new phanso(tu2, mau2);
    
    ps1.congPhanSo(ps2);
    ps1.truPhanSo(ps2);
    ps1.nhanPhanSo(ps2);
    ps1.chiaPhanSo(ps2);
}

    public void Cau4() {
        System.out.println("Nhap chuoi x:");
        String x = new Scanner(System.in).nextLine();
        System.out.println("Nhap chuoi y:");
        String y = new Scanner(System.in).nextLine();


        System.out.println("Chieu dai chuoi x" + x.length());
        System.out.println("Ba ki tu dau tien cua x:" + x.substring(0,3));
        System.out.println("Ba ki cuoi cua x:" + x.substring(x.length()- 3));
        System.out.println("Ki tu thu 6 cua chuoi x: " + x.charAt(5));
        String newS = x.substring(0, 3) + y.substring(y.length() - 3);
        if(x.equals(y) == true) System.out.println("Chuoi x = chuoi y");
        else System.out.println("Chuoi x khong bang chuoi y");

    }
}

