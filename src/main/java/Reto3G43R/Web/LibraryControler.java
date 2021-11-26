package Reto3G43R.Web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Reto3G43R.Modelo.library;
import Reto3G43R.Service.LibService;

@RestController
@RequestMapping ("/api/Library")
@CrossOrigin (origins = "*", methods={ RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class LibraryControler {
    
    @Autowired
    private LibService libService;

    @GetMapping("/all")
    public List<library> findAllLibraries(){
        return libService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<library> FindLibById(@PathVariable("id")int id) {
        return libService.getLibrary(id);
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public library saveLibrary(@RequestBody library p) {
        return libService.save(p);
    }
}
