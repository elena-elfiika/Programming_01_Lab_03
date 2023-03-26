public class Player {
    private Card[] p_cards;
    private int index = -1;

    public Player(){
        p_cards = Deck.getCards();
    }

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

	// public void test_print(Player p_t) {
	// 	for(Card card : p_cards){
	// 		card.printindex();
	// 		card.printCard();
	// 	}
	// }

	public void print(){
		int curr = index;
		Card tmp;
		do{
			tmp = p_cards[curr];
			curr = tmp.getNext();
			tmp.printCard();
		}while(curr!=-1);
	}
}