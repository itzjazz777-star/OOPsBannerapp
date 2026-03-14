public class BannerUC6 {

    static String[] getO() {
        return new String[]{
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        };
    }

    static String[] getP() {
        return new String[]{
            "PPPP ",
            "P   P",
            "PPPP ",
            "P    ",
            "P    "
        };
    }

    static String[] getS() {
        return new String[]{
            " SSS ",
            "S    ",
            " SSS ",
            "    S",
            " SSS "
        };
    }

    public static void main(String[] args) {

        String[][] letters = {getO(), getO(), getP(), getS()};

        for(int i=0;i<5;i++){
            for(String[] letter : letters){
                System.out.print(letter[i] + " ");
            }
            System.out.println();
        }
    }
}