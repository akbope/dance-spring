package kz.kaznitu.dancing.controllers;


import kz.kaznitu.dancing.models.Client;
import kz.kaznitu.dancing.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;
    private long a;

    @RequestMapping("/add")
    public String showForm(Model model){
        model.addAttribute("client", new Client());
        return "home";
    }
    @PostMapping("add")
    public String addClient(@ModelAttribute Client client){
        clientRepository.save(client);
        return "redirect:/";
    }
}
