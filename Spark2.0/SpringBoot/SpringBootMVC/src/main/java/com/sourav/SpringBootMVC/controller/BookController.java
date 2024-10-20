package com.sourav.SpringBootMVC.controller;

import com.sourav.SpringBootMVC.dto.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BookController {

    public List<Book> bookList = new ArrayList<>(
            Arrays.asList(
                    new Book("Big daddy", "Sourav s"),
                    new Book("Jio aram se", "Kanchan r mehta")
            )
    );

    @GetMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookList);
        return "Books"; //HTML render
    }

    @PostMapping("/add-book")
    public String addBook(@ModelAttribute Book book){
        bookList.add(book);
        return "redirect:/books"; //Redirect to book page
    }

    @GetMapping("/add-book")
    public String getAllBooks(Model model){
        model.addAttribute("book", new Book());
        return "AddBook"; //AddBook page render
    }
}
