package haagahelia.fi.Project.management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import haagahelia.fi.Project.management.domain.Card;
import haagahelia.fi.Project.management.domain.CardList;
import haagahelia.fi.Project.management.domain.CardListRepository;
import haagahelia.fi.Project.management.domain.CardRepository;
@SpringBootApplication
public class ProjectManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CardRepository cRepo, CardListRepository clRepo) {
		return (args) -> {
			CardList Backlog = new CardList("Backlog");
			CardList Prioritizing = new CardList("Prioritizing");
			CardList InProgress = new CardList("In Progress");
			CardList Done = new CardList("Done");
			
			clRepo.save(Backlog);
			clRepo.save(Prioritizing);
			clRepo.save(InProgress);
			clRepo.save(Done);
			
			Card one = new Card("one", Backlog);
			Card two = new Card("two", Prioritizing);
			Card three = new Card("three", Done);
			Card four = new Card("four", InProgress);
			cRepo.save(one);
			cRepo.save(two);
			cRepo.save(three);
			cRepo.save(four);
			 
			for (Card cardlist : cRepo.findAll()) {
				System.out.println(cardlist.toString());
			}

		};
		
	}

}
