package com.example.coffee_demo.controller;


import com.example.coffee_demo.model.Coffee;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/coffees")
//@RequestMapping("/coffees")
public class RestApiDemoController {
    private final List<Coffee> coffees = new ArrayList<>();

    public RestApiDemoController() {
        coffees.addAll(List.of(
                new Coffee("Café Cereza"),
                new Coffee("Café Ganador"),
                new Coffee("Café Lareño"),
                new Coffee("Café Tres Pontas")
        ));
    }
    @RequestMapping(value= "/coffees", method = RequestMethod.GET)
        // @GetMapping("/coffees")
        //@GetMapping
    Iterable<Coffee> getCoffees() {
        return coffees;
    }

    // @PostMapping("/coffees")
    @PostMapping
    Coffee postCoffee(@RequestBody Coffee coffee) {
        coffees.add(coffee);
        return coffee;
    }

    //@PutMapping("/coffees/{id}")
    @PutMapping("/{id}")
    Coffee putCoffee (@PathVariable String id, @RequestBody Coffee coffee){
        int index = -1;

        for (Coffee c:coffees ){
            if( c.getId().equals(id)) {
                index = coffees.indexOf(c);
                coffees.set(index, coffee);
            }
        }
        return (index == -1 ) ? postCoffee(coffee):coffee;
    }

    // @DeleteMapping("/coffees/{id}")
    @DeleteMapping("/{id}")
    void deleteCoffee(@PathVariable String id) {
        coffees.removeIf(c -> c.getId().equals(id));
    }

    //@GetMapping("/coffees/{id}")
    @GetMapping("/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable String id) {
        for (Coffee c: coffees) {
            if (c.getId().equals(id)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }


}
