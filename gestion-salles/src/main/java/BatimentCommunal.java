import java.util.List;
import java.util.ArrayList;


public class BatimentCommunal {

	private String nom;
	private String id;
	private int nbSalle;
	private List<Salle> salles;
	private Adresse adresse;
	
	public BatimentCommunal(String nom, String id, Adresse ad ){
		this.nom = nom;
		this.id = id;
		this.nbSalle = 0;
		this.adresse = ad;
                this.salles = new ArrayList<Salle>();
	}
	
	public void ajoutSalle(Salle s){
            for (Salle salle : this.salles) {
                if(salle.getNumero()==s.getNumero()){
                    throw new IllegalArgumentException("La salle existe déjà dans ce bâtiment");
                }
            }
            this.salles.add(s);
            this.nbSalle++;
        }
        
        /**
        * @return the nom
        */
        public String getNom() {
            return nom;
        }

        /**
        * @return the id
        */
        public String getId() {
            return id;
        }

        /**
        * @return the nbSalle
        */
        public int getNbSalle() {
            return nbSalle;
        }
        
        /**
        * @return the salles
        */
        public List<Salle> getSalles() {
            return salles;
        }
        
        /**
        * @return the salles
        */
        public Adresse getAdresse() {
            return adresse;
        }
        
        
}
