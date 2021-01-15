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
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Tableau {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique = true)
    @NonNull
    private String titre;
    
    @Column(unique = false)
    @NonNull
    private String support;
    
    @Column(unique = true)
    @NonNull
    private int largeur;
    
    @Column(unique = true)
    @NonNull
    private int hauteur;
    
    @ManyToMany(mappedBy = "oeuvres")
    List<Exposition> accrochages = new LinkedList<>();
    
    @OneToOne(mappedBy = "oeuvre")
    private Vente vendu;
    
   @ManyToOne
   private Artiste peintre;
}
