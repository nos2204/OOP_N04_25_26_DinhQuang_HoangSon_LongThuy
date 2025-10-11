package com.example.bookrental.controller;

import com.example.bookrental.entity.Sach;
import com.example.bookrental.service.SachService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sach")
public class SachController {
    private final SachService sachService;

    public SachController(SachService sachService) {
        this.sachService = sachService;
    }

    @GetMapping
    public String listSachs(Model model) {
        model.addAttribute("sachs", sachService.getAll());
        return "sach";
    }

    @PostMapping("/add")
    public String addSach(Sach sach) {
        sachService.save(sach);
        return "redirect:/sach";
    }

    @GetMapping("/delete/{id}")
    public String deleteSach(@PathVariable Long id) {
        sachService.delete(id);
        return "redirect:/sach";
    }
}
