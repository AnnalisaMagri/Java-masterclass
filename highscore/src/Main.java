public class Main {

    public static void main(String[] args) {
        int position = calculateHighScorePosition(6);
        displayHighScorePosition("Anna", position);
    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.print(name + " managed to get into position " + position +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int playerscore) {
        if (playerscore >= 1000) {
            return 1;
        } else if (playerscore >=500){
            return 2;
        }else if (playerscore >=100){
            return 3;
        }
        return 4;
    }
}