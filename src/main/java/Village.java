import java.util.ArrayList;

public class Village {
    //Attributs
    private String nom;
    private ArrayList<Schtroumpf> listeHabitant;
    private int nbHabitant;
    private int nbFeuille;

    public Village (String pfNomV, int pfStockSalsepareille, String[] pfNomsDesSchtroumpfs){
        this.listeHabitant = new ArrayList<Schtroumpf>();
        this.nom = pfNomV;
        this.nbHabitant = 0;
        this.nbFeuille = pfStockSalsepareille;


        Schtroumpf s;
        for (int i = 0; i < pfNomsDesSchtroumpfs.length; i++){
            int age = (int)(Math.random()*150);
            s = new Schtroumpf(pfNomsDesSchtroumpfs[i], age, this);
            this.listeHabitant.add(s);
            this.nbHabitant = listeHabitant.size();
        }
    }

    public String getNom(){
        return this.nom;
    }

    public int getNbSchtroumpf(){
        return nbHabitant;
    }

    public int getStockSalsepareille(){
        return this.nbFeuille;
    }

    public void solstice_d_ete(){
        //for (Schtroumpf habitant:listeHabitant){
        //    System.out.println(habitant);
        //}

        for (int i = 0; i < nbHabitant; i++){
            listeHabitant.get(i).sePresenter();
            listeHabitant.get(i).chanter();
        }

        System.out.println("Le village s'appelle " + this.nom);
        System.out.println("Le village contient " + this.nbHabitant);

        int pasContent = 0;
        for (int i = 0; i < nbHabitant; i++){
            if (!listeHabitant.get(i).estContent()){
                pasContent++;
            }
        }
        System.out.println("Il y a " + pasContent + " Schtroumpf pas content aujourd'hui");
    }

    public Schtroumpf chefDuVillage(){
        Schtroumpf chef = listeHabitant.get(0);
        for (int i = 0; i < nbHabitant; i++) {
            if (listeHabitant.get(i).getAge() > chef.getAge()){
                chef = listeHabitant.get(i);
            }
        }
        return chef;
    }

    public void envoyerAuTravail(){
        for (int i = 0; i < nbHeureux(); i = i+2){
            listeHabitant.get(i).allerTravailler();
        }
    }

    public void schtroumpsfHeureux(){
        for (int i = 0; i < nbHabitant; i++){
            Schtroumpf s = listeHabitant.get(i);
            if (s.estContent()){
                s.sePresenter();
                s.chanter();
            }
        }
    }

    public void schtroumpsfRecolte(int pfQtt){
        this.nbFeuille += pfQtt;
    }

    public void schtroumpsfMange(int pfQtt){
        this.nbFeuille -= pfQtt;
    }

    public void dinerTousEnsemble(){
        System.out.println("� table !!!");
        for (int i = 0; i < nbHabitant; i++){
            listeHabitant.get(i).dinerAuVillage();
        }
    }

    public void envoyerCueillirSalsepareille(){
        for (int i = 0; i < nbHeureux(); i = i+2){
            listeHabitant.get(i).recolterSalsepareille();
        }
    }

    public int nbHeureux(){
        int nb = 0;
        for (int i = 0; i < nbHabitant; i++){
            Schtroumpf s = listeHabitant.get(i);
            if (s.estContent()){
                nb++;
            }
        }
        return nb;
    }
}
