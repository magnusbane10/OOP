public class Adresa {
    private Tara tara;
    private String oras;
    private String strada;

    public Adresa() {
    }

    public Adresa(Tara tara, String oras, String strada) {
        this.tara = tara;
        this.oras = oras;
        this.strada = strada;
    }



    public Tara getTara() {
        return tara;
    }

    public void setTara(Tara tara) {
        this.tara = tara;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }
}
