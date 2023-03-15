public class Player {
    private static Card[] p_cards = Deck.getCards();
    private int index = -1;

    public void givecard(Card card) {
        int i = index;
        int krya = p_cards[card.getCard()].getCard();
        if (i == -1){
            index = krya;
            return;
        }
        Card tmp = p_cards[i];
        int next = tmp.getNext();
        while (next != -1){
            i = next;
            tmp = p_cards[i];
            next = tmp.getNext();
        }
        tmp.setNext(krya);

    }

    public void print_player() {
        int next = index;
        while(next != -1){
            Card tmp = p_cards[next];
            tmp.printCard();
            next = tmp.getNext();
        }
        System.out.println();
    }
}
