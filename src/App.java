public class App {
    public static void main(String[] args) throws Exception {
        System.err.println("Hello Xin chào Việt Nam");
        System.out.println("Nước Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam");       
        
        NhanVien nv1 = new NhanVien();
        
        System.out.println("=== NHẬP THÔNG TIN NHÂN VIÊN ===");
        nv1.NhapThongTin();

        System.out.println("\n=== THÔNG TIN NHÂN VIÊN VỪA NHẬP ===");
        nv1.xuatThongTin();
    }
}

