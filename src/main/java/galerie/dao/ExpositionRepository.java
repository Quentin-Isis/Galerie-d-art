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
import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.Query;

public interface ExpositionRepository extends JpaRepository <Exposition , Integer> {
    
    
    /**
     * Calculer le chiffre d'affaires pour une exposition
     * @param id la clé primaire de l'exposition
     * @return le chiffre d'affaires de cette exposition
     */
    @Query (value =
                    "SELECT SUM(prixVente) as chiffreAffairePour FROM Transactions" +
                    "INNER JOIN Transactions ON Exposition_id = Transactions_id" +
                    "WHERE Transactions_id = :id ",
            nativeQuery = true)
    float chiffreAffairePourSQL(Integer id);
    
}
