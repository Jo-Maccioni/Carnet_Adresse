package carnet.v1;

public class Contact {
    protected String Nom;
    protected String Prenom;
    protected String Adresse;
    
    public Contact(String cNom, String cPrenom, String cAdresse){
        this.Nom = cNom;
        this.Prenom = cPrenom;
        this.Adresse = cAdresse;
    }
    
    public String getNom(){
        return Nom;
    }  
    public String getPrenom(){
        return Prenom;
    }
    public String getAdresse(){
        return Adresse;
    }
    
    public void setNom(String nNom){
        this.Nom = nNom;
    }
    
    public void setPrenom(String nPrenom){
        this.Prenom = nPrenom;
    }
    
    public void setAdresse(String nAdresse){
        this.Adresse = nAdresse;
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Contact[Nom = "+Nom+", Prenom = "+Prenom+"]");
        return builder.toString();
    }
}
