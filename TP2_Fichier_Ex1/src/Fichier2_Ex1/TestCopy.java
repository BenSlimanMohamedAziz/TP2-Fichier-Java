package Fichier2_Ex1;

import java.io.*;
public class TestCopy {
	//Exercice 1:
public static void main(String[] args) throws IOException {
File inputFile = new File("E:\\fichiers\\in.txt");
File outputFile = new File("E:\\fichiers\\out.txt");
FileInputStream in=new FileInputStream(inputFile);
FileOutputStream out=new FileOutputStream(outputFile);
int i;
while((i=in.read())!=-1)
	out.write(i);

in.close();
out.close();
}
}
