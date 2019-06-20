package haagahelia.fi.Project.management.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Card {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String cardName;
	
	private String description;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "listId")
	private CardList CardList;
	
	public Card() {
		super();
	}
	public Card(String cardName, CardList cardList) {
		super();
		this.cardName = cardName;
		CardList = cardList;
	}
	public Long getId() {
		return id;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public CardList getCardList() {
		return CardList;
	}
	public void setCardList(CardList cardList) {
		CardList = cardList;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", cardName=" + cardName + ", description=" + description + ", CardList=" + CardList
				+ "]";
	}
	
}
