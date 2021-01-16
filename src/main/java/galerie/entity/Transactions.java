/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;
/**
 *
 * @author QUENTIN
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Transactions {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique = true)
    @NonNull
    private LocalDate venduLe;
    
    @Column(unique = true)
    @NonNull
    private int prixVente;
    
    @ManyToOne
    @NonNull
    private Personne acheteur;
    
    @ManyToOne
    @NonNull
    private Exposition lieuDeVente;
    
    @OneToOne
    private Tableau oeuvre;
}
