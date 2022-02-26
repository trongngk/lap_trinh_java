package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class file1 {
    //public static void main(String[] args) throws FileNotFoundException {
        // try {
        //     word word = new word("Apple", "Qua tao");
        //     File f = new File ("input.txt");
        //     FileWriter fw = new FileWriter(f);
        //     BufferedWriter bw = new BufferedWriter(fw);
        //     bw.write(word.toString());


        //     bw.close();
        //     fw.close();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        
    //     try {
    //         File f = new File("input.txt");
    //         FileReader fr = new FileReader(f); 
    //         BufferedReader br = new BufferedReader(fr);
    //         String str;
    //         while((str = br.readLine())!=null) {
    //             System.out.println(str);
    //             String[] obj = str.split(":");
    //             word w = new word(obj[1], obj[0]);
    //             System.out.println(w.tkoString());
    //         }
    //         br.close();
    //         fr.close();
    //     } catch (Exception e) {
    //         System.out.println(e);
    //     }
    // }
        static dictionary dict = new dictionary();
        // save to file
        static void saveToFile(String filePath) throws IOException {
            File f = new File(filePath);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for(word x : dict.getDict()){
                bw.write(x.toString() + "\n");
            }

            bw.close();
            fw.close();
        }
        // thêm 1 phần tử vào file
        static void add(word x, String filePath) throws IOException {
            if(!dict.contains(x.getEn())){
                dict.add(x);
                saveToFile(filePath);
            }
        }
        static void getDict(String filePath) throws IOException {
            dict.clear();
            File f = new File(filePath);
            FileReader fr = new FileReader(f); 
            BufferedReader br = new BufferedReader(fr);
            String str;
            while((str = br.readLine())!=null) {
                String[] obj = str.split(":");
                dict.add(new word(obj[1], obj[0]));
            }
            br.close();
            fr.close();
        }
        static void edit(String filePath, word x) throws IOException {
            dict.edit(x);
            saveToFile(filePath);
        }
        static void remove(String filePath, word x) throws IOException {
            dict.remove(x.getEn());
            saveToFile(filePath);
        }
    
}