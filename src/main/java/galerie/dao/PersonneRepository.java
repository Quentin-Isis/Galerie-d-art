/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

/**
 *
 * @author QUENTIN
 */

import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Personne;
import org.springframework.data.jpa.repository.Query;

public interface PersonneRepository extends JpaRepository <Personne , Integer> {
    
    /**
     * Calculer le budget d'art d'une personne pour une année
     * @param id la clé primaire de la personne
     * @return le budget d'art de cette personne
     */
}
