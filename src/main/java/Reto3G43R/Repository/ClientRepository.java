package Reto3G43R.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Reto3G43R.Modelo.clients;
import Reto3G43R.Repository.crud.ClientCrudRepsitory;

@Repository
public class ClientRepository {
   @Autowired
   private ClientCrudRepsitory clientCrudRepository;

   public List<clients> getAll() {
    return (List<clients>) clientCrudRepository.findAll();
}

public Optional<clients> getLibrary(int id) {
   return clientCrudRepository.findById(id);
}

public clients save(clients p) {
   return clientCrudRepository.save(p);
}

public String delete(clients d) {
    clientCrudRepository.delete(d);
 return "Se Borro Correctamente";
}
}
