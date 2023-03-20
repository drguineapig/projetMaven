package cochonDinde.model;

public class CochonDinde {
    private String nom;
    private String race;

    public CochonDinde(String nom, String race) {
        this.nom = nom;
        this.race = race;
    }

    public String getNom() {
        return nom;
    }

    public String getRace() {
        return race;
    }
}
