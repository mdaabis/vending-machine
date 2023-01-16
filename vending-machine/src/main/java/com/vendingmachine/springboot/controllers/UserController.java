package com.vendingmachine.springboot.controllers;

import com.vendingmachine.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

//    @GetMapping("/quotes")
//    public List<Quote> getQuotes(@RequestParam("search") Optional<String> searchParam){
//        return searchParam.map( param-> userRepository.getContainingQuote(param) )
//                .orElse(userRepository.findAll());
//    }

//    @GetMapping("/quotes/{quoteId}" )
//    public ResponseEntity<String> readQuote(@PathVariable("quoteId") Long id) {
//        return ResponseEntity.of(userRepository.findById(id).map(Quote::getQuote));
//    }

//    @PostMapping("/quotes")
//    public User addQuote(@RequestBody String quote) {
//        User q = new User();
//        q.setQuote(quote);
//        return userRepository.save(q);
//    }

    @RequestMapping(value="/quotes/{quoteId}", method=RequestMethod.DELETE)
    public void deleteQuote(@PathVariable(value = "quoteId") Long id) {
        userRepository.deleteById(id);
    }
}
