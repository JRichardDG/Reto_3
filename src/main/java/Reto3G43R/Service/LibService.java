package Reto3G43R.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Reto3G43R.Modelo.library;
import Reto3G43R.Repository.LibRepository;

@Service
public class LibService {
   
    @Autowired
    private LibRepository libRepository;

    public List<library> getAll() {
        return libRepository.getAll();
    }
       
    public Optional<library> getLibrary(int id) {
        return libRepository.getLibrary(id);
    }

    public library save(library p) {
        if (p.getId()==null) {
            return  libRepository.save(p);
        } else {
            Optional<library> paux=libRepository.getLibrary(p.getId());
            if (paux.isEmpty()) {
                return  libRepository.save(p);
            } else {
                return p;
            }
        }
    }
}
