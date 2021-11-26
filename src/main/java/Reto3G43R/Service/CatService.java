package Reto3G43R.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Reto3G43R.Modelo.category;
import Reto3G43R.Repository.CatRepository;
@Service
public class CatService {
       
    @Autowired
    private CatRepository catRepository;

    public List<category> getAll() {
        return catRepository.getAll();
    }
       
    public Optional<category> getLibrary(int id) {
        return catRepository.getLibrary(id);
    }

    public category save(category p) {
        if (p.getId()==null) {
            return  catRepository.save(p);
        } else {
            Optional<category> paux=catRepository.getLibrary(p.getId());
            if (paux.isEmpty()) {
                return  catRepository.save(p);
            } else {
                return p;
            }
        }
    }
}
