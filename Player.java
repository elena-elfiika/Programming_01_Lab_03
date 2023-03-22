public class Player {
    private Card[] p_cards = Deck.getCards();
    private int index = -1;

    // ТУТ БЫЛА ОШИБКА. НЕ РАБОТАЕТ. Где-то на стыке раздачи и получения нового индекса
    public void givecard(Card meow){
		int x = index;
		Card tmp = meow;
		
		if(index == -1){
			index = meow.getNext();
		}
		
		while(x != -1){
			tmp = p_cards[x];
			x = tmp.getNext();
		}
		p_cards[index] = tmp;

		meow.printCard();
		// Отладочный вывод индекса
		// meow.printindex();
		meow.setNext(-1);
	}
}
