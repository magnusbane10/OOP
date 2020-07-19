public class Somer extends Persoana {
    private boolean timpLiber;
    private String meserieBaza;

    public Somer() {
    }

    public Somer(String nume, int varsta, String CNP, Adresa adresa, boolean timpLiber, String meserieBaza) {
        super(nume, varsta, CNP, adresa);
        this.timpLiber = timpLiber;
        this.meserieBaza = meserieBaza;
    }

    public boolean isTimpLiber() {
        return timpLiber;
    }

    public void setTimpLiber(boolean timpLiber) {
        this.timpLiber = timpLiber;
    }

    public String getMeserieBaza() {
        return meserieBaza;
    }

    public void setMeserieBaza(String meserieBaza) {
        this.meserieBaza = meserieBaza;
    }
}
