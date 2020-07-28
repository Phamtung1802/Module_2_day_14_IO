import java.io.*;
import java.util.ArrayList;

public class ListSanPham extends ArrayList<SanPham> {
    File list=new File("danhSach.txt");


    public ListSanPham() throws IOException, ClassNotFoundException {
        this.addAll(this.getList());
    }

    public void addAndSave(SanPham sanPham) throws IOException {
        OutputStream listOutputStream=new FileOutputStream(list);
        ObjectOutputStream os=new ObjectOutputStream(listOutputStream);
        InputStream is=new FileInputStream(list);
        this.add(sanPham);
        os.writeObject(this);
    }

    public void delete(int index) throws IOException {
        OutputStream listOutputStream=new FileOutputStream(list);
        ObjectOutputStream os=new ObjectOutputStream(listOutputStream);
        this.remove(index);
        os.writeObject(this);
    }

    public void clearSave() throws FileNotFoundException {

        list.delete();

    }

    public ListSanPham getList() throws IOException, ClassNotFoundException {
        InputStream is=new FileInputStream(list);
        ObjectInput objectInput=new ObjectInputStream(is);
        return (ListSanPham) (objectInput.readObject());
    }

    public String findInfo(String a){
        SanPham result=null;
        for(SanPham b:this){
            if(a.compareTo(b.getTenSanPham())==0){
                result=b;
            }
        }
        return "Ma "+ result.getMaSanPham()+" Ten "+ result.getTenSanPham()+" HSX "+result.getHangSanXuat()+" Mo ta "+ result.getMota()+" gia "+result.getGia();
    }

}
