package Reto3G43R.Modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = ("message"))
public class message implements Serializable{
    
    @Id
    @GeneratedValue  ( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String messagetext;
    @OneToOne
    private int clients;
    @OneToOne
    private int library;
    
    
    
    public int getLibrary() {
        return library;
    }
    public void setLibrary(int library) {
        this.library = library;
    }
    public int getClients() {
        return clients;
    }
    public void setClients(int clients) {
        this.clients = clients;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMessagetext() {
        return messagetext;
    }
    public void setMessagetext(String messagetext) {
        this.messagetext = messagetext;
    }

    
}
