public class Player {
    private Card[] p_cards = Deck.getCards();
    private int index = -1;

    // ТУТ БЫЛА ОШИБКА. НЕ РАБОТАЕТ. Где-то на стыке раздачи и получения нового индекса
    public void givecard(Card meow){
		if(index == -1){
			index = meow.getNext();
		}else{
			p_cards[index].setNext(index+2);
		}
		meow.setNext(-1);
	}

    public void print_player() {
        int x = index;
		Card tmp;
		while (x != -1){
			tmp = p_cards[x];
			x = tmp.getNext();
			tmp.printCard();
		}
        System.out.println();
    }
}
