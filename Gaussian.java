package Naive_Bayes;
/*@Author - Arkadipta De*/

import java.lang.Math;

public class Gaussian 
	{public static double Gaussian_prob(double x,double mean,double sd)
		/*Method to return gaussian probability of a random variable x
		  given it's mean and standard_deviation*/
		{double prior = 1/(sd*Math.sqrt(2*Math.PI));
		 double exponent = (-1/2)*Math.pow((x - mean)/sd, 2);
		 double probability = prior*Math.exp(exponent);
		 return probability;
		}
	}
