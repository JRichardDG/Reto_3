package Reto3G43R.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Reto3G43R.Modelo.message;
import Reto3G43R.Repository.MRepository;

@Service
public class MService {
    @Autowired
    private MRepository mRepository;

    public List<message> getAll() {
        return mRepository.getAll();
    }
       
    public Optional<message> getLibrary(int id) {
        return mRepository.getLibrary(id);
    }

    public message save(message p) {
        if (p.getId()==null) {
            return  mRepository.save(p);
        } else {
            Optional<message> paux=mRepository.getLibrary(p.getId());
            if (paux.isEmpty()) {
                return  mRepository.save(p);
            } else {
                return p;
            }
        }
    }
}
