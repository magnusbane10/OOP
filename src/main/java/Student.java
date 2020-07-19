public class Student extends Persoana {
    private Facultate facultate;
    private int anStudiu;

    public Student(String nume, int varsta, String CNP, Adresa adresa, Facultate facultate, int anStudiu) {
        super(nume, varsta, CNP, adresa);
        this.facultate = facultate;
        this.anStudiu = anStudiu;
    }

    public Student() {
    }

    public Facultate getFacultate() {
        return facultate;
    }

    public void setFacultate(Facultate facultate) {
        this.facultate = facultate;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }

    public int getNrOreSaptamanalLucrate(){
        return 20;
    }
}
