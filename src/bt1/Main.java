/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author long
 */
public class Main {
    
    public static LocalDate getDateFromString(String string, DateTimeFormatter format) { // tham khao tren GeeksforGeeks 
        // Convert the String to Date in the specified format 
        LocalDate date = LocalDate.parse(string, format); 

        // return the converted date 
        return date; 
    }  
    
    public static void main(String[] args) throws ParseException {
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // đền thông tin ngày sinh theo format này
        
        HoaDon hoaDon = new HoaDon.Builder()
                .addHeader("HD_01", "Nguyen Truong Long", getDateFromString("26/07/1999", format))
                .addProduct("Laptop Gaming MSI", 1, 22000000, 0.2F)
                .build();
        
        System.out.println("Mã hóa đơn: " + hoaDon.header.getMaHoaDon() + "\n" +
                            "Tên khách hàng: " + hoaDon.header.getTenKhachHang() + "\n" +
                            "Ngày bán: " + hoaDon.header.getNgayBan() + "\n");
        
        System.out.println("----- Thông tin chi tiết hóa đơn -----");
        for (ChiTietHoaDon x : hoaDon.chiTietHD) {
            System.out.println("Tên sản phẩm: " + x.getTenSanPham() + "\n"
                                + "Số lượng: " + x.getSoLuong() + "\n"
                                + "Đơn giá: " + (int)x.getDonGia() + "\n"
                                + "Chiết khấu: " + x.getChietKhau() + "\n");
        }
    }
}
