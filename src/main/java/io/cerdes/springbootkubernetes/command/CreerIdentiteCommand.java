package io.cerdes.springbootkubernetes.command;

import io.cerdes.springbootkubernetes.entity.TypeIdentite;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

/**
 * DTO for {@link io.cerdes.springbootkubernetes.entity.Identite}
 */
public record CreerIdentiteCommand(@NotBlank String numeroBcr,
                                   @NotNull TypeIdentite typeIdentite) implements Serializable {
}
