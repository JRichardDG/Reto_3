package Reto3G43R.Modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "library")
public class library implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String target;
    private Integer capacity;
    private Integer category;
    private String name;
    private String description;
    private List <clients> ListadeClientes;
    
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }
    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    public Integer getCategory() {
        return category;
    }
    public void setCategory(Integer category) {
        this.category = category;
    }
    public List<clients> getListadeClientes() {
        return ListadeClientes;
    }
    public void setListadeClientes(List<clients> listadeClientes) {
        ListadeClientes = listadeClientes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}
