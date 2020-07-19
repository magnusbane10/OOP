public class Companie {
    private String numeCompanie;
    private Tara tara;

    public Companie() {
    }

    public Companie(String numeCompanie, Tara tara) {
        this.numeCompanie = numeCompanie;
        this.tara = tara;
    }

    public String getNumeCompanie() {
        return numeCompanie;
    }

    public void setNumeCompanie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    public Tara getTara() {
        return tara;
    }

    public void setTara(Tara tara) {
        this.tara = tara;
    }
}
