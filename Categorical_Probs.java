package Naive_Bayes;
/*@Author - Arkadipta De*/

import java.io.*;
import java.util.Scanner;

/*@Author: Arkadipta De*/

public class Categorical_Probs 
	{public static void Compute_Probability() throws IOException
	
	 /*This static function reads counted categorical data and computes the likelihood
	   Probabilities for all categorical data and saves them into seperate csv files which
	   will be used for Target Probability Calculation Using Naive Bayes*/
	
		{System.out.println("Computation Started...");
		 /*contact_y Probability Computation*/
		 File contact_y_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/contact_y.csv"); 
		 File contact_y_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/contact_y.csv"); 
		 FileWriter contact_y_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/contact_y_prob.csv");
		 PrintWriter contact_y_printWriter = new PrintWriter(contact_y_fileWriter);
		 try 
			{Scanner sc = new Scanner(contact_y_file_a);
			 Scanner sc_ = new Scanner(contact_y_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		 contact_y_printWriter.print("cellular_y,"+prob);
	    	 	 else if (counter == 2) 
	    	 		 contact_y_printWriter.print("telephone_y,"+prob);
	    	 	 else if (counter == 3)
	    	 		 contact_y_printWriter.print("unknown_y,"+prob);
	    	 	contact_y_printWriter.print("\n");
	    	 	}
			 contact_y_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("contact_y.csv File Not Found");}
		
		 /*contact_n Probability Computation*/
		 File contact_n_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/contact_n.csv"); 
		 File contact_n_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/contact_n.csv"); 
		 FileWriter contact_n_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/contact_n_prob.csv");
		 PrintWriter contact_n_printWriter = new PrintWriter(contact_n_fileWriter);
		 try 
			{Scanner sc = new Scanner(contact_n_file_a);
			 Scanner sc_ = new Scanner(contact_n_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		 contact_n_printWriter.print("cellular_n,"+prob);
	    	 	 else if (counter == 2) 
	    	 		 contact_n_printWriter.print("telephone_n,"+prob);
	    	 	 else if (counter == 3)
	    	 		 contact_n_printWriter.print("unknown_n,"+prob);
	    	 	contact_n_printWriter.print("\n");
	    	 	}
			 contact_n_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("contact_n.csv File Not Found");}
		
		 /*default_y Probability Computation*/
		 File default_y_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/default_y.csv"); 
		 File default_y_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/default_y.csv"); 
		 FileWriter default_y_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/default_y_prob.csv");
		 PrintWriter default_y_printWriter = new PrintWriter(default_y_fileWriter);
		 try 
			{Scanner sc = new Scanner(default_y_file_a);
			 Scanner sc_ = new Scanner(default_y_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		 default_y_printWriter.print("no_y,"+prob);
	    	 	 else if (counter == 2) 
	    	 		 default_y_printWriter.print("yes_y,"+prob);
	    	 	 default_y_printWriter.print("\n");
	    	 	}
			 default_y_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("default_y.csv File Not Found");}
		
		 /*default_n Probability Computation*/
		 File default_n_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/default_n.csv"); 
		 File default_n_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/default_n.csv"); 
		 FileWriter default_n_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/default_n_prob.csv");
		 PrintWriter default_n_printWriter = new PrintWriter(default_n_fileWriter);
		 try 
			{Scanner sc = new Scanner(default_n_file_a);
			 Scanner sc_ = new Scanner(default_n_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		 default_n_printWriter.print("no_n,"+prob);
	    	 	 else if (counter == 2) 
	    	 		 default_n_printWriter.print("yes_n,"+prob);
	    	 	 default_n_printWriter.print("\n");
	    	 	}
			 default_n_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("default_n.csv File Not Found");}
		
		 /*education_y Probability Computation*/
		 File education_y_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/education_y.csv"); 
		 File education_y_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/education_y.csv"); 
		 FileWriter education_y_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/education_y_prob.csv");
		 PrintWriter education_y_printWriter = new PrintWriter(education_y_fileWriter);
		 try 
			{Scanner sc = new Scanner(education_y_file_a);
			 Scanner sc_ = new Scanner(education_y_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		education_y_printWriter.print("primary_y,"+prob);
	    	 	 else if (counter == 2) 
	    	 		education_y_printWriter.print("secondary_y,"+prob);
	    	 	 else if (counter == 3)
	    	 		education_y_printWriter.print("tertiary_y,"+prob);
	    	 	 else if (counter == 4) 
	    	 		education_y_printWriter.print("unknown_y,"+prob);
	    	 	education_y_printWriter.print("\n");
	    	 	}
			 education_y_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("education_y.csv File Not Found");}
		
		 /*education_n Probability Computation*/
		 File education_n_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/education_n.csv"); 
		 File education_n_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/education_n.csv"); 
		 FileWriter education_n_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/education_n_prob.csv");
		 PrintWriter education_n_printWriter = new PrintWriter(education_n_fileWriter);
		 try 
			{Scanner sc = new Scanner(education_n_file_a);
			 Scanner sc_ = new Scanner(education_n_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		education_n_printWriter.print("primary_n,"+prob);
	    	 	 else if (counter == 2) 
	    	 		education_n_printWriter.print("secondary_n,"+prob);
	    	 	 else if (counter == 3)
	    	 		education_n_printWriter.print("tertiary_n,"+prob);
	    	 	 else if (counter == 4) 
	    	 		education_n_printWriter.print("unknown_n,"+prob);
	    	 	education_n_printWriter.print("\n");
	    	 	}
			 education_n_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("education_n.csv File Not Found");}
		
		 /*housing_y Probability Computation*/
		 File housing_y_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/housing_y.csv"); 
		 File housing_y_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/housing_y.csv"); 
		 FileWriter housing_y_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/housing_y_prob.csv");
		 PrintWriter housing_y_printWriter = new PrintWriter(housing_y_fileWriter);
		 try 
			{Scanner sc = new Scanner(housing_y_file_a);
			 Scanner sc_ = new Scanner(housing_y_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		housing_y_printWriter.print("no_y,"+prob);
	    	 	 else if (counter == 2) 
	    	 		housing_y_printWriter.print("yes_y,"+prob);
	    	 	housing_y_printWriter.print("\n");
	    	 	}
			 housing_y_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("housing_y.csv File Not Found");}
		
		/*housing_n Probability Computation*/
		 File housing_n_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/housing_n.csv"); 
		 File housing_n_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/housing_n.csv"); 
		 FileWriter housing_n_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/housing_n_prob.csv");
		 PrintWriter housing_n_printWriter = new PrintWriter(housing_n_fileWriter);
		 try 
			{Scanner sc = new Scanner(housing_n_file_a);
			 Scanner sc_ = new Scanner(housing_n_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		housing_n_printWriter.print("no_n,"+prob);
	    	 	 else if (counter == 2) 
	    	 		housing_n_printWriter.print("yes_n,"+prob);
	    	 	housing_n_printWriter.print("\n");
	    	 	}
			 housing_n_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("housing_n.csv File Not Found");}
		
		/*job_y Probability Computation*/
		 File job_y_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/job_y.csv"); 
		 File job_y_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/job_y.csv"); 
		 FileWriter job_y_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/job_y_prob.csv");
		 PrintWriter job_y_printWriter = new PrintWriter(job_y_fileWriter);
		 try 
			{Scanner sc = new Scanner(job_y_file_a);
			 Scanner sc_ = new Scanner(job_y_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		job_y_printWriter.print("admin_y,"+prob);
	    	 	 else if (counter == 2) 
	    	 		job_y_printWriter.print("blue_collered_y,"+prob);
	    	 	 else if (counter == 3) 
	    	 		job_y_printWriter.print("entrepreneur_y,"+prob);
	    	 	 else if (counter == 4) 
	    	 		job_y_printWriter.print("housemaid_y,"+prob);
	    	 	 else if (counter == 5) 
	    	 		job_y_printWriter.print("management_y,"+prob);
	    	 	 else if (counter == 6) 
	    	 		job_y_printWriter.print("retired_y,"+prob);
	    	 	 else if (counter == 7) 
	    	 		job_y_printWriter.print("self_employed_y,"+prob);
	    	 	 else if (counter == 8) 
	    	 		job_y_printWriter.print("service_y,"+prob);
	    	 	 else if (counter == 9) 
	    	 		job_y_printWriter.print("student_y,"+prob);
	    	 	 else if (counter == 10) 
	    	 		job_y_printWriter.print("technician_y,"+prob);
	    	 	 else if (counter == 11) 
	    	 		job_y_printWriter.print("unemployed_y,"+prob);
	    	 	 else if (counter == 12) 
	    	 		job_y_printWriter.print("unknown_y,"+prob);
	    	 	job_y_printWriter.print("\n");
	    	 	}
			 job_y_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("job_y.csv File Not Found");}
		
		/*job_n Probability Computation*/
		 File job_n_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/job_n.csv"); 
		 File job_n_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/job_n.csv"); 
		 FileWriter job_n_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/job_n_prob.csv");
		 PrintWriter job_n_printWriter = new PrintWriter(job_n_fileWriter);
		 try 
			{Scanner sc = new Scanner(job_n_file_a);
			 Scanner sc_ = new Scanner(job_n_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		job_n_printWriter.print("admin_n,"+prob);
	    	 	 else if (counter == 2) 
	    	 		job_n_printWriter.print("blue_collered_n,"+prob);
	    	 	 else if (counter == 3) 
	    	 		job_n_printWriter.print("entrepreneur_n,"+prob);
	    	 	 else if (counter == 4) 
	    	 		job_n_printWriter.print("housemaid_n,"+prob);
	    	 	 else if (counter == 5) 
	    	 		job_n_printWriter.print("management_n,"+prob);
	    	 	 else if (counter == 6) 
	    	 		job_n_printWriter.print("retired_n,"+prob);
	    	 	 else if (counter == 7) 
	    	 		job_n_printWriter.print("self_employed_n,"+prob);
	    	 	 else if (counter == 8) 
	    	 		job_n_printWriter.print("service_n,"+prob);
	    	 	 else if (counter == 9) 
	    	 		job_n_printWriter.print("student_n,"+prob);
	    	 	 else if (counter == 10) 
	    	 		job_n_printWriter.print("technician_n,"+prob);
	    	 	 else if (counter == 11) 
	    	 		job_n_printWriter.print("unemployed_n,"+prob);
	    	 	 else if (counter == 12) 
	    	 		job_n_printWriter.print("unknown_n,"+prob);
	    	 	job_n_printWriter.print("\n");
	    	 	}
			 job_n_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("job_n.csv File Not Found");}
		
		/*loan_y Probability Computation*/
		 File loan_y_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/loan_y.csv"); 
		 File loan_y_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/loan_y.csv"); 
		 FileWriter loan_y_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/loan_y_prob.csv");
		 PrintWriter loan_y_printWriter = new PrintWriter(loan_y_fileWriter);
		 try 
			{Scanner sc = new Scanner(loan_y_file_a);
			 Scanner sc_ = new Scanner(loan_y_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		loan_y_printWriter.print("no_y,"+prob);
	    	 	 else if (counter == 2) 
	    	 		loan_y_printWriter.print("yes_y,"+prob);
	    	 	 loan_y_printWriter.print("\n");
	    	 	}
			 loan_y_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("loan_y.csv File Not Found");}
		
		/*loan_n Probability Computation*/
		 File loan_n_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/loan_n.csv"); 
		 File loan_n_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/loan_n.csv"); 
		 FileWriter loan_n_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/loan_n_prob.csv");
		 PrintWriter loan_n_printWriter = new PrintWriter(loan_n_fileWriter);
		 try 
			{Scanner sc = new Scanner(loan_n_file_a);
			 Scanner sc_ = new Scanner(loan_n_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		loan_n_printWriter.print("no_n,"+prob);
	    	 	 else if (counter == 2) 
	    	 		loan_n_printWriter.print("yes_n,"+prob);
	    	 	 loan_n_printWriter.print("\n");
	    	 	}
			 loan_n_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("loan_n.csv File Not Found");}
		
		/*marital_y Probability Computation*/
		 File marital_y_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/marital_y.csv"); 
		 File marital_y_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/marital_y.csv"); 
		 FileWriter marital_y_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/marital_y_prob.csv");
		 PrintWriter marital_y_printWriter = new PrintWriter(marital_y_fileWriter);
		 try 
			{Scanner sc = new Scanner(marital_y_file_a);
			 Scanner sc_ = new Scanner(marital_y_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		marital_y_printWriter.print("divorced_y,"+prob);
	    	 	 else if (counter == 2) 
	    	 		marital_y_printWriter.print("married_y,"+prob);
	    	 	 else if (counter == 3) 
	    	 		marital_y_printWriter.print("single_y,"+prob);
	    	 	 marital_y_printWriter.print("\n");
	    	 	}
			 marital_y_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("marital_y.csv File Not Found");}
		
		/*marital_n Probability Computation*/
		 File marital_n_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/marital_n.csv"); 
		 File marital_n_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/marital_n.csv"); 
		 FileWriter marital_n_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/marital_n_prob.csv");
		 PrintWriter marital_n_printWriter = new PrintWriter(marital_n_fileWriter);
		 try 
			{Scanner sc = new Scanner(marital_n_file_a);
			 Scanner sc_ = new Scanner(marital_n_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		marital_n_printWriter.print("divorced_n,"+prob);
	    	 	 else if (counter == 2) 
	    	 		marital_n_printWriter.print("married_n,"+prob);
	    	 	 else if (counter == 3) 
	    	 		marital_n_printWriter.print("single_n,"+prob);
	    	 	 marital_n_printWriter.print("\n");
	    	 	}
			 marital_n_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("marital_n.csv File Not Found");}
		
		/*month_y Probability Computation*/
		 File month_y_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/month_y.csv"); 
		 File month_y_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/month_y.csv"); 
		 FileWriter month_y_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/month_y_prob.csv");
		 PrintWriter month_y_printWriter = new PrintWriter(month_y_fileWriter);
		 try 
			{Scanner sc = new Scanner(month_y_file_a);
			 Scanner sc_ = new Scanner(month_y_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		month_y_printWriter.print("april_y,"+prob);
	    	 	 else if (counter == 2) 
	    	 		month_y_printWriter.print("august_y,"+prob);
	    	 	 else if (counter == 3) 
	    	 		month_y_printWriter.print("december_y,"+prob);
	    	 	 else if (counter == 4) 
	    	 		month_y_printWriter.print("february_y,"+prob);
	    	 	 else if (counter == 5) 
	    	 		month_y_printWriter.print("january_y,"+prob);
	    	 	 else if (counter == 6) 
	    	 		month_y_printWriter.print("july_y,"+prob);
	    	 	 else if (counter == 7) 
	    	 		month_y_printWriter.print("june_y,"+prob);
	    	 	 else if (counter == 8) 
	    	 		month_y_printWriter.print("march_y,"+prob);
	    	 	 else if (counter == 9) 
	    	 		month_y_printWriter.print("mayr_y,"+prob);
	    	 	 else if (counter == 10) 
	    	 		month_y_printWriter.print("november_y,"+prob);
	    	 	 else if (counter == 11) 
	    	 		month_y_printWriter.print("october_y,"+prob);
	    	 	 else if (counter == 12) 
	    	 		month_y_printWriter.print("september_y,"+prob);
	    	 	month_y_printWriter.print("\n");
	    	 	}
			 month_y_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("month_y.csv File Not Found");}
		
		/*month_n Probability Computation*/
		 File month_n_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/month_n.csv"); 
		 File month_n_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/month_n.csv"); 
		 FileWriter month_n_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/month_n_prob.csv");
		 PrintWriter month_n_printWriter = new PrintWriter(month_n_fileWriter);
		 try 
			{Scanner sc = new Scanner(month_n_file_a);
			 Scanner sc_ = new Scanner(month_n_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		month_n_printWriter.print("april_n,"+prob);
	    	 	 else if (counter == 2) 
	    	 		month_n_printWriter.print("august_n,"+prob);
	    	 	 else if (counter == 3) 
	    	 		month_n_printWriter.print("december_n,"+prob);
	    	 	 else if (counter == 4) 
	    	 		month_n_printWriter.print("february_n,"+prob);
	    	 	 else if (counter == 5) 
	    	 		month_n_printWriter.print("january_n,"+prob);
	    	 	 else if (counter == 6) 
	    	 		month_n_printWriter.print("july_n,"+prob);
	    	 	 else if (counter == 7) 
	    	 		month_n_printWriter.print("june_n,"+prob);
	    	 	 else if (counter == 8) 
	    	 		month_n_printWriter.print("march_n,"+prob);
	    	 	 else if (counter == 9) 
	    	 		month_n_printWriter.print("mayr_n,"+prob);
	    	 	 else if (counter == 10) 
	    	 		month_n_printWriter.print("november_n,"+prob);
	    	 	 else if (counter == 11) 
	    	 		month_n_printWriter.print("october_n,"+prob);
	    	 	 else if (counter == 12) 
	    	 		month_n_printWriter.print("september_n,"+prob);
	    	 	month_n_printWriter.print("\n");
	    	 	}
			 month_n_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("month_n.csv File Not Found");}
		
		/*poutcome_y Probability Computation*/
		 File poutcome_y_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/poutcome_y.csv"); 
		 File poutcome_y_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/poutcome_y.csv"); 
		 FileWriter poutcome_y_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/poutcome_y_prob.csv");
		 PrintWriter poutcome_y_printWriter = new PrintWriter(poutcome_y_fileWriter);
		 try 
			{Scanner sc = new Scanner(poutcome_y_file_a);
			 Scanner sc_ = new Scanner(poutcome_y_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		poutcome_y_printWriter.print("failure_y,"+prob);
	    	 	 else if (counter == 2) 
	    	 		poutcome_y_printWriter.print("other_y,"+prob);
	    	 	 else if (counter == 3) 
	    	 		poutcome_y_printWriter.print("success_y,"+prob);
	    	 	 else if (counter == 4) 
	    	 		poutcome_y_printWriter.print("unkown_y,"+prob);
	    	 	poutcome_y_printWriter.print("\n");
	    	 	}
			 poutcome_y_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("poutcome_y.csv File Not Found");}
		
		/*poutcome_n Probability Computation*/
		 File poutcome_n_file_a = new File("/home/edureka/Desktop/Prediction_Project/count_data/poutcome_n.csv"); 
		 File poutcome_n_file_b = new File("/home/edureka/Desktop/Prediction_Project/count_data/poutcome_n.csv"); 
		 FileWriter poutcome_n_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/poutcome_n_prob.csv");
		 PrintWriter poutcome_n_printWriter = new PrintWriter(poutcome_n_fileWriter);
		 try 
			{Scanner sc = new Scanner(poutcome_n_file_a);
			 Scanner sc_ = new Scanner(poutcome_n_file_b); 
			 double sum = 0;
			 while (sc.hasNextLine()) 
			 	{String line[] = sc.nextLine().split(",");
				 sum += Double.parseDouble(line[1]);
		    	}
			 int counter = 0;
			 while (sc_.hasNextLine()) 
	    	 	{counter++;
				 String line[] = sc_.nextLine().split(",");
	    	 	 double prob = Double.parseDouble(line[1])/sum;
	    	 	 if (counter == 1)
	    	 		poutcome_n_printWriter.print("failure_n,"+prob);
	    	 	 else if (counter == 2) 
	    	 		poutcome_n_printWriter.print("other_n,"+prob);
	    	 	 else if (counter == 3) 
	    	 		poutcome_n_printWriter.print("success_n,"+prob);
	    	 	 else if (counter == 4) 
	    	 		poutcome_n_printWriter.print("unkown_n,"+prob);
	    	 	poutcome_n_printWriter.print("\n");
	    	 	}
			 poutcome_n_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("poutcome_n.csv File Not Found");}
		
		/*target Probability Computation*/
		 File target_y_file = new File("/home/edureka/Desktop/Prediction_Project/count_data/target_y.csv"); 
		 File target_n_file = new File("/home/edureka/Desktop/Prediction_Project/count_data/target_n.csv"); 
		 FileWriter target_fileWriter = new FileWriter("/home/edureka/Desktop/Prediction_Project/Categorical_Probs/target_prob.csv");
		 PrintWriter target_printWriter = new PrintWriter(target_fileWriter);
		 try 
			{Scanner sc = new Scanner(target_y_file);
			 Scanner sc_ = new Scanner(target_n_file); 
			 double sum = 0;
			 String line_1[] = sc.nextLine().split(",");
			 String line_2[] = sc_.nextLine().split(",");
			 sum = Double.parseDouble(line_1[1]) + Double.parseDouble(line_2[1]);
	    	 double prob_y = Double.parseDouble(line_1[1])/sum;
	    	 target_printWriter.print("yes,"+prob_y);
	    	 target_printWriter.print("\n");
	    	 double prob_n = Double.parseDouble(line_2[1])/sum;
	    	 target_printWriter.print("no,"+prob_n);
	    	 target_printWriter.close();
			}
		catch (FileNotFoundException e)
			{System.out.println("target_y.csv or target_n.csv File Not Found");}
		System.out.println("Computation Finished");
		}
	
	 /*Driver Method for Compute_Probability*/
	 public static void main(String args[]) throws IOException
	 	{Categorical_Probs.Compute_Probability();}
	}
