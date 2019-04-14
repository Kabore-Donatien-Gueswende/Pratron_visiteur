package tp.visiteur.finale;

public class Manager implements InterfaceAcceptVisiteur {
    private String nom;
    private String prenom;
    public int indice = 3;
    public int salireBase = 200000;
    public int prime = 25000;
    public int impot = 100000;
    
    public void accept(InterfaceVisiteur visitor) 
    {
            visitor.visit(this);       
    }
}
