package com.anna.library.controller;


import com.anna.library.entity.Client;
import com.anna.library.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/all")  //  get all clients from db
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    @GetMapping("/{id}") //  get client by id
    public Client getClientById(@PathVariable int id){
        return clientRepository.findById(id).get();
    }

    // /client/find/?name=Anna
    // /client/find/?name=Anna$age
    @GetMapping("/find/")  //  find client by name
    public List<Client> getByNameContaining(@RequestParam("name") String name){
        return clientRepository.findAllByNameContains(name);
    }

    @PostMapping("/create")   //  create client
    public Client createClient(@RequestBody Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @PutMapping("/update/{id}") //  update client
    public Client updateClient(@PathVariable int id, @RequestBody Client client){
        client.setId(id);
        return clientRepository.saveAndFlush(client);
    }




}
