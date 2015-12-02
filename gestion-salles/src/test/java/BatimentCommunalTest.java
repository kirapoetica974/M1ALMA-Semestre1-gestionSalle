/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author E15A389D
 */
public class BatimentCommunalTest {

    BatimentCommunal batiment;
    String nomBatiment;
    String idBatiment;
    
    Adresse adresseBatiment;
    String numRue;
    String rue;
    String codePostal;
    String ville;
    
    Salle salle;
    int numeroSalle;
    float superficieSalle;
    String idSalle;
    
    List<Salle> listeSalles;
    
    @Before
    public void setUp() {
        
    nomBatiment =  "SORAYA";
    idBatiment = "1";
    
    numRue = "39C";
    rue = "Rue de la Ville aux Roses";
    codePostal = "44000";
    ville = "Nantes";
    
    numeroSalle = 12;
    superficieSalle = 20;
    idSalle = "1";
    
    
    listeSalles = new ArrayList<Salle>();
        
        salle = new SalleReunion(numeroSalle, superficieSalle, idSalle);
        
        adresseBatiment = new Adresse(numRue, rue, codePostal, ville);
        
        batiment = new BatimentCommunal(nomBatiment, idBatiment, adresseBatiment);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void BatimentCommunalTest() {
        assertTrue(batiment.getId().equals(idBatiment));
        assertTrue(batiment.getNom().equals(nomBatiment));
        assertTrue(batiment.getAdresse()==adresseBatiment);
        assertTrue(batiment.getNbSalle()==0);
        assertTrue(batiment.getSalles().isEmpty());
    }
    
    
    @Test
    public void testAjoutSalle() {
       batiment.ajoutSalle(salle);
       listeSalles.add(salle);
       
       /*for(int i=0; i<batiment.getSalles().size();i++){
            System.out.println(batiment.getSalles().get(i).getId());
            System.out.println(batiment.getSalles().get(i).getNumero());
            System.out.println(batiment.getSalles().get(i).getSuperficie());
       }*/
       
       assertTrue(batiment.getSalles().equals(listeSalles));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testAjoutSalleExeption() {
        
    }

}
