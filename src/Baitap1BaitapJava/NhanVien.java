package Baitap1BaitapJava;

public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongSoGioLam;   
    void insertRecord(String h, int t, String d, double s, int tongso){  //phuong thuc  
        ten = h;
        tuoi = t;
        diaChi = d;
        tienLuong = s;
        tongSoGioLam = tongso;
    }  
    void displayNhanVien(){
        System.out.println("Ho ten : " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Tien luong: " + tienLuong);
        System.out.println("Tong so gio lam: " + tongSoGioLam);
    } //phuong thuc  
    // String getThongTin(){
    //     // ham tra ve thong tin cua nhan vien

    // }
    // double tinhThuong(){
    //     // tinh toan va tra ve so tien thuong cua nhan vien.
    // }
    public static void main(String args[]){
        NhanVien c1 = new NhanVien();
        NhanVien c2 = new NhanVien();
        c1.insertRecord("Hoang Thanh", 13, "Kon Tum", 100, 200);
        c2.insertRecord("Tien len", 17, "Khanh Hoa", 300, 240);
        c1.displayNhanVien();
        c2.displayNhanVien();
    } 

}
