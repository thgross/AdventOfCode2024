package com.thgross;

import com.thgross.aoc.Application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class AOC2024_15 extends Application {
    public static void main(String[] args) {
        (new AOC2024_15()).run();
    }

    static class Pdata {
        int mapW, mapH;
        char[][] map;
        List<Integer> robotRules = new ArrayList<>();
        Instant start;
        Instant stop;
    }

    private final AOC2024_15.Pdata lc = new AOC2024_15.Pdata();

    @Override
    public void run() {
        try {
            lc.start = Instant.now();
            calcAll("input15-t1.txt");
            lc.stop = Instant.now();

            System.out.println("======================================");
            System.out.printf("Runtime: %s\n", Duration.between(lc.start, lc.stop));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("SameParameterValue")
    private void calcAll(String inputFile) throws IOException {

        var slines = getFileLines(inputFile);

        // TODO: calculate map size and read map

//        lc.mapH = slines.size();
//        lc.mapW= slines.getFirst().length();
//        lc.map = new char[lc.mapH][lc.mapW];

        // TODO: fill map and robot rules

    }
}
