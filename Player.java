public class Player {
    private Card[] p_cards = Deck.getCards();
	int index = -1;

	// ТУТ БЫЛА ОШИБКА. НЕ РАБОТАЕТ. Где-то на стыке раздачи и получения нового индекса
    public void givecard(Card meow){
		if(index == -1){
			index = meow.getNext();
		}else{
			int i = index;
			while(p_cards[i].getNext()!=-1){
				i = p_cards[i].getNext();
			}
			p_cards[i].setNext(meow.getNext());
		}
		meow.printCard();
		meow.printNextIndex();
		meow.setNext(-1);
	}

	public void test_print() {
		System.out.println("\nТестовая печать всего массива");
		for(Card card : p_cards){
			card.printCard();
			card.printNextIndex();
		}
	}

	public void print(){
		System.out.println("\nТестовая печать руки");
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