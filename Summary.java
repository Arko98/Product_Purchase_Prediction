package Naive_Bayes;
/*@Author - Arkadipta De*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Summary 
	{static int true_positive = 0;
	 static int false_positive = 0;
	 static int true_negetive = 0;
	 static int false_negetive = 0;
	 public static void summary() throws IOException
		{File file = new File("/home/edureka/Desktop/Prediction_Project/prediction"); 
		 try 
		 	{Scanner sc = new Scanner(file);
		 	 while(sc.hasNextLine() == true)
		 	 	{String words[] = sc.nextLine().split("\t");
		 	 	 if(words[0].equals(words[1]) && words[0].equals("\"yes\""))
		 	 	 	{true_positive++;}
		 	 	 else if(words[0].equals(words[1]) && words[0].equals("\"no\""))
	 	 	 		{true_negetive++;}
		 	 	 else if(words[0].equals("\"no\"") && words[1].equals("\"yes\""))
	 	 	 		{false_positive++;}
		 	 	 else if(words[0].equals("\"yes\"") && words[1].equals("\"no\""))
 	 	 			{false_negetive++;}
		 	 	} 
		 	double accuracy = ((double)true_positive + (double)true_negetive)/4521;
		 	System.out.println("Summary File Writing Started");
		 	FileWriter fw = new FileWriter("/home/edureka/Desktop/Prediction_Project/Summary.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.print("\nTrue Positive : "+true_positive);
			pw.print("\nTrue negetive : "+true_negetive);
			pw.print("\nFalse Positive: "+false_positive);
			pw.print("\nFalse Negetive: "+false_negetive);
			pw.print("\nAccuracy      : "+accuracy);
			pw.close();
			System.out.println("Summary File Ready");
		 	}
		 catch (FileNotFoundException e) 
			{System.out.println("Prediction File Not Found");}
		}
	 public static void main(String args[]) throws IOException
	 	{Summary.summary();}
	}
