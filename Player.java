public class Player {
    private Card[] p_cards;
	int index = -1;

    public Player(){
        p_cards = Deck.getCards();
    }

	// ТУТ БЫЛА ОШИБКА. НЕ РАБОТАЕТ. Где-то на стыке раздачи и получения нового индекса
    public void givecard(Card meow){
		meow.printCard();
		meow.printNextIndex();
	}

	public void test_print() {
		for(Card card : p_cards){
			card.printCard();
			card.printNextIndex();
		}
	}

	public void print(){
		int x = 0;
		Card tmp;
		while(x != -1){
			tmp = p_cards[x];
			tmp.printCard();
			x = tmp.getNext();
		}
		System.out.println();
	}
}