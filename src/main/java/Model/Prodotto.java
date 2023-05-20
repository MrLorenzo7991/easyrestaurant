package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Prodotto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer prodottoId;
    private  String descrizione;
    private Float prezzo;
    private boolean disponibile;


    public Prodotto() {
    }

    public Prodotto(Integer prodottoId, String descrizione, Float prezzo, boolean disponibile) {
        this.prodottoId = prodottoId;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.disponibile = disponibile;
    }

    public Integer getProdottoId() {
        return prodottoId;
    }

    public void setProdottoId(Integer prodottoId) {
        this.prodottoId = prodottoId;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Float prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "prodottoId=" + prodottoId +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", disponibile=" + disponibile +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prodotto prodotto)) return false;
        return disponibile == prodotto.disponibile && Objects.equals(prodottoId, prodotto.prodottoId) && Objects.equals(descrizione, prodotto.descrizione) && Objects.equals(prezzo, prodotto.prezzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodottoId, descrizione, prezzo, disponibile);
    }
}
