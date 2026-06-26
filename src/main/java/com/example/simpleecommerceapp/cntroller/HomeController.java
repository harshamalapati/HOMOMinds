package com.example.simpleecommerceapp.cntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.simpleecommerceapp.entity.Admin;
import com.example.simpleecommerceapp.entity.Message;
import com.example.simpleecommerceapp.entity.Skill;
import com.example.simpleecommerceapp.entity.User;
import com.example.simpleecommerceapp.repo.SkillRepo;
import com.example.simpleecommerceapp.service.ProductService;
import com.example.simpleecommerceapp.service.SkillService;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;
    @Autowired
    private SkillRepo skillRepo;
    @GetMapping({"/", "/homoMinds"})
    public String homoMinds() { return "Homomind"; }

    @GetMapping("/home")
    public String homePage() { return "HomePage"; }

    @GetMapping("/products")
    public String productPage(Model model) {
        model.addAttribute("productList", productService.getAllProduct());
        return "Products";
    }

    @GetMapping({"/contact", "/contactUs"})
    public String contactPage(Model model) {
        model.addAttribute("message", new Message());
        return "ContactUs";
    }

    @GetMapping({"/about", "/aboutUs"})
    public String aboutUs() { return "AboutUs"; }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("admin", new Admin());
        model.addAttribute("user", new User());
        return "LoginPage";
    }

    @GetMapping("/DanceDetail")
    public String danceDetail() { return "DanceDetail"; }

    @GetMapping("/VilasiniNatyam")
    public String VilasiniNatyamDetail() { return "VilasiniNatyam"; }

    @GetMapping("/talents/dance") public String talentDance() { return "talents/Dance"; }
    @GetMapping("/talents/music") public String talentMusic() { return "talents/Music"; }
    @GetMapping("/talents/cooking") public String talentCooking() { return "talents/Cooking"; }
    @GetMapping("/talents/poetry") public String talentPoetry() { return "talents/Poetry"; }
    @GetMapping("/talents/storytelling") public String talentStorytelling() { return "talents/Storytelling"; }
    @GetMapping("/talents/crafts") public String talentCrafts() { return "talents/Crafts"; }
    @GetMapping("/talents/painting") public String talentPainting() { return "talents/Painting"; }
    @GetMapping("/talents/rangoli") public String talentRangoli() { return "talents/Rangoli"; }

    @GetMapping("/culture/festivals") public String cultureFestivals() { return "culture/Festivals"; }
    @GetMapping("/culture/traditions") public String cultureTraditions() { return "culture/Traditions"; }
    @GetMapping("/culture/languages") public String cultureLanguages() { return "culture/Languages"; }
    @GetMapping("/culture/temples") public String cultureTemples() { return "culture/Temples"; }
    @GetMapping("/culture/heritage") public String cultureHeritage() { return "culture/Heritage"; }

    @GetMapping("/community/events") public String communityEvents() { return "community/Events"; }
    @GetMapping("/community/workshops") public String communityWorkshops() { return "community/Workshops"; }
    @GetMapping("/community/discussions") public String communityDiscussions() { return "community/Discussions"; }
    @GetMapping("/community/contributors") public String communityContributors() { return "community/Contributors"; }
    

    @GetMapping("/register")
    public String register() {
        return "Register";
    }

    @GetMapping("/forgot-password")
    public String forgotPassword() {
        return "ForgotPassword";
    }
    @GetMapping("/skills/{slug}")
    public String skillDetails(@PathVariable String slug, Model model) {

        Skill skill = skillRepo.findBySlug(slug);

        model.addAttribute("skill", skill);

        return "SkillDetail";
    }
}
