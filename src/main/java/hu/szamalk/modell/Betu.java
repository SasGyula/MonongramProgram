package hu.szamalk.modell;

public class Betu {
    private String jel;
    private String [][] matrix;

    public Betu(String jel) {
        this.jel = jel;
        matrix = new String[][]{
                {this.jel, this.jel, this.jel, this.jel},
                {this.jel, " ", " ", " "},
                {this.jel, " ", this.jel, this.jel},
                {this.jel, " ", " ", this.jel},
                {this.jel, this.jel, this.jel, this.jel}
        };
    }

    public String getJel() {
        return jel;
    }

    public void setJel(String jel) {
        this.jel = jel;
    }
    public int hanyJelSor(int sor){
        int s = 0;
        for(int i = 0; i < matrix[sor].length; i++){
            if(matrix[sor][i] == getJel()){
                s++;
            }
        }
        return s;
    }
    public int hanyJelOszlop(int oszlop){
        int s = 0;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][oszlop] == getJel()){
                s++;
            }
        }
        return s;
    }
    public boolean teliSor(int sor){
        boolean s = true;
        int i = 0;
        while (i < matrix[sor].length) {
            if (matrix[sor][i] != getJel()) {
                s = false;
                break;
            }
            i++;
        }
        return s;
    }
    public boolean teliOszlop(int oszlop){
        boolean s = true;
        int i = 0;
        while (i < matrix.length) {
            if (matrix[i][oszlop] != getJel()) {
                s = false;
                break;
            }
            i++;
        }
        return s;
    }

    public int hanyTeleSor(){
        int s = 0;
            for(int i = 0; i < matrix.length; i++){
                if(teliSor(i) == true){
                    s++;
                }
            }
        return s;
    }

    public int hanyTeleOszlop(){
        int s = 0;
        for(int i = 0; i < matrix[0].length; i++){
            if(teliOszlop(i) == true){
                s++;
            }
        }
        return s;
    }


    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j % 4 == 0){
                    s += "\n";
                }
                    s += matrix[i][j] + " ";
                }
            }
            s += "\n";
             return s;
        }

    }

