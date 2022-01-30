package br.org.jprojects.desafiodesignpatternsspring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 9)
    private String zipcode;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private Integer number;

    @Column(nullable = true)
    private String complement;

    @Column(nullable = true)
    private String reference;

    @Column(nullable = true)
    private String neighborhoodArea;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;
}
