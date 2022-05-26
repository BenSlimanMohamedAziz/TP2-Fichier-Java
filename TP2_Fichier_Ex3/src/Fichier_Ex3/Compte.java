package Fichier_Ex3;

import java.io.*;
import java.util.*;

public class Compte {
 public static void main(String[] args)throws IOException  {
	 
	 String line;
	 BufferedReader f;
	 int nbligne=0;
	 int nbmot=0;
	 int nbcar=0;
	 
 f= new BufferedReader(new FileReader("E:\\login\\in.txt"));
 StringTokenizer token = null;
 line = f.readLine();
 while (line != null) {
	 token = new StringTokenizer(line);
     nbligne++;
     nbmot += token.countTokens();
     nbcar += line.length() + 1;
     line = f.readLine();
 }
 
  f.close();
  
  System.out.println("nombre ligne = " + nbligne);
  System.out.println("nombre mote = " + nbmot);
  System.out.println("nombre caractere = " + nbcar);
 }
 
}
