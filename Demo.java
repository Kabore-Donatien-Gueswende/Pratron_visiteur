package tp.visiteur.finale;

public class Demo {
    public static void main(String[] args) 
    {
        CalculSalaire salaire = new CalculSalaire();
        Directeur directeur = new Directeur();
        Manager manager = new Manager();
        Commerciaux commerciaux = new Commerciaux();
        Ouvrier ouvrier = new Ouvrier();
        
        directeur.accept(salaire);
        manager.accept(salaire);
        commerciaux.accept(salaire);
        ouvrier.accept(salaire);  
    }
}
