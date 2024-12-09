package com.thgross.aoc;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public abstract class Application {

    public abstract void run();

    protected InputStream getFileAsInputStream(String filename) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        return classloader.getResourceAsStream(filename);
    }

    protected String getFileContent(String filename) throws IOException {
        var inputStream = getFileAsInputStream(filename);
        return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
    }

    protected int[] removeElement(int[] arr, int removedIdx) {
        int[] dest = new int[arr.length - 1];

        System.arraycopy(arr, 0, dest, 0, removedIdx);
        System.arraycopy(arr, removedIdx + 1, dest, removedIdx, arr.length - 1 - removedIdx);

        return dest;
    }

    public static String trim(String input, String charsToTrim) {
        String regex = "^[" + charsToTrim + "]+|[" + charsToTrim + "]+$";
        return input.replaceAll(regex, "");
    }
}
