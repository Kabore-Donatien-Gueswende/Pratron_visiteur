package tp.visiteur.finale;

public interface InterfaceVisiteur {
   public void visit(Directeur directeur);
   public void visit(Manager manager);
   public void visit(Commerciaux commerciaux);
   public void visit(Ouvrier ouvrier);
}
