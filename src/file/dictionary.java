package file;

import java.util.ArrayList;

public class dictionary {
    ArrayList<word> dict;
    public dictionary() {
        dict = new ArrayList<word>();
    }
    // ktra tồn tại
    public boolean contains(String en) {
        for (word x : dict) {
            if (x.getEn().equalsIgnoreCase(en)) {
                return true;
            }
        }
        return false;
    }
    // thêm từ
    public void add(word w) {

        if (!contains(w.getEn())) {
            dict.add(w);
        }
    }
    @Override
    public String toString() {
        String s = "";
        for (word x : dict) {
            s += x.toString() + "\n";
        }
        return s;
    }
    // sửa
    public void edit(word x) {
        if(contains(x.getEn())){
            for(word w : dict){
                if(w.getEn().equalsIgnoreCase(x.getEn())){
                    w.setVn(x.getVn());
                }
            }
        }
    }
    // xóa từ
    public void remove(String en){
        if(contains(en)){
            for(word w : dict){
                if(w.getEn().equalsIgnoreCase(en)){
                    dict.remove(w);
                }
            }
        }
    }
    public ArrayList<word> getDict() {
        return dict;
    }

    public void clear(){
        dict.clear();
    }
}
