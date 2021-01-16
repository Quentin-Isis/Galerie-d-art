/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author QUENTIN
 */
@Entity @ToString(callSuper = true) @NoArgsConstructor @Getter @Setter

public class Artiste extends Personne{
    
    @Column(unique=true)
    @NonNull
    private String biographie;
    
    @OneToMany (mappedBy = "peintre")
    List <Tableau> tableau = new LinkedList<>();
    
    public Artiste(Integer id, String nom,String adresse, String biographie){
        super(id, nom, adresse);
        
    }
}
