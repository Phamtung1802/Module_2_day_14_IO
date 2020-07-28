import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ListSanPham sanPham=new ListSanPham();
//        sanPham.addAndSave(new SanPham("001","Nokia 1100i","Nokia","Ben",20));
//        sanPham.addAndSave(new SanPham("002","iPhone 8","Apple","Xau",2000));
//        sanPham.addAndSave(new SanPham("003","Galaxy A1","SamSung","Dat",3000));
//        sanPham.addAndSave(new SanPham("004","Bphone","Bkav","De No",20));
        for(SanPham a:sanPham){
            System.out.println(a.getTenSanPham());
        }
        System.out.println(sanPham.findInfo("Galaxy A1"));
    }
}
