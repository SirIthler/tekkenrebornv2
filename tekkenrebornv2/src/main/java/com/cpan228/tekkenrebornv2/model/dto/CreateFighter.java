package com.cpan228.tekkenrebornv2.model.dto;

import com.cpan228.tekkenrebornv2.model.Fighter;
import com.cpan228.tekkenrebornv2.model.Fighter.Anime;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateFighter {
    @NotBlank
    private String name;

    @Min(10)
    @Max(100)
    private int damagePerHit;

    @Min(1000)
    private int health;

    @DecimalMin(value = "0.1", inclusive = true)
    @DecimalMax(value = "10.0", inclusive = true)
    @NotNull
    private BigDecimal resistance;

    @NotNull
    private Anime animeFrom;

    public Fighter toFighter() {
        return Fighter.builder()
                .name(this.getName())
                .damagePerHit(this.getDamagePerHit())
                .health(this.getHealth())
                .resistance(this.getResistance())
                .animeFrom(this.getAnimeFrom())
                .build();
    }
}
