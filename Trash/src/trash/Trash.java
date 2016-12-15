/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class Trash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        List<Character> baseChar = new ArrayList();
        int o = 0;
        String a_str = "a";
        char a_char1 = a_str.charAt(0);
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your Url: ");
        String str = reader.next();
        URL url = new URL(str);
        InputStream inputStream = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            for (int i = 0; i != line.length(); i++) {
                char a_char = line.charAt(i);
                baseChar.add(a_char);
            }
        }
        for (int p = 0; p != baseChar.size(); p++) {
            if (baseChar.get(p).equals(a_char1)) {
                o++;
            }
        }
        System.out.println(o);
    }
}

    
    

