package app.controller;

import app.entity.Person;
import app.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@AllArgsConstructor
@RestController
public class PageController {

    private final PersonService service;

    @GetMapping
    public ModelAndView findAll(
            @RequestParam Optional<String> name,
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<String> sortBy) {
        ModelAndView mav = new ModelAndView("index");
        Page<Person> currPage = service.findAllBy(name, page, sortBy);
        mav.addObject("users", currPage);
        mav.addObject("totalPages", currPage.getTotalPages());
        mav.addObject("page", page.get());
        return mav;
    }

    @GetMapping("/findAll")
    public ModelAndView findAll(@RequestParam Optional<Integer> page) {
        ModelAndView mav = new ModelAndView("index2");
        Page<Person> currPage = service.findAll(page);
        mav.addObject("users", currPage);
        mav.addObject("totalPages", currPage.getTotalPages());
        mav.addObject("page", page.get());
        return mav;
    }
}
