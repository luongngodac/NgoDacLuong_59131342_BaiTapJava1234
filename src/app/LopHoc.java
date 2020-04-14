package app;

public class LopHoc {
    //Them hoc sinh in danh sach hoc sinh
    public static void main(){
        HocSinh c3 = new HocSinh();
        HocSinh c4 = new HocSinh();
        c3.insertRecord("Tien Hoang", 19, "Ha Nam", "002987723", "PSC93", "Noi");
        c4.insertRecord("Thu Hien", 21, "Ninh Thuan", "002386576", "OTP23", "Viet");       
        c3.displayHocSinh();
        c4.displayHocSinh();
    }
    //Them giao vien, in danh sach giao vien
    public static void main(String args[]){
        GiaoVien c3 = new GiaoVien();
        GiaoVien c4 = new GiaoVien();
        c3.insertRecord("Bui Cong Manh", 38, "Ninh Binh", "002388966", "Tieng Anh B1.1", "TA88");
        c4.insertRecord("Tran Tien Hai", 41, "Can Tho", "0023833244", "Tieng Trung Gian The", "TT09");       
        c3.displayGiaoVien();
        c4.displayGiaoVien();
    }

}