package Java;

public class BTH_2 {
    public void Cau1() {
    class taiKhoan {
        private long soTK;
        private String tenTK;
        private double soTien;
        public taiKhoan() {
            System.out.println("Constructing a new acount");
        }
        public taiKhoan(long sotk, String ten, double tien) {
            this.soTK = sotk;
            this.tenTK = ten;
            this.soTien = tien;
            System.out.println("Constructing a new acount");
        }
        public void inTaiKhoan() {
            System.out.println("So tai khoan: " + this.soTK);
            System.out.println("Ten chu tai khoan: " + this.tenTK);
            System.out.println("So du tai khoan: " + this.soTien);
        }
        public boolean napTien(double st) {
            if(st > 0) {
            this.soTien += st;
            System.out.println("Nap tien thanh cong, so du tai khoan " + this.tenTK + ": " + this.soTien);
            return true;
            }
            else {
                System.out.println("So tien nap khong hop le");
                return false;
            }
        }
        public boolean chuyenKhoan(taiKhoan a, double st) {
            if(st > 0 && soTien >= st) {
                this.soTien -= st;
                a.napTien(st);
                System.out.println("Chuyen tien thanh cong");
                System.out.println("So du con lai trong tai khoan " + this.tenTK +": " + this.soTien);
                return true;
            }
            else {
                System.out.println("So du khong du de chuyen tien");
                return false;
            }
        }
        }
        taiKhoan a = new taiKhoan(123, "Quang Huy", 50000);
        a.napTien(30000);
        taiKhoan b = new taiKhoan(122,"Pham Huy", 30000);
        a.chuyenKhoan(b,15000);

    }

    public void Cau2() {
        class Sach {
            protected long maSach;
            protected String tenSach;
            protected double donGia;
            protected int soLuong;
            protected String nxb;
            public Sach() {
                System.out.println("Xuat ban sach moi");
            }
            public Sach(long ma, String ten, double gia, int soLuog, String nXB){
                System.out.println("Xuat ban sach co tham so");
                this.maSach=ma;
                this.tenSach=ten;
                this.donGia=gia;
                this.nxb=nXB;
            }
            public void thongTinSach() {
                System.out.println("Ma sach: " + maSach);
                System.out.println("Ten sach: " + tenSach);
                System.out.println("Don gia: " + donGia);
                System.out.println("So luong: " + soLuong);
                System.out.println("Nha xuat ban: " + nxb);
            }
            public double thanhTien () {
                return 0;
            }
        }
        
        class sachTieuThuyet extends Sach {
            protected boolean tinhTrang;
            public sachTieuThuyet() {}
            public sachTieuThuyet(long ma, String ten, double dG, int sL, String nxb, boolean tTrang) {
                super(ma,ten,dG,sL,nxb);
                this.tinhTrang = tTrang;
            }
            @Override
            public void thongTinSach() {
                super.thongTinSach();
                System.out.println("Tinh trang: " + tinhTrang);
            }
            @Override
            public double thanhTien() {
                if(tinhTrang == true)
                {
                return soLuong * donGia;
                }
                else 
                return soLuong * donGia * 20/100;
            }
        }
        class sachTrinhTham extends Sach {
            protected float thue;
            public sachTrinhTham() {};
            public sachTrinhTham(long ma, String ten, double dG, int sol, String nxb, float thue){
                super(ma,ten,dG,sol,nxb);
                this.thue=thue;
            };
            @Override
            public void thongTinSach() {
                super.thongTinSach();
                System.out.println("Thue: " + thue);
            }
            @Override
            public double thanhTien() {
                return  soLuong*donGia+thue;
            }
        }
        sachTieuThuyet tt = new sachTieuThuyet(01,"Thien Ly Oi",5000, 100, "Jack97", true);
        tt.thongTinSach();
        System.out.println("Thanh tien: " + tt.thanhTien() + "VND");
        System.out.println();
        sachTrinhTham tth = new sachTrinhTham(02,"Chung Ta Cua Tuong Lai",20000,1000,"Son Tung MTP", 1000f );
        tth.thongTinSach();
        System.out.println("Thanh tien: " + tth.thanhTien()  +" VND");
        
    }
    
    
    
}


