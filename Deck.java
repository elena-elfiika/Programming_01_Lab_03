import java.util.Random;

public class Deck{
    // Объем колоды
    private final int quantity = 36;
    // Колода
    private static Card[] cards;

    // Создание колоды
    public Deck(){
        int i = -1;
        cards = new Card[quantity];
        for(int kva = 0; kva < quantity; kva += 1){
            cards[kva] = new Card(kva);
            if (kva == quantity-1){
                i = -1;
            } else {
                i = kva+1;
            }
            cards[kva].setNext(i);
        }
    }

    // Вывод колоды
    public void PrintDeck(){
        for(Card card : cards){
            card.printCard();
            // Отладочный вывод индекса
            // card.printNextIndex();
        }
        System.out.println();
    }

    // Перемешивание колоды
    public void Shuffle(){
        Random rand = new Random();
        int r_p, i = -1, tmp_i = -1;
        Card temp;
        for (int kva = 0; kva < quantity; kva += 1){
            r_p = rand.nextInt(36);
            temp = cards[kva];
            cards[kva] = cards[r_p];
            tmp_i = cards[r_p].getNext();
            if (kva == quantity - 1) i = -1;
            if (kva < quantity - 1) i = kva+1;
            cards[kva].setNext(i);
            cards[r_p] = temp;
            cards[r_p].setNext(tmp_i);
        }
    }

    // Инкапсуляция
    public static Card[] getCards(){
        return cards;
    }

    // Раздача карт
    public void destribute(Player p_1, Player p_2){
        
        for(int gav = 0; gav < 35; gav += 2){
            cards[gav].setNext(gav);
            cards[gav+1].setNext(gav+1);
            p_1.givecard(cards[gav]);
            p_2.givecard(cards[gav+1]);
        }
        System.out.println();
    }
}