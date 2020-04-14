package app;

public class GiaoVien {
    String monDay;
    String toBoMon;
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;
    void insertRecord(String h, int t, String d, String s, String m, String tb){  //phuong thuc  
        hoTen = h; 
        tuoi = t;
        diaChi = d;
        sdt = s;
        monDay = m;
        toBoMon = tb;
    }  
         
    void displayGiaoVien(){
        System.out.println("Ho ten : " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("So dien thoai: " + sdt);
        System.out.println("Mon Day: " + monDay);
        System.out.println("To Bo Mon: " + toBoMon);
    } //phuong thuc  
    public static void main(String args[]){
        GiaoVien c1 = new GiaoVien();
        GiaoVien c2 = new GiaoVien();
        c1.insertRecord("Giang Thi Thu Trang", 38, "Thanh Hoa", "002383223", "The Duc", "TD01");
        c2.insertRecord("Tran Tien Hai", 41, "Nam Dinh", "002383777", "Chuyen Dong Co Hoc", "PS03");       
        c1.displayGiaoVien();
        c2.displayGiaoVien();
    }

}