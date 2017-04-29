
public class Clients {

    private String nom;
    private String prenom;
    private String carte_id;
    private String nombre_loc;


    public Clients(String nom, String prenom, String carte_id, String nombre_loc) {

        this.nom = nom;
        this.prenom = prenom;
        this.carte_id = carte_id;
        this.nombre_loc = nombre_loc;

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

    public String getCarte_id() {
        return carte_id;
    }

    public void setCarte_id(String carte_id) {
        this.carte_id = carte_id;
    }

    public String getNombre_loc() {
        return nombre_loc;
    }

    public void setNombre_loc(String nombre_loc) {
        this.nombre_loc = nombre_loc;
    }
}
