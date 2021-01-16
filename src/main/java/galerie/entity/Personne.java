/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;
/**
 *
 * @author QUENTIN
 */
@ToString @NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique = true)
    @NonNull
    private String nom;
    
    @Column(unique = true, nullable = true)
    @NonNull
    private String adresse;
    
    @OneToMany (mappedBy = "acheteur")
    @NonNull
    List<Transactions> transactions = new LinkedList<>();
    
    public Personne(Integer id, String nom, String adresse){
        this.id=id;
        this.nom=nom;
        this.adresse=adresse;
    } 
    
    public float budgetArt (int annee){
        float budget = 0;
        for (Transactions t : transactions){
            if (t.getVenduLe().getYear() == annee){
                budget += t.getPrixVente();
        }       
    }
        return budget;
    }   
}
