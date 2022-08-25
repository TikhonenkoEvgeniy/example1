package enums;

import java.util.concurrent.ConcurrentMap;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(Planet.MERCURY.getPlanet());
        System.out.println(Planet.MERCURY.getGod());

    }

}
 enum Planet {
        MERCURY ("Merkury", "God of Mercury"),
        LUNA ("Luna", "Moon");

        private final String planet;
        private final String god;

        Planet (String planet, String god) {
            this.planet = planet;
            this.god = god;
        }

        public String getPlanet() {
            return this.planet;
        }

        public String getGod() {
            return this.god;
        }
 }