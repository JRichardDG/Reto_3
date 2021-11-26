package Reto3G43R.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Reto3G43R.Modelo.clients;
import Reto3G43R.Repository.ClientRepository;

@Service
public class ClientService {
  
    @Autowired
    private ClientRepository clientRepository;

    public List<clients> getAll() {
        return clientRepository.getAll();
    }
       
    public Optional<clients> getLibrary(int id) {
        return clientRepository.getLibrary(id);
    }

    public clients save(clients p) {
        if (p.getId()==null) {
            return  clientRepository.save(p);
        } else {
            Optional<clients> paux=clientRepository.getLibrary(p.getId());
            if (paux.isEmpty()) {
                return  clientRepository.save(p);
            } else {
                return p;
            }
        }
    }
}
