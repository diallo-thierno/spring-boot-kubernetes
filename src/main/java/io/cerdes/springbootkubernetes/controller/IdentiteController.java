package io.cerdes.springbootkubernetes.controller;

import io.cerdes.springbootkubernetes.IdentiteService;
import io.cerdes.springbootkubernetes.command.CreerIdentiteCommand;
import io.cerdes.springbootkubernetes.converter.IdentiteConverter;
import io.cerdes.springbootkubernetes.entity.Identite;
import io.cerdes.springbootkubernetes.reponse.CreerIdentiteResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/identites")
@RequiredArgsConstructor
public class IdentiteController {

    private final IdentiteConverter converter;
    private final IdentiteService identiteService;

    @PostMapping
    public CreerIdentiteResponse save(@Valid @RequestBody CreerIdentiteCommand command) {
        Identite newIdentite = converter.newIdentiteFrom(command);
        Identite createdIdentite = identiteService.save(newIdentite);
        return converter.newCreerIdentiteResponseFrom(createdIdentite);
    }

    @GetMapping
    public List<CreerIdentiteResponse> findAll() {
        return identiteService.findAll().stream().map(converter::newCreerIdentiteResponseFrom).toList();
    }
}
