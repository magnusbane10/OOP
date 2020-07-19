public class Main {
    public static void main(String[] args) {
        Tara romania = new Tara("Romania", "RO", true);

        Companie SDA = new Companie("SDA", romania);
        Adresa adresa = new Adresa(romania, "Iasi", "700100");
        Adresa adresa1 = new Adresa(romania, "Iasi", "700100");
        Angajator angajat = new Angajator("ion popescu", 29, "1840503226859", adresa, SDA, 1000);
        System.out.println(angajat.getNume() + " este din orasul " + angajat.getAdresa().getOras() + " si a lucrat " + angajat.getNrOreSaptamanalLucrate());
        Facultate facultate = new Facultate("Gh Asachi", "economie", romania);
        Student student = new Student("Strfan", 36, "278834783", adresa1, facultate, 1);

        System.out.println("Student " + student.getNume() + " invata la " + facultate.getUniversitate());

    }
}