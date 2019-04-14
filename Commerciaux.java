package tp.visiteur.finale;

public class Commerciaux implements InterfaceAcceptVisiteur{
    private String nom;
    private String prenom;
    public int primevente = 150000;
    
    public void accept(InterfaceVisiteur visitor) 
    {
            visitor.visit(this);       
    }

}
