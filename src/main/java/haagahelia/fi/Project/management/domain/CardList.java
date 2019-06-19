package haagahelia.fi.Project.management.domain;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class CardList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long listId;
	
	private String listName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy ="listName")
	private List<Card> card;
	
	public CardList() {
		super();
	}
	public CardList(String listName) {
		super();
		this.listName = listName;
	}
	
	public Long getId() {
		return listId;
	}
	
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
}
