import java.util.HashMap;
import java.util.Map;

public class BannerUC8 {

    public static void main(String[] args) {

        Map<Character,String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        map.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        map.put('S', new String[]{
                " SSS ",
                "S    ",
                " SSS ",
                "    S",
                " SSS "
        });

        String word = "OOPS";

        for(int i=0;i<5;i++){
            for(char c : word.toCharArray()){
                System.out.print(map.get(c)[i] + " ");
            }
            System.out.println();
        }
    }
}