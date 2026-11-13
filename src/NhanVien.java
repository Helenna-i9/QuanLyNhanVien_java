
import java.util.Scanner;

public class NhanVien {

    public String HoTen;
    public String QueQuan;
    public String HoKhauThuongTru;
    public String SoDienThoai;
    public String TrinhDo;
    public String ChucVu;
    public Double MLuong;
    public Double ThucLanh;

    private String SoCanCuocCongDan;
    private String SoTaiKhoan;

    public NhanVien(String hoten, String quequan, String hokhau, String sdt, String chucvu, Double mluong, Double  thuclanh, String cccd, String stk ) {
        this.HoTen = hoten;
        this.QueQuan = quequan;
        this.HoKhauThuongTru = hokhau;
        this.SoDienThoai = sdt;
        this.ChucVu = chucvu;
        this.MLuong = mluong;
        this.ThucLanh = thuclanh;
        this.SoCanCuocCongDan = cccd;
        this.SoDienThoai = sdt; 
    }

    public NhanVien() {
        
    }

    public String getSoCCCD(){
        return SoCanCuocCongDan;
    }

    public void setSoCCCD(String soCCCD) {
        this.SoCanCuocCongDan = soCCCD;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String STK) {
        this.SoTaiKhoan = STK;
    }

    public Double TinhHeSoLuong() {
        if (TrinhDo.equalsIgnoreCase("ĐH")) {
            return 2.34;
        }else if (TrinhDo.equalsIgnoreCase("CĐ")) {
            return 2.0;
        }else if (TrinhDo.equalsIgnoreCase("TC")) {
            return 1.5;
        }else {
            return 1.2;
        }
     
    }

    public Double TinhPhuCap() {
        if (ChucVu.equalsIgnoreCase("GĐ")) {
            return 5000000d;
        }else if (ChucVu.equalsIgnoreCase("PGĐ")) {
            return 4000000d;
        }else if (ChucVu.equalsIgnoreCase("TP")) {
            return 3000000d;
        }else if (ChucVu.equalsIgnoreCase("PP")) {
            return 2500000d;
        }else {
            return 2000000d; //Nhân viên
        }
    }

    public Double TinhThucLanh() {
        this.ThucLanh = TinhHeSoLuong() * this.MLuong + TinhPhuCap();
        return this.ThucLanh;
    }

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        HoTen = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        QueQuan = sc.nextLine();
        System.out.print("Nhập hộ khẩu thường trú: ");
        HoKhauThuongTru = sc.nextLine();
        System.out.print("Nhập số CCCD: ");
        setSoCCCD(sc.nextLine());
        System.out.print("Nhập số điện thoại: ");
        SoDienThoai = sc.nextLine();
        System.out.print("Nhập số tài khoản: ");
        setSoTaiKhoan(sc.nextLine());
        System.out.print("Nhập trình độ (ĐH, CĐ, TC, Khác): ");
        TrinhDo = sc.nextLine();
        System.out.print("Nhập chức vụ (GĐ, PGĐ, TP, PP, NV): ");
        ChucVu = sc.nextLine();
        System.out.print("Nhập mức lương cơ bản: ");
        MLuong = Double.valueOf(sc.nextLine());

        TinhThucLanh();
    }   

    public void xuatThongTin() {
        System.out.println("------------------------------------");
        System.out.println("Họ tên: " + HoTen);
        System.out.println("Quê quán: " + QueQuan);
        System.out.println("Hộ khẩu: " + HoKhauThuongTru);
        System.out.println("Số CCCD: " + getSoCCCD());
        System.out.println("SĐT: " + SoDienThoai);
        System.out.println("Số TK: " + getSoTaiKhoan());
        System.out.println("Trình độ: " + TrinhDo + " (Hệ số: " + TinhHeSoLuong() + ")");
        System.out.println("Chức vụ: " + ChucVu + " (Phụ cấp: " + String.format("%,.0f", TinhPhuCap()) + " VNĐ)");
        System.out.println("Mức lương cơ bản: " + String.format("%,.0f", MLuong) + " VNĐ");
        System.out.println("Thực lãnh: " + String.format("%,.0f", ThucLanh) + " VNĐ");
    }
}


