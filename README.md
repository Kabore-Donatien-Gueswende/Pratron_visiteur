# Pratron_visiteur

Bonjour :blush:
L'objectif de ce nouveau projet est de realiser ça : 

![alt tag](https://github.com/Kabore-Donatien-Gueswende/Pratron_visiteur/blob/master/img/visist.PNG)

:confused: oui tout ça n'est pas claire, il sagit du patron visiteur, qui dans ce cas de figure visite chaque objet (Directeur, Manager, 
etc.) pour calculer le salaire propre à chaque type d'objet.

# Realisation
Nous allons commencer par creer deux interfaces : 

InterfaceAcceptVisiteur est une interface dont tous les classes (Directeur, Manager, etc.) devrons accpeter et permettre ainsi l'accès au 
visiteur des methodes et attributs public de la classe.

    public interface InterfaceAcceptVisiteur {
        void accept(InterfaceVisiteur visiteur);

        }
   
 Qui recoit un objet du type InterfaceVisiteur, il sagit tout simple de la deuxième interface de la classe du Visiteur, qui pend en
 paramètre les objets qu'il visite : 
 
    public interface InterfaceVisiteur {
        public void visit(Directeur directeur);
        public void visit(Manager manager);
        public void visit(Commerciaux commerciaux);
        public void visit(Ouvrier ouvrier);
      }
 
 Le decore etant planté, creons les objets qui devrons etre visité, il sagit ici du Directeur, Manager, Commerciaux et Ouvrier
 
 Chaque objet accepte le visiteur
 chaque objet dont les attributs ou methodes sont indispensable au visiteur sont public :
 
 à titre d'exemple nous avions rajouter des attributs en privé juste pour le test, qui peuve ainsi etre emputé du code sans qu'il n'y est
 effet.
 
 code des quatre classes :
 
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
  
Nous commençons par le Directeur parce que c'est le Directeur :wink:

Ensuite 

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
      
      public class Commerciaux implements InterfaceAcceptVisiteur{
          private String nom;
          private String prenom;
          public int primevente = 150000;    
          public void accept(InterfaceVisiteur visitor) 
              {
                visitor.visit(this);       
              }
        }
        
Nous allons maintenant creer notre classe calculSalaire qui visitera nos classe et deduira de leur salaire en fonction de leur attributs
  
  
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
        
    Chaque objet disposant de sa propre methode de calcul de salaire, nous pouvons maintenant passer la demos : 
    
        public class Demo {
            public static void main(String[] args) {
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
        
  Ce qui donne cette image :smile: :
  
  
  ![alt tag](https://github.com/Kabore-Donatien-Gueswende/Pratron_visiteur/blob/master/img/visist.PNG)
