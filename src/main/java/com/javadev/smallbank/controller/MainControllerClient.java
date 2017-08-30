package com.javadev.smallbank.controller;

import com.javadev.smallbank.entity.Client;
import com.javadev.smallbank.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainControllerClient {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private ClientRepository clientRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewClient (@RequestParam String firstName,
                         @RequestParam String lastName,
                         @RequestParam String address) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Client client = new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setAddress(address);
        clientRepository.save(client);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Client> getAllUsers() {
        // This returns a JSON or XML with the users
        return clientRepository.findAll();
    }
}
