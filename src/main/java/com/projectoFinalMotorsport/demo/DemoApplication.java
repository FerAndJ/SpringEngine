package com.projectoFinalMotorsport.demo;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projectoFinalMotorsport.demo.model.*;
import com.projectoFinalMotorsport.demo.service.AutoService;
import com.projectoFinalMotorsport.demo.service.CarreraService;
import com.projectoFinalMotorsport.demo.service.EquipoService;
import com.projectoFinalMotorsport.demo.service.PilotoService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private AutoService autoService;

	@Autowired
	private CarreraService carreraService;

	@Autowired
	private EquipoService equipoService;

	@Autowired
	private PilotoService pilotoService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	

	@Override
	public void run(String... args) throws Exception {
		
		
		Equipo astonMartin = new Equipo();
		astonMartin.setNombre("Aramco Aston Martin");
		astonMartin.setNacionalidad("Inglesa");
		astonMartin.setVictoriasTotales(85);
		astonMartin.setSede("Silverstone");
		astonMartin.setEsMotorista(false);
		
		equipoService.save(astonMartin);
		
		
		Auto amValkyrie1 = new Auto();
		amValkyrie1.setCargaAerodinamica(8000);
		amValkyrie1.setEquipo(astonMartin);
		amValkyrie1.setEsHibrido(false);
		amValkyrie1.setMarca("Aston Martin");
		amValkyrie1.setModelo("Valkyrie");
		amValkyrie1.setMotor(Motor.V12);
		amValkyrie1.setPeso(980);
		amValkyrie1.setPotencia(900);
		amValkyrie1.setTorque(700);

		autoService.save(amValkyrie1);

		Carrera sebring = new Carrera();
		sebring.setAutodromo("Sebring International Raceway");
		sebring.setGamaNeumaticos(GamaNeumaticos.MEDIA);
		sebring.setHorario(LocalDateTime.of(2025, 3, 15, 14, 0));
		sebring.setKmVuelta(8);
		sebring.setNombre("Gran premio de Sebring");
		sebring.setNumerosVueltas(60);
		sebring.setPilotos(null);
		sebring.setProbabilidadSafetyCar(0.4);
		sebring.setTemperaturaPromedio(18);
		sebring.setUbicacioString("Florida, Estados Unidos");
		
		carreraService.save(sebring);

		Piloto alonso = new Piloto();
		alonso.setNombre("Fernando Alonso");
		alonso.setPeso(68);
		alonso.setNumero(14);
		alonso.setCategoria(Categoria.FORMULA_1);
		alonso.setEquipo(astonMartin);
		alonso.setCarreras(Arrays.asList(sebring));
		alonso.setAuto(amValkyrie1);
		
		pilotoService.save(alonso);
		
		

		
	}
	
}
