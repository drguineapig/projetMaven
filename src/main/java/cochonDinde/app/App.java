package cochonDinde.app;

import cochonDinde.model.CochonDinde;

public class App {
    public static void main(String[] args) {
        CochonDinde cafe = new CochonDinde("cafe","agouti");
        System.out.println(cafe.getNom());
        System.out.println(cafe.getRace());
    }
}
