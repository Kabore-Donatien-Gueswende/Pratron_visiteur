package tp.visiteur.finale;

public class CalculSalaire implements InterfaceVisiteur {

    @Override
    public void visit(Directeur directeur) {
       System.out.print("Salaire du Directeur : ");
       System.out.println(directeur.indice*directeur.salireBase+directeur.bonus);

    }

    @Override
    public void visit(Manager manager) {
        System.out.print("Salaire du Manager : ");
        System.out.println(manager.indice*manager.salireBase+manager.prime-manager.impot);

    }

    @Override
    public void visit(Commerciaux commerciaux) {
        System.out.print("Salaire du Commerciaux : ");
        System.out.println(commerciaux.primevente+1000);
 

    }

    @Override
    public void visit(Ouvrier ouvrier) {
        System.out.print("Salaire du Ouvriers : ");
        System.out.println(ouvrier.salireHoraire*ouvrier.nbreHeure+5000);

    }

}
