package file;

public class word {
    String vn;
    String en;
    public word(){}
    public word(String en, String vn) {
        this.en = en;
        this.vn = vn;
    }
    public String getVn() {
        return vn;
    }
    public void setVn(String vn) {
        this.vn = vn;
    }
    public String getEn() {
        return en;
    }
    public void setEn(String en) {
        this.en = en;
    }
    @Override
    public String toString() {
        return en + ": " + vn;
    }
    
}
