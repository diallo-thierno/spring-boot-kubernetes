package io.cerdes.springbootkubernetes.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "identite")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Identite {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "numero_bcr")
    private String numeroBcr;

    @Column(name = "type_identite")
    @Enumerated(value = EnumType.STRING)
    private TypeIdentite typeIdentite;
}
