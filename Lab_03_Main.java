public class Lab_03_Main {

    public static void main(String[] args) {

        // Колода общая
        Deck gamedeck = new Deck();

        // Печать колоды
        System.out.println("Колода");
        gamedeck.PrintDeck();

        // Перемешивание карт
        gamedeck.Shuffle();

        // Печать перемешанной колоды
        System.out.println("Перемешанная колода");
        gamedeck.PrintDeck();

        // Игрок 1
        Player player_1 = new Player();

        // Игрок 2
        Player player_2 = new Player();
        
        // Раздача карт игрокам
        gamedeck.destribute(player_1, player_2);

        // player_1.print();
        System.out.println();
    }
}
