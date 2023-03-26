public class Player {
    private Card[] p_cards = Deck.getCards();
	int index = -1;

	// ТУТ БЫЛА ОШИБКА. НЕ РАБОТАЕТ. Где-то на стыке раздачи и получения нового индекса
    public void givecard(Card meow){
		// if(index == -1){
		// 	index = meow.getNext();
		// }
		
		// int i = index;
		// Card tmp;
		// while(i != -1){
		// 	tmp = p_cards[i];
		// 	i = tmp.getNext();
		// }
		// p_cards[i].setNext(meow.getNext());

		// meow.printCard();
		// meow.printNextIndex();
		// meow.setNext(-1);
		int x = index;
 		Card tmp = meow;

 		if(index == -1){
 			index = meow.getNext();
 		}

		while(x != -1){
			tmp = p_cards[x];
			x = tmp.getNext();
			// tmp.printCard();
			// отладочное
			// tmp.printindex();
		}

		p_cards[index] = tmp;

 		// Отладочный вывод карты и индекса
		// meow.printCard();
 		// meow.printNextIndex();
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
		// System.out.println("\nПечать руки");
		int x = index;
		Card tmp;
		while(x != -1){
			tmp = p_cards[x];
			tmp.printCard();
			x = tmp.getNext();
		}
		System.out.println();
	}
}