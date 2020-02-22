package com.example.myDemoAppNew.rest.controller;

import com.example.myDemoAppNew.rest.entity.Author;
import com.example.myDemoAppNew.rest.entity.Post;
import com.example.myDemoAppNew.rest.services.AuthorService;
import com.example.myDemoAppNew.rest.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value="/home")
public class HomeAppController {

    @Autowired
    private PostService postService;

    @Autowired
    private AuthorService authorService;

    @RequestMapping("/post")
    public String home(Model model){
        model.addAttribute("author",new Author());
        return "home";
    }

    @RequestMapping("/author/{id}")
    @ResponseBody
    public String getAuthor(@PathVariable Integer id, Model model){
        Optional<Author> author = authorService.findById(id);
        return author.toString();
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submit(Author author){
        Integer lastId = authorService.findFirstAuthorIdOrderByAuthorIdDesc();
        if(lastId==null){
            lastId=0;
        }
        author.setAuthorId(lastId+1);
        author.setNum(0);
        authorService.save(author);
        return "redirect:/home/author/"+author.getAuthorId();
    }

}
