package Naive_Bayes;
/*@Author - Arkadipta De*/

import java.io.IOException;
import java.util.HashMap;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class Probability_Compute_Driver 
	{public static void main(String args[]) throws IOException, ClassNotFoundException, InterruptedException
		{Configuration conf = new Configuration();
		 Job job = Job.getInstance(conf, "Probability_Computaion");
		 job.setJarByClass(Probability_Compute_Driver.class);
		 job.setMapperClass(Probability_Compute_Mapper.class);
		 job.setNumReduceTasks(0);
		 job.setOutputKeyClass(Text.class);
		 job.setOutputValueClass(HashMap.class);
		 FileInputFormat.addInputPath(job,new Path("bankdata"));
		 FileOutputFormat.setOutputPath(job,new Path("bankdata_Prediction"));
		 job.waitForCompletion(true);
		}
	}
