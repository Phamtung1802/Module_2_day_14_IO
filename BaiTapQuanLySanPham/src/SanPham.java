import java.io.Serializable;

public class SanPham implements Serializable {
    String maSanPham, TenSanPham,HangSanXuat,Mota;
    int Gia;

    public SanPham(String maSanPham, String tenSanPham, String hangSanXuat, String mota, int gia) {
        this.maSanPham = maSanPham;
        TenSanPham = tenSanPham;
        HangSanXuat = hangSanXuat;
        Mota = mota;
        Gia = gia;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        HangSanXuat = hangSanXuat;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }
}
