
public class Auteur {

    private String nom;
    private String prenom;
    private String pays;


    public Auteur(String nom, String prenom, String pays) {
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getinfo(){
            return "nom de l'auteur="+nom + "  "+ "prenom de l'auteur=" +prenom+"  pays de l auteur: " + pays;
    }
}

