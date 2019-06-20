package haagahelia.fi.Project.management.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
	List<Card> findByCardName(String cardName);
	
}
