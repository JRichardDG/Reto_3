package Reto3G43R.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Reto3G43R.Modelo.library;
import Reto3G43R.Repository.crud.LibCrudRepository;


@Repository
public class LibRepository{
    
    @Autowired
    private LibCrudRepository libCrudRepsitory;

    public List<library> getAll() {
        return (List<library>) libCrudRepsitory.findAll();
    }

   public Optional<library> getLibrary(int id) {
       return libCrudRepsitory.findById(id);
   }

   public library save(library p) {
       return libCrudRepsitory.save(p);
   }

   public String delete(library d) {
     libCrudRepsitory.delete(d);
     return "Se Borro Correctamente";
   }
}
