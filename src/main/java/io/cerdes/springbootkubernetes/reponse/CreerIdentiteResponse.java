package io.cerdes.springbootkubernetes.reponse;

import io.cerdes.springbootkubernetes.entity.TypeIdentite;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link io.cerdes.springbootkubernetes.entity.Identite}
 */
public record CreerIdentiteResponse(UUID id, String numeroBcr, TypeIdentite typeIdentite) implements Serializable {
}
