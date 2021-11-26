package Reto3G43R.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Reto3G43R.Modelo.category;
import Reto3G43R.Repository.crud.CatCrudRepository;

@Repository
public class CatRepository {
    @Autowired
    private CatCrudRepository catCrudRepsitory;

    public List<category> getAll() {
        return (List<category>) catCrudRepsitory.findAll();
    }

   public Optional<category> getLibrary(int Idcategoria) {
       return catCrudRepsitory.findById(Idcategoria);
   }

   public category save(category p) {
       return catCrudRepsitory.save(p);
   }

   public String delete(category d) {
     catCrudRepsitory.delete(d);
     return "Se Borro Correctamente";
   }
}
