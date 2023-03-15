public class Card {
    // Карта состоит из своего индекса и индекса следующей
    private final int card;
    private int index = -1;

    public Card(int x){
        this.card = x;
    }
    
    // Инкапсуляция из-за неизменяемости, для взаимодействия с картами
    public int getNext(){
        return index;
    }
    public int getCard(){
        return card;
    }
    public void setNext(int y){
        this.index = y;
    }
    // Присвоене масти и номинала для вывода и вывод
    public void printCard() {
        String result = "";
        switch (card / 4) {
            case 0:
                result += "6";
                break;
            case 1:
                result += "7";
                break;
            case 2:
                result += "8";
                break;
            case 3:
                result += "9";
                break;
            case 4:
                result += "10";
                break;
            case 5:
                result += "J";
                break;
            case 6:
                result += "Q";
                break;
            case 7:
                result += "K";
                break;
            case 8:
                result += "A";
                break;
            default:
            result += "ERROR";
            break;
        }
        switch (card % 4) {
            case 0:
                result += "♥️";
                break;
            case 1:
                result += "♦️";
                break;
            case 2:
                result += "♣️";
                break;
            case 3:
                result += "♠️";
                break;
            default:
                result += "ERROR";
                break;
        }
        System.out.print(result + " ");
 }
}