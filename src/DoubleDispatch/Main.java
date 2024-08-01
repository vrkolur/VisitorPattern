package DoubleDispatch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mars mars = new Mars();
        Venus venus = new Venus();
        Mercury mercury = new Mercury();
        Saturn saturn = new Saturn();
        Explorer explorer = new LifeExplorer();

        List<Planet> planetsToBeVisited = new ArrayList<>();
        planetsToBeVisited.add(mars);
        planetsToBeVisited.add(venus);
        planetsToBeVisited.add(mercury);
        planetsToBeVisited.add(saturn);

//        for (Planet planet : planetsToBeVisited) {
//            if (planet.getClass() == Mars.class) {
//                explorer.visit(mars);
//            }
//            if (planet.getClass() == Venus.class) {
//                explorer.visit(venus);
//            }
//            if (planet.getClass() == Mars.class) {
//                explorer.visit(mercury);
//            }
//        }

        for (Planet planet: planetsToBeVisited) {
            planet.accept(explorer);
        }

    }
}
