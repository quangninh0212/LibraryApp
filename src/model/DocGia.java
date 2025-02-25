/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class DocGia {
    private String maDG, hoTen, gioiTinh, ngaySinh, doiTuong;
    private int userID;
    private String taiKhoan;

    public DocGia() {
    }

    public DocGia(String maDG, String hoTen, String gioiTinh, String ngaySinh, String doiTuong, int userID) {
        this.maDG = maDG;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.doiTuong = doiTuong;
        this.userID = userID;
    }
    
    public DocGia(String maDG, String hoTen, String gioiTinh, String ngaySinh, String doiTuong, int userID, String taiKhoan) {
        this.maDG = maDG;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.doiTuong = doiTuong;
        this.userID = userID;
        this.taiKhoan = taiKhoan;
    }
    
    public DocGia(String hoTen, String gioiTinh, String ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }
    
    public DocGia(String hoTen, String gioiTinh, String ngaySinh, String doiTuong) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.doiTuong = doiTuong;
    }


    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    
    
}
