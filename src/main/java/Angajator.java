public class Angajator extends Persoana {
    private Companie companie;
   private int salariu;

    public Angajator(String nume, int varsta, String CNP, Adresa adresa, Companie companie, int salariu) {
        super(nume, varsta, CNP, adresa);
        this.companie = companie;
        this.salariu = salariu;
    }

    public Angajator() {
    }

    public Companie getCompanie() {
        return companie;
    }

    public void setCompanie(Companie companie) {
        this.companie = companie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
@Override
    public int getNrOreSaptamanalLucrate(){
        return 40;
    }
}
