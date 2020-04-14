package app;

public class HocSinh {
    String lop;
    String nangKhieu;
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;
    void insertRecord(String h, int t, String d, String s, String l, String n){  //phuong thuc  
        hoTen = h;
        tuoi = t;
        diaChi = d;
        sdt = s;
        lop = l;
        nangKhieu = n;
    }   
         
    void displayHocSinh(){
        System.out.println("Ho ten : " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("So dien thoai: " + sdt);
        System.out.println("Lop: " + lop);
        System.out.println("Nang Khieu: " + nangKhieu);
    } //phuong thuc  
    public static void main(String args[]){
        HocSinh c1 = new HocSinh();
        HocSinh c2 = new HocSinh();
        c1.insertRecord("Thao Lanh", 18, "Thanh Hoa", "002383223", "TBA12", "Nghe");
        c2.insertRecord("Tran Phong", 21, "Nam Dinh", "002383777", "INS23", "Doc");       
        c1.displayHocSinh();
        c2.displayHocSinh();
    }

}