package haagahelia.fi.Project.management.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class CardList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long listId;
	
	private String listName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "CardList")
	private List<Card> cards;
	
	public CardList() {
		super();
	}
	public CardList(String listName) {
		super();
		this.listName = listName;
	}
	
	public long getListId() {
		return listId;
	}
	
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	@Override
	public String toString() {
		return this.listName;
	}
}
