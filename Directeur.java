package tp.visiteur.finale;

public class Directeur implements InterfaceAcceptVisiteur{
    private String nom;
    private String prenom;
    public int indice = 6;
    public int salireBase = 400000;
    public int bonus = 50000;
    
    public void accept(InterfaceVisiteur visitor) 
    {
            visitor.visit(this);       
    }
}
