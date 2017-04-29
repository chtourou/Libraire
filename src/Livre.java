import java.util.List;

public class Livre {

    private String nom;
    private Auteur auteur;
    private String type;
    private String code;


    public Livre(String nom, Auteur auteur, String type, String code) {
        this.nom = nom;
        this.auteur = auteur;
        this.type = type;
        this.code = code;
    }

    public String getInfo() {
        return "titre = " + nom +"  "+ " Auteur = "  + auteur.getinfo() +"  "+ " Type = " + type + "  "+" Code = " + code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}




