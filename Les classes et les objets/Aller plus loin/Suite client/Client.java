public class Client {
    // Attribut en privé
    private String nom, prenom, adresse, ville;

    // Lis la valeur de la variable privé
    public String getName() {
        return this.nom;
    }

    public String getFirstname() {
        return this.prenom;
    }

    public String getAddress() {
        return this.adresse;
    }

    public String getCity() {
        return this.ville;
    }

    // Assigne la valeur dans la variable privé
    public void setName(String name) {
        this.nom = name;
    }

    public void setFirstname(String firstname) {
        this.prenom = firstname;
    }

    public String setAddress(String address) {
        this.adresse = address;
        return this.adresse;
    }

    public void setCity(String city) {
        this.ville = city;
    }

    // Constructeur
    public Client(String nom, String prenom, String adresse, String ville) {
        this.setName(nom);
        this.setFirstname(prenom);
        this.setAddress(adresse);
        this.setCity(ville);
    }

}