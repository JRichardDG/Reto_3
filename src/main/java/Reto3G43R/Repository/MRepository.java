package Reto3G43R.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Reto3G43R.Modelo.message;
import Reto3G43R.Repository.crud.MCrudRespository;

@Repository
public class MRepository {
    
    @Autowired
    private MCrudRespository mCrudRepsitory;

    public List<message> getAll() {
        return (List<message>) mCrudRepsitory.findAll();
    }

   public Optional<message> getLibrary(int id) {
       return mCrudRepsitory.findById(id);
   }

   public message save(message p) {
       return mCrudRepsitory.save(p);
   }

   public String delete(message d) {
     mCrudRepsitory.delete(d);
     return "Se Borro Correctamente";
   }
}
