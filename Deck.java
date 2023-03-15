import java.util.Random;

public class Deck{
    // Объем колоды
    private final int quantity = 36;
    // Колода
    private static Card[] cards;

    // Создание колоды
    public Deck(){
        cards = new Card[quantity];
        for(int kva = 0; kva < quantity; kva += 1){
            cards[kva] = new Card(kva);
        }
    }

    // Вывод колоды
    public void PrintDeck(){
        for(Card card : cards){
            card.printCard();
        }
        System.out.println();
    }

    // Перемешивание колоды
    public void Shuffle(){
        Random rand = new Random();
        int r_p;
        Card temp;
        for (int kva = 0; kva < quantity; kva += 1){
            r_p = rand.nextInt(36);
            temp = cards[kva];
            cards[kva] = cards[r_p];
            cards[r_p] = temp;

        }
    }

    // Раздача карт
    public void destribute(Player p_1, Player p_2){
        for(int kva = 0; kva < quantity; kva += 2){
            p_1.givecard(cards[kva]);
            p_2.givecard(cards[kva+1]);
        }
    }

    // Инкапсуляция
    public static Card[] getCards(){
        return cards;
    }
    
}