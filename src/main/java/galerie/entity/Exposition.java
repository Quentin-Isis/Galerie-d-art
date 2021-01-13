/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
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
public class Exposition {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    @ToString.Exclude
    private LocalDate date;
    
    @Column(unique=true)
    @NonNull
    private String intitule;
    
    @Column(unique=true)
    @NonNull
    private int duree;
    
    @ManyToOne
    @NonNull
    private Galerie galerie;
    
    @ManyToMany
    List<Tableau> oeuvres = new LinkedList<>();
    
    @OneToMany (mappedBy = "lieuDeVente")
    List<Transaction> ventSuscite = new LinkedList<>();
}
