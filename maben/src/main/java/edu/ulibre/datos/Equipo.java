package edu.ulibre.datos;
import lombok.*;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder // para que sea inmutable y no me permita modificar los atributos

public class Equipo {
    private String nombre;
    private Long identificacion;

    }

