public class Lab_03_Main {

    public static void main(String[] args) {

        // Колода общая
        Deck gamedeck = new Deck();

        // Печать колоды
        System.out.println("\nКолода");
        gamedeck.PrintDeck();

        // Перемешивание карт
        gamedeck.Shuffle();

        // Печать перемешанной колоды
        System.out.println("\nПеремешанная колода");
        gamedeck.PrintDeck();

        // Игрок 1
        Player player_1 = new Player();

        // Игрок 2
        Player player_2 = new Player();
        
        // Раздача карт игрокам
        System.out.println("\nРаздача");
        gamedeck.destribute(player_1, player_2);

        System.out.println("\nИгрок 1:");
        player_1.print();
        System.out.println();

        System.out.println("\nИгрок 2:");
        player_2.print();
        System.out.println();
    }
}
