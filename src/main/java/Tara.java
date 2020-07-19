public class Tara {
    private String numeTara;
    private String cod;
    private boolean isUE;

    public Tara() {
    }

    public Tara(String numeTara, String cod, boolean isUE){
        this.numeTara = numeTara;
        this.cod = cod;
        this.isUE = isUE;
    }

    public String getNumeTara() {
        return numeTara;
    }

    public void setNumeTara(String numeTara) {
        this.numeTara = numeTara;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public boolean isUE() {
        return isUE;
    }

    public void setUE(boolean UE) {
        isUE = UE;
    }
}
