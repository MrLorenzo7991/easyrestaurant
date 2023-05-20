package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer utenteId;
    private String nome;
    private String cognome;
    private String ruolo;

    public Utente(){

    }
    public Utente(Integer utenteId, String nome, String cognome, String ruolo){
        this.utenteId=utenteId;
        this.nome=nome;
        this.cognome=cognome;
        this.ruolo=ruolo;
    }
    public Integer getUtenteId(){
        return this.utenteId;
    }
    public void setUtenteId(Integer utenteId){
        this.utenteId =utenteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return "Utenti{" +
                "utenteId=" + utenteId +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", ruolo='" + ruolo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utente utente)) return false;
        return Objects.equals(utenteId, utente.utenteId) && Objects.equals(nome, utente.nome) && Objects.equals(cognome, utente.cognome) && Objects.equals(ruolo, utente.ruolo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utenteId, nome, cognome, ruolo);
    }
}
