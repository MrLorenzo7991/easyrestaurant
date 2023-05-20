package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.List;

@Entity
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
