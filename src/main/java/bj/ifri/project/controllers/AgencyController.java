package bj.ifri.project.controllers;

import bj.ifri.project.services.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/agencies")
public class AgencyController {
    @Autowired
    private AgencyService service;

    @GetMapping("/client/create")
    public String getAllAgency() {
        return "client_create";
    }

    @GetMapping("/list")
    public String getAllAgency(Model model) {
        model.addAttribute("agencies", service.read());
        return "agency_list";
    }

    @GetMapping("/{agencyId}")
    public String getAgencyDetail(@PathVariable Long agencyId, Model model) {
        model.addAttribute("agencies", service.read(agencyId));
        return "agency_show";
    }

    @GetMapping("/{agencyId}/clients")
    public String getAgencyClients(@PathVariable Long agencyId, Model model) {
        model.addAttribute("agencies", service.read(agencyId));
        return "client_list";
    }

    @GetMapping("/{agencyId}/clients/overdrafted")
    public String getAgencyOverdraftClients(@PathVariable Long agencyId, Model model) {
        model.addAttribute("agencies", service.read(agencyId));
        return "client_list";
    }
}
