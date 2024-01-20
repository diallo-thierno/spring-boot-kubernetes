package io.cerdes.springbootkubernetes.converter;

import io.cerdes.springbootkubernetes.command.CreerIdentiteCommand;
import io.cerdes.springbootkubernetes.entity.Identite;
import io.cerdes.springbootkubernetes.reponse.CreerIdentiteResponse;
import org.springframework.stereotype.Component;

@Component
public class IdentiteConverter {
    public Identite newIdentiteFrom(CreerIdentiteCommand command) {
        return Identite.builder().typeIdentite(command.typeIdentite()).numeroBcr(command.numeroBcr()).build();
    }

    public CreerIdentiteResponse newCreerIdentiteResponseFrom(Identite identite) {
        return new CreerIdentiteResponse(identite.getId(), identite.getNumeroBcr(), identite.getTypeIdentite());
    }
}
