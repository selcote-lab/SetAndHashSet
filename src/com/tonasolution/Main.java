package com.tonasolution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarySystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarySystem.put(temp.getName(), temp);
        planets.add(temp);


        temp = new HeavenlyBody("Venus", 225);
        solarySystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarySystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarySystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupiter", 4332);
        solarySystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarySystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarySystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarySystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Pluto", 248);
        solarySystem.put(temp.getName(), temp);
        planets.add(temp);


        for(HeavenlyBody hb : planets){
            System.out.println("\t" + hb.getName());
        }

        HeavenlyBody body = solarySystem.get("Earth");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody moon: body.getSatellites() ){
            System.out.println("\t" + moon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All the moons");
        for(HeavenlyBody moon: moons){
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBody planet: planets){
            System.out.println(planet.getName() + " : " + planet.getOrbitalPeriod());
        }

    }
}
