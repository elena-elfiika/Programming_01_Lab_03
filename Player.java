public class Player {
    private Card[] p_cards = Deck.getCards();
	int index = -1;

	// ТУТ БЫЛА ОШИБКА. НО ЕЁ БОЛЬШЕ НЕТ
    public void givecard(Card meow){
		int i = index;
		int o = p_cards[meow.getCard()].getCard();
		if (i == -1){
			index = o;
			return;
		}

		Card tmp = p_cards[i];
		int next = tmp.getNext();

		while (next != -1){
			i = next;
			tmp = p_cards[i];
			next = tmp.getNext();
		}
		tmp.setNext(o);
	}

	public void test_print() {
		System.out.println("\nТестовая печать всего массива");
		for(Card card : p_cards){
			card.printCard();
			card.printNextIndex();
		}
	}

	public void print(){
		// System.out.println("\nПечать руки");
		int x = index;
		Card tmp;
		while(x != -1){
			tmp = p_cards[x];
			tmp.printCard();
			x = tmp.getNext();
		}
	}
}