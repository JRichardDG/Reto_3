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

import Reto3G43R.Modelo.category;
import Reto3G43R.Service.CatService;

@RestController
@RequestMapping ("/api/Category")
@CrossOrigin (origins = "*", methods={ RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class CategoryControler {
    @Autowired
    private CatService catService;

    @GetMapping("/all")
    public List<category> findAllProducts(){
        return catService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<category> FindById(@PathVariable("id")int id) {
        return catService.getLibrary(id);
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public category save(@RequestBody category p) {
        return catService.save(p);
    }

}





    
