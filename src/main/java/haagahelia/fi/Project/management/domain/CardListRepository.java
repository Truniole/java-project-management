package haagahelia.fi.Project.management.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardListRepository extends CrudRepository<CardList, Long> {
	List<CardList> findByListName(String listName);
}
