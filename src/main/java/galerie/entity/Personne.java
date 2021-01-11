/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
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
    
    public Personne(Integer id, String nom, String adresse){
        this.id=id;
        this.nom=nom;
        this.adresse=adresse;
        
    }
    
    
}
