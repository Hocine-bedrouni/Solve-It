package fr.solveit.config;


import fr.solveit.model.Departement;
import fr.solveit.model.Pays;
import fr.solveit.repository.IDepartementRepo;
import fr.solveit.repository.IPaysRepo;
import fr.solveit.repository.IVilleRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {


	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
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
