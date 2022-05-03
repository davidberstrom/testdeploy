package io.david.coronatracker.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.david.coronatracker.Models.LocationStats;
import io.david.coronatracker.Services.CoronaVirusServices;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusServices coronaVirusServices;

    @GetMapping("/") 
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusServices.getLocationStats();
        int totalcases = allStats.stream().mapToInt(stat->stat.getLatestTotalCases()).sum();
        int newCases = allStats.stream().mapToInt(stat->stat.getDiff()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalCases", totalcases); 
        model.addAttribute("newCases", newCases);
        return "home";
    }
    @GetMapping("/map")
    public String map(Model model){
        return "mapPage";
    }
    
}
