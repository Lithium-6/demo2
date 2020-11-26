package com.example.demo2;

import com.example.demo2.model.Post;
import com.example.demo2.repository.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Time;
import java.util.Collection;
import java.util.Optional;

@Controller
public class IndexController {

    @Autowired
    PostRepository postRepository;
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("page","Главная страница");
        model.addAttribute("title","Заголовок");
        return "index";
    }

    @PostMapping("/")
    public String getName(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts",posts);
        return "index";
    }
}
