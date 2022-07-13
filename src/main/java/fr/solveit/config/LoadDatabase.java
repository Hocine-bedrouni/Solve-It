package fr.solveit.config;


import fr.solveit.model.*;
import fr.solveit.repository.*;
import fr.solveit.service.CompteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Configuration
public class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
	@Autowired
	CompteService compteService;
@Bean
	CommandLineRunner initDatabase(IUtilisateurRepo user) {
	return args -> {
		System.out.println("test"+compteService.findAll());
	};

	}
/*	@Autowired
	ISessionRepo SessionRepo;
	@Autowired
	IVilleRepo villeRepo;

	@Autowired
	ICompteRepo compteRepo;
	@Bean
	public Ville trouverVille(){
		Ville ville;
		ville =  villeRepo.findById(7).get();
		return ville;
	}

	@Bean
	public Ville trouverVillenaissance(){
		Ville ville;
		ville =  villeRepo.findById(7).get();
		return ville;
	}

	@Bean
	public Compte trouverCompte(){
		Compte compte;
		compte = compteRepo.findById(3).get();
		return compte;
	}

	@Bean
	public Session trouverSession(){
		Session Session;
		Session = SessionRepo.findById(3).get();
		return Session;
	}

	@Bean
	CommandLineRunner initDatabase(IUtilisateurRepo utilisateurRepo) {
		/*Formateur formateur = new Formateur();
		formateur.setNumSecu("179115900100113");
		formateur.setNom("Graiden");
		formateur.setPrenom("Newman");
		formateur.setDateNaissance(Date.valueOf("1979-11-01"));
		formateur.setAdresse("562-1139 Urna. St.");
		formateur.setCivilite("Mr");
		formateur.setCompte(trouverCompte());
		formateur.setVilleHabitation(trouverVille());
		formateur.setVilleNaissance(trouverVillenaissance());
		formateur.setSession(trouverSession());*/
/*
		return args -> {
			log.info("loading data " + utilisateurRepo.save(new Formateur("179115900100313","Richardson","Isaac",Date.valueOf("1990-01-30"),"6889 Nibh Street","Mme",trouverCompte(),trouverVille(),trouverVillenaissance(),trouverSession())));

		};
	}
/*
	@Bean
	CommandLineRunner initDatabase(IDepartementRepo departementeRepo) {
		return args -> {
			log.info("loading data " + departementeRepo.save(new Departement( "NORD",59,null,3)));
			log.info("loading data " + departementeRepo.save(new Departement("PAS-DE-CALAIS",62,null,3)));
			log.info("loading data " + departementeRepo.save(new Departement("Somme",80,null,3)));
			log.info("loading data " + departementeRepo.save(new Departement("Aisne",2,null,3)));
			log.info("loading data " + departementeRepo.save(new Departement("Etranger",99,109,1)));
			log.info("loading data " + departementeRepo.save(new Departement("Etranger",99,131,2)));
			log.info("loading data " + departementeRepo.save(new Departement("Etranger",99,135,4)));
			log.info("loading data " + departementeRepo.save(new Pays("Etranger",99,132,5)));
			log.info("loading data " + departementeRepo.save(new Pays("Etranger",99,127,6)));
			log.info("loading data " + departementeRepo.save(new Pays("Etranger",99,134,7)));
			log.info("loading data " + departementeRepo.save(new Pays("Etranger",99,139,8)));
			log.info("loading data " + departementeRepo.save(new Pays("Etranger",99,352,9)));
			log.info("loading data " + departementeRepo.save(new Pays("Etranger",99,350,10)));
			log.info("loading data " + departementeRepo.save(new Pays("Etranger",99,351,11)));
			log.info("loading data " + departementeRepo.save(new Pays("Etranger",99,341,12)));
		};
	}
	CommandLineRunner initDatabase(IPaysRepo paysRepo) {
		return args -> {
			log.info("loading data " + paysRepo.save(new Pays( "ALLEMAGNE", "ALL")));
			log.info("loading data " + paysRepo.save(new Pays("BELGIQUE", "BEL")));
			log.info("loading data " + paysRepo.save(new Pays("FRANCE","FR")));
			log.info("loading data " + paysRepo.save(new Pays("PAYS-BAS","PB")));
			log.info("loading data " + paysRepo.save(new Pays("ROYAUME-UNI","ENG")));
			log.info("loading data " + paysRepo.save(new Pays("ITALIE","IT")));
			log.info("loading data " + paysRepo.save(new Pays("ESPAGNE","ESP")));
			log.info("loading data " + paysRepo.save(new Pays("PORTUGAL","POR")));
			log.info("loading data " + paysRepo.save(new Pays("ALGERIE","ALG")));
			log.info("loading data " + paysRepo.save(new Pays("MAROC","MAR")));
			log.info("loading data " + paysRepo.save(new Pays("TUNISIE","TUN")));
			log.info("loading data " + paysRepo.save(new Pays("SENEGAL","SEN")));
		};
	}*/

}
