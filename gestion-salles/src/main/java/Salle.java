
public abstract class Salle {

    private int numero;
    private float superficie;
    private String id;
	
    public Salle(int num, float sup, String id){
	this.numero = num;
	this.superficie = sup;
	this.id = id;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the superficie
     */
    public float getSuperficie() {
        return superficie;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    
            
    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}
