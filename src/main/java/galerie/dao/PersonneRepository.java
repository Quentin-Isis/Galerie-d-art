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
   public void testBudget(){
    float budget = 1200;
    Personne p = new Personne();
    assertEquals(budget,p.budgetArt(2019),"On doit trouver un budget de 1200 euros");
   }
}
