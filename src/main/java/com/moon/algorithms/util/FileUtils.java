package com.moon.algorithms.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/12/16
 */
public class FileUtils {

    private static BufferedInputStream readFile(String filePath) {
        InputStream resourceAsStream = FileUtils.class.getClassLoader().getResourceAsStream(filePath);
        assert resourceAsStream != null;
        return new BufferedInputStream(resourceAsStream);
    }

    public static Scanner scannerFromFile(String filePath) {
        return new Scanner(readFile(filePath));
    }
}
