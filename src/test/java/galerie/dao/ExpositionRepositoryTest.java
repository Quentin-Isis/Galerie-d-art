/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.ExpositionRepository;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
public class ExpositionRepositoryTest {

    @Autowired
    private ExpositionRepository expositionDAO;

    @Test
    @Sql("test-data.sql")
    
    public void onSaitCompterLesEnregistrements() {
        log.info("On compte les enregistrements de la table 'Exposition'");
        int combienDansLeJeuDeTest = 2; 
        long nombre = expositionDAO.count();
        assertEquals(combienDansLeJeuDeTest, nombre, "On doit trouver 2 expositions" );
    
    }
    
    @Test
    @Sql("test-data.sql")
    public void testCA() {
        log.info("Test budget art");
        float resultatAttendu = 50002;
        Exposition exposition = expositionDAO.getOne(1);
        float resultat = exposition.CA();
        assertEquals(resultatAttendu, resultat, "Les résultats ne sont pas identiques.");
    }
    
    @Test
    @Sql("test-data.sql")
    public void testCAWithSql() {
        log.info("Test budget art");
        float resultatAttendu = 50002;
        float resultat = expositionDAO.chiffreAffairePourSQL(1);
        assertEquals(resultatAttendu, resultat, "Les résultats ne sont pas identiques.");
    }

}
