package com.cpan228.tekkenrebornv2;

import com.cpan228.tekkenrebornv2.model.Fighter;
import com.cpan228.tekkenrebornv2.repository.FighterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class Tekkenrebornv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tekkenrebornv2Application.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(FighterRepository repository) {
		return args -> {
			repository.save(Fighter.builder()
					.name("Heihachi Mishima")
					.animeFrom(Fighter.Anime.TEKKEN)

					.damagePerHit(89)
					.health(2000)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Kazuya Mishima")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(86)
					.health(2100)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Jin Kazama")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(90)
					.health(2200)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Steve Fox")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Steve Fox")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5)).build());
			repository.save(Fighter.builder()
					.name("Hwoarang")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(89)
					.health(2000)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Panda")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(86)
					.health(2100)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Eddy Gordo")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(90)
					.health(2200)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Steve Fox")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Law")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(89)
					.health(2000)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Lei Wulong")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(86)
					.health(2100)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Anna")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(90)
					.health(2200)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Xiaoyu")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5)).build());
			repository.save(Fighter.builder()
					.name("Brian Fury")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(89)
					.health(2000)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Kuma")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(86)
					.health(2100)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Paul Phoenix")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(90)
					.health(2200)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("King")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Bruce Irvin")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(89)
					.health(2000)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Dragunov")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(86)
					.health(2100)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Lars Alexandersson")
					.animeFrom(Fighter.Anime.TEKKEN)
					.damagePerHit(90)
					.health(2200)
					.resistance(new BigDecimal(0.5)).build());

		};
	}
}
