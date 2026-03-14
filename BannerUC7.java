public class BannerUC7 {

    static class CharacterPattern {
        char letter;
        String[] pattern;

        CharacterPattern(char letter, String[] pattern){
            this.letter = letter;
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O',
                new String[]{
                        " OOO ",
                        "O   O",
                        "O   O",
                        "O   O",
                        " OOO "
                });

        CharacterPattern P = new CharacterPattern('P',
                new String[]{
                        "PPPP ",
                        "P   P",
                        "PPPP ",
                        "P    ",
                        "P    "
                });

        CharacterPattern S = new CharacterPattern('S',
                new String[]{
                        " SSS ",
                        "S    ",
                        " SSS ",
                        "    S",
                        " SSS "
                });

        CharacterPattern[] word = {O,O,P,S};

        for(int i=0;i<5;i++){
            for(CharacterPattern cp : word){
                System.out.print(cp.pattern[i] + " ");
            }
            System.out.println();
        }
    }
}