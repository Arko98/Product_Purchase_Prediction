package Naive_Bayes;
/*@Author - Arkadipta De*/

import java.io.File;
import java.lang.Math;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class Probability_Compute_Mapper extends Mapper<LongWritable,Text,Text,HashMap<String,DoubleWritable>> 
	{private HashMap<String,DoubleWritable> record = new HashMap<String,DoubleWritable>();
	 private ArrayList<Double> yes_prob_list = new ArrayList<Double>();
	 private ArrayList<Double> no_prob_list = new ArrayList<Double>();
	 static double m_age_y;
	 static double m_age_n;
	 static double m_balance_y;
	 static double m_balance_n;
	 static double m_day_y;
	 static double m_day_n;
	 static double m_duration_y;
	 static double m_duration_n;
	 static double m_campaign_y;
	 static double m_campaign_n;
	 static double m_pdays_y;
	 static double m_pdays_n;
	 static double m_previous_y;
	 static double m_previous_n;
	 
	 static double sd_age_y;
	 static double sd_age_n;
	 static double sd_balance_y;
	 static double sd_balance_n;
	 static double sd_day_y;
	 static double sd_day_n;
	 static double sd_duration_y;
	 static double sd_duration_n;
	 static double sd_campaign_y;
	 static double sd_campaign_n;
	 static double sd_pdays_y;
	 static double sd_pdays_n;
	 static double sd_previous_y;
	 static double sd_previous_n;
	 
	 static double contact_y_cellular_prob = 0.7984644913627639;
	 static double contact_y_telephone_prob = 0.08445297504798464;
	 static double contact_y_unknown_prob = 0.11708253358925144;
	 static double default_y_no_prob = 0.982725527831094;
	 static double default_y_yes_prob = 0.01727447216890595;
	 static double education_y_primary_prob = 0.12284069097888675;
	 static double education_y_secondary_prob = 0.47024952015355087;
	 static double education_y_tertiary_prob = 0.3704414587332054;
	 static double education_y_unknown_prob = 0.036468330134357005;
	 static double housing_y_yes_prob = 0.42226487523992323;
	 static double housing_y_no_prob = 0.5777351247600768;
	 static double job_y_admin_prob = 0.11132437619961612;
	 static double job_y_blue_collered_prob = 0.1324376199616123;
	 static double job_y_entrepreneur_prob = 0.028790786948176585;
	 static double job_y_housemaid_prob = 0.026871401151631478;
	 static double job_y_management_prob = 0.2514395393474088;
	 static double job_y_retired_prob = 0.1036468330134357;
	 static double job_y_self_employed_prob = 0.03838771593090211;
	 static double job_y_service_prob = 0.07293666026871401;
	 static double job_y_student_prob = 0.036468330134357005;
	 static double job_y_technician_prob = 0.15930902111324377;
	 static double job_y_unemployed_prob = 0.02495201535508637;
	 static double job_y_unknown_prob = 0.013435700575815739;
	 static double loan_y_yes_prob = 0.9174664107485605;
	 static double loan_y_no_prob = 0.08253358925143954;
	 static double marital_y_divorced_prob = 0.14779270633397312;
	 static double marital_y_married_prob = 0.5316698656429942;
	 static double marital_y_single_prob = 0.32053742802303264;
	 static double month_y_april_prob = 0.1074856046;
	 static double month_y_august_prob = 0.1516314779;
	 static double month_y_december_prob = 0.0172744722;
	 static double month_y_february_prob = 0.0729366603;
	 static double month_y_january_prob = 0.0307101727;
	 static double month_y_july_prob = 0.1170825336;
	 static double month_y_june_prob = 0.1055662188;
	 static double month_y_march_prob = 0.0403071017;
	 static double month_y_may_prob = 0.1785028791;
	 static double month_y_november_prob = 0.0748560461;
	 static double month_y_october_prob = 0.0710172745;
	 static double month_y_september_prob = 0.0326295585;
	 static double poutcome_y_failure_prob = 0.12092130518234165;
	 static double poutcome_y_other_prob = 0.07293666026871401;
	 static double poutcome_y_success_prob = 0.15930902111324377;
	 static double poutcome_y_unknown_prob = 0.6468330134357005;
	 static double target_y_prob = 0.8847600088476001;
	 
	 static double contact_n_cellular_prob = 0.62;
	 static double contact_n_telephone_prob = 0.06425;
	 static double contact_n_unknown_prob = 0.31575;
	 static double default_n_no_prob = 0.98325;
	 static double default_n_yes_prob = 0.01675;
	 static double education_n_primary_prob = 0.1535;
	 static double education_n_secondary_prob = 0.51525;
	 static double education_n_tertiary_prob = 0.28925;
	 static double education_n_unknown_prob = 0.042;
	 static double housing_n_yes_prob = 0.58475;
	 static double housing_n_no_prob = 0.41525;
	 static double job_n_admin_prob = 0.105;
	 static double job_n_blue_collered_prob = 0.21925;
	 static double job_n_entrepreneur_prob = 0.03825;
	 static double job_n_housemaid_prob = 0.0245;
	 static double job_n_management_prob = 0.2095;
	 static double job_n_retired_prob = 0.044;
	 static double job_n_self_employed_prob = 0.04075;
	 static double job_n_service_prob = 0.09475;
	 static double job_n_student_prob = 0.01625;
	 static double job_n_technician_prob = 0.17125;
	 static double job_n_unemployed_prob = 0.02875;
	 static double job_n_unknown_prob = 0.00775;
	 static double loan_n_yes_prob = 0.162;
	 static double loan_n_no_prob = 0.838;
	 static double marital_n_divorced_prob = 0.11275;
	 static double marital_n_married_prob = 0.63;
	 static double marital_n_single_prob = 0.25725;
	 static double month_n_april_prob = 0.05925;
	 static double month_n_august_prob = 0.1385;
	 static double month_n_december_prob = 0.00275;
	 static double month_n_february_prob = 0.046;
	 static double month_n_january_prob = 0.033;
	 static double month_n_july_prob = 0.16125;
	 static double month_n_june_prob = 0.119;
	 static double month_n_march_prob = 0.007;
	 static double month_n_may_prob = 0.32625;
	 static double month_n_november_prob = 0.0875;
	 static double month_n_october_prob = 0.01075;
	 static double month_n_september_prob = 0.00875;
	 static double poutcome_n_failure_prob = 0.10675;
	 static double poutcome_n_other_prob = 0.03975;
	 static double poutcome_n_success_prob = 0.0115;
	 static double poutcome_n_unknown_prob = 0.842;
	 static double target_n_prob = 0.11523999115239991;
	 
	 protected void setup(Context context) throws IOException, InterruptedException 
	 	
	    /*This Method Initializes the mean, sd and categorical probabilities*/
	 
		{/*Loading Mean and SD files of Continous Features and storing them in variables*/
		 File mean_y_file = new File("/home/edureka/Desktop/Prediction_Project/mean_sd/mean_y.csv");
		 File mean_n_file = new File("/home/edureka/Desktop/Prediction_Project/mean_sd/mean_n.csv");
		 File sd_y_file = new File("/home/edureka/Desktop/Prediction_Project/mean_sd/sd_y.csv");
		 File sd_n_file = new File("/home/edureka/Desktop/Prediction_Project/mean_sd/sd_n.csv");
		 
		 try
		 	{Scanner mean_y = new Scanner(mean_y_file);
		 	 Scanner mean_n = new Scanner(mean_n_file);
		 	 Scanner sd_y = new Scanner(sd_y_file);
		 	 Scanner sd_n = new Scanner(sd_n_file);
		 	 String line_m_y[] = mean_y.nextLine().split(",");
		 	 String line_m_n[] = mean_n.nextLine().split(",");
		 	 String line_sd_y[] = sd_y.nextLine().split(",");
		 	 String line_sd_n[] = sd_n.nextLine().split(",");
		 	 
		 	 m_age_y = Double.parseDouble(line_m_y[0]);
			 m_age_n = Double.parseDouble(line_m_n[0]);
			 m_balance_y = Double.parseDouble(line_m_y[1]);
			 m_balance_n = Double.parseDouble(line_m_n[1]);
			 m_day_y = Double.parseDouble(line_m_y[2]);
			 m_day_n = Double.parseDouble(line_m_n[2]);
			 m_duration_y = Double.parseDouble(line_m_y[3]);
			 m_duration_n = Double.parseDouble(line_m_n[3]);
			 m_campaign_y = Double.parseDouble(line_m_y[4]);
			 m_campaign_n = Double.parseDouble(line_m_n[4]);
			 m_pdays_y = Double.parseDouble(line_m_y[5]);
			 m_pdays_n = Double.parseDouble(line_m_n[5]);
			 m_previous_y = Double.parseDouble(line_m_y[6]);
			 m_previous_n = Double.parseDouble(line_m_n[6]);
			 
			 sd_age_y = Double.parseDouble(line_sd_y[0]);
			 sd_age_n = Double.parseDouble(line_sd_n[0]);
			 sd_balance_y = Double.parseDouble(line_sd_y[1]);
			 sd_balance_n = Double.parseDouble(line_sd_n[1]);
			 sd_day_y = Double.parseDouble(line_sd_y[2]);
			 sd_day_n = Double.parseDouble(line_sd_n[2]);
			 sd_duration_y = Double.parseDouble(line_sd_y[3]);
			 sd_duration_n = Double.parseDouble(line_sd_n[3]);
			 sd_campaign_y = Double.parseDouble(line_sd_y[4]);
			 sd_campaign_n = Double.parseDouble(line_sd_n[4]);
			 sd_pdays_y = Double.parseDouble(line_sd_y[5]);
			 sd_pdays_n = Double.parseDouble(line_sd_n[5]);
			 sd_previous_y = Double.parseDouble(line_sd_y[6]);
			 sd_previous_n = Double.parseDouble(line_sd_n[6]);
		 	}
		  catch(FileNotFoundException e)
		  	{System.out.println("Mean or Standard_Deviation File Not Found");}	 
		}
	protected void map(LongWritable key, Text value,Context context) throws IOException, InterruptedException 
	
		/*This method computes the probabilities line by line for each case(i.e - target yes and target no)
		  and stores them in each line in the following form {'yes':prob_list_yes,'no':prob_list_no}
		  which will later be used (in the other mapper) to compute product of final probability and results in a final probability 
		  hashmap in following form {'yes':final_yes_class_prob,'no':final_no_class_prob}*/
	
		{String line = value.toString().trim();
		 String lineParts[] = line.split(",");
		 
		 /*Probability Computation*/
		 for(int i = 0;i<lineParts.length;i++)
		 	{if(i==0)
		 		{double x = Double.parseDouble(lineParts[i]);
		 		 double prob_y = Gaussian.Gaussian_prob(x, m_age_y, sd_age_y);
		 		 double prob_n = Gaussian.Gaussian_prob(x, m_age_n, sd_age_n);
		 		 yes_prob_list.add(prob_y);
		 		 no_prob_list.add(prob_n);
		 		}
		 	 else if(i==1)
	 			{String x = lineParts[i];
	 			 if(x.equals("\"admin\""))
	 			 	{double prob_y = job_y_admin_prob;
	 			 	 double prob_n = job_n_admin_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
	 			 	}
	 			 else if(x.equals("\"blue-collar\""))
 			 		{double prob_y = job_y_blue_collered_prob;
 			 		 double prob_n = job_n_blue_collered_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			else if(x.equals("\"entrepreneur\""))
 			 		{double prob_y = job_y_entrepreneur_prob;
 			 		 double prob_n = job_n_entrepreneur_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			else if(x.equals("\"housemaid\""))
 			 		{double prob_y = job_y_housemaid_prob;
 			 		 double prob_n = job_n_housemaid_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			else if(x.equals("\"management\""))
 			 		{double prob_y = job_y_management_prob;
 			 		 double prob_n = job_n_management_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			else if(x.equals("\"retired\""))
 			 		{double prob_y = job_y_retired_prob;
 			 		 double prob_n = job_n_retired_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			else if(x.equals("\"self-employed\""))
 			 		{double prob_y = job_y_self_employed_prob;
 			 		 double prob_n = job_n_self_employed_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			else if(x.equals("\"services\""))
 			 		{double prob_y = job_y_service_prob;
 			 		 double prob_n = job_n_service_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			else if(x.equals("\"student\""))
 			 		{double prob_y = job_y_student_prob;
 			 		 double prob_n = job_n_student_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			else if(x.equals("\"technician\""))
 			 		{double prob_y = job_y_technician_prob;
 			 		 double prob_n = job_n_technician_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			else if(x.equals("\"unemployed\""))
 			 		{double prob_y = job_y_unemployed_prob;
 			 		 double prob_n = job_n_unemployed_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			else if(x.equals("\"unknown\""))
 			 		{double prob_y = job_y_unknown_prob;
 			 		 double prob_n = job_n_unknown_prob;
	 			 	 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
 			 		}
	 			}
		 	 else if(i==2)
 				{String x = lineParts[i];
 				 if(x.equals("\"married\""))
 			 		{double prob_y = marital_y_married_prob;
 			 		 double prob_n = marital_n_married_prob;
 			 		 yes_prob_list.add(prob_y);
 			 		 no_prob_list.add(prob_n);
 			 		}
 				 else if(x.equals("\"divorced\""))
			 		{double prob_y = marital_y_divorced_prob;
			 		 double prob_n = marital_n_divorced_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
 				else if(x.equals("\"single\""))
		 			{double prob_y = marital_y_single_prob;
		 			 double prob_n = marital_n_single_prob;
		 			 yes_prob_list.add(prob_y);
		 			 no_prob_list.add(prob_n);
		 			}
 				}
		 	 else if(i==3)
 				{String x = lineParts[i];
				 if(x.equals("\"primary\""))
			 		{double prob_y = education_y_primary_prob;
			 		 double prob_n = education_n_primary_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"secondary\""))
			 		{double prob_y = education_y_secondary_prob;
			 		 double prob_n = education_n_secondary_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				else if(x.equals("\"tertiary\""))
		 			{double prob_y = education_y_tertiary_prob;
		 			 double prob_n = education_n_tertiary_prob;
		 			 yes_prob_list.add(prob_y);
		 			 no_prob_list.add(prob_n);
		 			}
				else if(x.equals("\"unknown\""))
	 				{double prob_y = education_y_unknown_prob;
	 				 double prob_n = education_n_unknown_prob;;
	 				 yes_prob_list.add(prob_y);
	 				 no_prob_list.add(prob_n);
	 				}
 				}
		 	 else if(i==4)
 				{String x = lineParts[i];
				 if(x.equals("\"no\""))
			 		{double prob_y = default_y_no_prob;
			 		 double prob_n = default_n_no_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"yes\""))
			 		{double prob_y = default_y_yes_prob;
			 		 double prob_n = default_n_yes_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
 				}
		 	 else if(i==5)
 				{double x = Double.parseDouble(lineParts[i]);
		 		 double prob_y = Gaussian.Gaussian_prob(x, m_balance_y, sd_balance_y);
		 		 double prob_n = Gaussian.Gaussian_prob(x, m_balance_n, sd_balance_n);
		 		 yes_prob_list.add(prob_y);
		 		 no_prob_list.add(prob_n);
 				}
		 	 else if(i==6)
 				{String x = lineParts[i];
				 if(x.equals("\"no\""))
			 		{double prob_y = housing_y_no_prob;
			 		 double prob_n = housing_n_no_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"yes\""))
			 		{double prob_y = housing_y_yes_prob;
			 		 double prob_n = housing_n_yes_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
 				}
		 	 else if(i==7)
 				{String x = lineParts[i];
				 if(x.equals("\"no\""))
			 		{double prob_y = loan_y_no_prob;
			 		 double prob_n = loan_n_no_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"yes\""))
			 		{double prob_y = loan_y_yes_prob;
			 		 double prob_n = loan_n_yes_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}	
 				}
		 	 else if(i==8)
 				{String x = lineParts[i];
				 if(x.equals("\"cellular\""))
			 		{double prob_y = contact_y_cellular_prob;
			 		 double prob_n = contact_n_cellular_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"telephone\""))
			 		{double prob_y = contact_y_telephone_prob;
			 		 double prob_n = contact_n_telephone_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"unknown\""))
			 		{double prob_y = contact_y_unknown_prob;
			 		 double prob_n = contact_n_unknown_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
 				}
		 	 else if(i==9)
 				{double x = Double.parseDouble(lineParts[i]);
		 		 double prob_y = Gaussian.Gaussian_prob(x, m_day_y, sd_day_y);
		 		 double prob_n = Gaussian.Gaussian_prob(x, m_day_n, sd_day_n);
		 		 yes_prob_list.add(prob_y);
		 		 no_prob_list.add(prob_n);
 				}
 			 /*else if(i==10)
 				{String x = lineParts[i];
				 if(x.equals("\"apr\""))
			 		{double prob_y = month_y_april_prob;
			 		 double prob_n = month_n_april_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"aug\""))
			 		{double prob_y = month_y_august_prob;
			 		 double prob_n = month_n_august_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"dec\""))
			 		{double prob_y = month_y_december_prob;
			 		 double prob_n = month_n_december_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"feb\""))
			 		{double prob_y = month_y_february_prob;
			 		 double prob_n = month_n_february_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"jan\""))
			 		{double prob_y = month_y_january_prob;
			 		 double prob_n = month_n_january_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"jul\""))
			 		{double prob_y = month_y_july_prob;
			 		 double prob_n = month_n_july_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"jun\""))
			 		{double prob_y = month_y_june_prob;
			 		 double prob_n = month_n_june_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"mar\""))
			 		{double prob_y = month_y_march_prob;
			 		 double prob_n = month_n_march_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"may\""))
			 		{double prob_y = month_y_may_prob;
			 		 double prob_n = month_n_may_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"nov\""))
			 		{double prob_y = month_y_november_prob;
			 		 double prob_n = month_n_november_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"oct\""))
			 		{double prob_y = month_y_october_prob;
			 		 double prob_n = month_n_october_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"sep\""))
			 		{double prob_y = month_y_september_prob;
			 		 double prob_n = month_n_september_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
 				}*/
 			 else if(i==11)
				{double x = Double.parseDouble(lineParts[i]);
		 		 double prob_y = Gaussian.Gaussian_prob(x, m_duration_y, sd_duration_y);
		 		 double prob_n = Gaussian.Gaussian_prob(x, m_duration_n, sd_duration_n);
		 		 yes_prob_list.add(prob_y);
		 		 no_prob_list.add(prob_n);
				}
 			 else if(i==12)
				{double x = Double.parseDouble(lineParts[i]);
		 		 double prob_y = Gaussian.Gaussian_prob(x, m_campaign_y, sd_campaign_y);
		 		 double prob_n = Gaussian.Gaussian_prob(x, m_campaign_n, sd_campaign_n);
		 		 yes_prob_list.add(prob_y);
		 		 no_prob_list.add(prob_n);
				}
 			 else if(i==13)
				{double x = Double.parseDouble(lineParts[i]);
		 		 double prob_y = Gaussian.Gaussian_prob(x, m_pdays_y, sd_pdays_y);
		 		 double prob_n = Gaussian.Gaussian_prob(x, m_pdays_n, sd_pdays_n);
		 		 yes_prob_list.add(prob_y);
		 		 no_prob_list.add(prob_n);	
				}
 			 else if(i==14)
				{double x = Double.parseDouble(lineParts[i]);
		 		 double prob_y = Gaussian.Gaussian_prob(x, m_previous_y, sd_previous_y);
		 		 double prob_n = Gaussian.Gaussian_prob(x, m_previous_n, sd_previous_n);
		 		 yes_prob_list.add(prob_y);
		 		 no_prob_list.add(prob_n);
				}
 			 else if(i==15)
				{String x = lineParts[i];
				 if(x.equals("\"failure\""))
			 		{double prob_y = poutcome_y_failure_prob;
			 		 double prob_n = poutcome_n_failure_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"other\""))
			 		{double prob_y = poutcome_y_other_prob;
			 		 double prob_n = poutcome_n_other_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"success\""))
			 		{double prob_y = poutcome_y_success_prob;
			 		 double prob_n = poutcome_n_success_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				 else if(x.equals("\"unknown\""))
			 		{double prob_y = poutcome_y_unknown_prob;
			 		 double prob_n = poutcome_n_unknown_prob;
			 		 yes_prob_list.add(prob_y);
			 		 no_prob_list.add(prob_n);
			 		}
				}
		 	}
		 
		 /*Product of log_probabilities for all classes*/
		 double prod_yes = 1.0;
		 double prod_no = 1.0;
		 for(double prob:yes_prob_list)
		 	{prod_yes *= Math.abs(Math.log(prob));}
		 for(double prob:no_prob_list)
		 	{prod_no *= Math.abs(Math.log(prob));}
		 prod_yes *= Math.abs(Math.log(target_y_prob));
		 prod_no *= Math.abs(Math.log(target_n_prob));
		 
		 /*Writing Data to cluster file*/
		 record.put("yes",new DoubleWritable(prod_yes));
		 record.put("no", new DoubleWritable(prod_no));
		 context.write(new Text(lineParts[16]), record);
		 yes_prob_list.clear();
		 no_prob_list.clear();
		 record.clear();
		}
	}