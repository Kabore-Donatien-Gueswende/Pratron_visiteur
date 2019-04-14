package tp.visiteur.finale;

public class Ouvrier implements InterfaceAcceptVisiteur{
    private String nom;
    private String prenom;
    public int nbreHeure = 160;
    public int salireHoraire = 500;
    
    public void accept(InterfaceVisiteur visitor) 
    {
            visitor.visit(this);       
    }

}
