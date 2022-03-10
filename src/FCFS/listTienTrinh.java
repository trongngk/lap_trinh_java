package FCFS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class listTienTrinh {
     // list chua thoi gian cua cac tien trinh
    ArrayList <TienTrinh> listTT = new ArrayList<>();
    float burst_time = 0;    // Thời gian hoàn thành tiến trình
    float ave_time = 0;      // Thời gian chờ của 1 tiến trình
    float average_time = 0;  // Thời gian chờ trung bình của tất cả tiến trình
    int sotientrinh = 0;    
    public void DocFile(){
        try{
            File f = new File("input.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String str; // Biến đọc dòng trong file
            int i = 0;  // Biến đếm
            while ((str = br.readLine()) != null)
            {   
                if(i == 0){
                    sotientrinh = Integer.parseInt(str); // đọc số tiến trình, ép kiểu int
                    i++;
                }
                else{
                    String obj[] = str.split(":");
                    // Đọc thời gian thực hiện, thời gian xuất hiện, lưu vào listTT
                    listTT.add( new TienTrinh(Float.parseFloat(obj[0]),Float.parseFloat(obj[1])));
                }

            }
            br.close();
            fr.close();
        }catch(Exception e){
            System.out.println(e); // Thông báo nếu có lỗi xảy ra
        }           

    }
    
    public void ThoiGianCho1TT(){
        listTT.get(0).thoigianchodoi = 0; // Tiến trình đầu tiên không cần chờ
        for(int i = 1; i < sotientrinh; i++){ 
            // Tính thời gian hoàn thành tiến trình
            burst_time += listTT.get(i-1).thoigianthuchien; 
            listTT.get(i).thoigianchodoi = burst_time - listTT.get(i).thoigianxuathien;
        }
    }
    public void ThoiGianChoTBTT(){
        for(int i = 0; i < sotientrinh ; i++){
            ave_time += listTT.get(i).thoigianchodoi; // Tính tổng thời gian chờ
        }
        average_time = ave_time/sotientrinh; // Tính thời gian chờ trung bình

        System.out.println("Thoi gian cho doi trung binh cua cac tien trinh la: " + average_time);
    }
    public void table(){
        System.out.println("So tien trinh la: " + sotientrinh);
        System.out.println("|Process|Thoi gian thuc hien|Thoi gian xuat hien|Thoi gian cho doi|");
        for(int i = 0; i < listTT.size(); i++){
            System.out.printf("| %3d   | %17.2f | %17.2f | %15.2f |\n",i+1,listTT.get(i).thoigianthuchien,listTT.get(i).thoigianxuathien,listTT.get(i).thoigianchodoi);
        }
    }
    
}