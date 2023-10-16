package cl.features.testing.controller;

import cl.features.testing.entities.records.Author;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

    @QueryMapping
    public Author authorById(@Argument String id) {
        return Author.getById(id);
    }

}
