package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comanda {

    private Integer Comanda_id;
    @ManyToOne
    private Utente utente;
    @ManyToMany
    private List<Prodotto> prodotto;
    private  Integer numeroTavolo;
    private String note;

}
