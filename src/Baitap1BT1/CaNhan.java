package Baitap1BT1;
public class CaNhan {
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;
    void insertRecord(String h, int t, String d, String s){  //phuong thuc  
        hoTen = h;
        tuoi = t;
        diaChi = d;
        sdt = s;
    }  
         
    void displayCaNhan(){
        System.out.println("Ho ten : " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("So dien thoai: " + sdt);
    } //phuong thuc  
    public static void main(String args[]){
        CaNhan c1 = new CaNhan();
        CaNhan c2 = new CaNhan();
        c1.insertRecord("Hoang Thanh", 13, "Kon Tum", "012334553");
        c2.insertRecord("Tien len", 17, "Khanh Hoa", "013843854");
        c1.displayCaNhan();
        c2.displayCaNhan();
    } 
    
}
