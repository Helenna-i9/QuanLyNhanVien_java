public class QLNV {

    public String HoTen;
    public String QueQuan;
    public String HoKhauThuongTru;
    
    public String SoDienThoai;
    
    public String ChucVu;
    public Double MLuong;
    public Double ThucLanh;

    private String SoCanCuocCongDan;
    private String SoTaiKhoan;

    public QLNV(String hoten, String quequan, String hokhau, String sdt, String chucvu, Double mluong, Double  thuclanh, String cccd, String stk ) {
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

    public String getSoCCCD(){
        return SoCanCuocCongDan;
    }

    



}
