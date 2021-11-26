package Reto3G43R.Web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Reto3G43R.Modelo.clients;
import Reto3G43R.Service.ClientService;

@RestController
@RequestMapping ("/api/Client")
@CrossOrigin (origins = "*", methods={ RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class ClientControler {
    
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<clients> findAlClients(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<clients> FindClientById(@PathVariable("id")int id) {
        return clientService.getLibrary(id);
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public clients saveClients(@RequestBody clients p) {
        return clientService.save(p);
    }
}
