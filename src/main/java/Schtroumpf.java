public class Schtroumpf {
    //Attributs
    private String nom;
    private int age;
    private boolean content;
    private Village lieuResidence;

    //Constructeur
    public Schtroumpf(String pfNom, int pfAge){
        this.nom = pfNom;
        this.age = pfAge;
        this.content = true;
        this.lieuResidence = null;
    }

    public Schtroumpf(String pfNom, int pfAge, Village pfVillage){
        this.nom = pfNom;
        this.age = pfAge;
        this.content = true;
        this.lieuResidence = pfVillage;
    }



    //Getters
    public String getNom(){
        return this.nom;
    }

    public int getAge(){
        return this.age;
    }

    public boolean estContent(){
        return this.content;
    }

    public Village getVillage(){
        return this.lieuResidence;
    }

    //M�thodes
    public String toString(){
        String message = "";
        if (this.estContent()) {
            message = "Je suis " + this.nom + ", j'ai " + this.age + " ans, je suis content";
        }
        else {
            message = "Je suis " + this.nom + ", j'ai " + this.age + " ans, je suis PAS content";
        }
        if (this.lieuResidence == null){
            message += " et je suis ermite";
        }
        else {
            message += " et j'habite dans le village " + this.lieuResidence.getNom();
        }
        return message;
    }

    public void sePresenter(){
        System.out.println(this.toString());
    }

    public String leChant(){
        if (this.estContent()){
            return "la, la, la Schtroumpf la, la";
        }
        else {
            return "gloups";
        }
    }

    public void chanter(){
        System.out.println(this.leChant());
    }

    public void anniversaire(){
        this.age++;
    }

    public void manger(int pfQte){
        if (pfQte > 0){
            this.content = true;
        }
    }

    public void allerTravailler(){
        this.content = false;
    }

    public void setVillage(Village pfV){
        this.lieuResidence = pfV;
    }

    public void recolterSalsepareille(){
        this.allerTravailler();
        if (this.lieuResidence == null){
            this.manger(5);
        }
        else {
            this.lieuResidence.schtroumpsfRecolte(5);
        }
    }

    public void dinerAuVillage(){
        int feuilleMinimum = 3;
        if (this.lieuResidence == null){
            this.content = false;
        }
        else if(this.lieuResidence.getStockSalsepareille() >= feuilleMinimum){
            this.lieuResidence.schtroumpsfMange(feuilleMinimum);
            this.manger(feuilleMinimum);
        }
    }
}
