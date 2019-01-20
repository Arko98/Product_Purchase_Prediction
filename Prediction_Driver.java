package Naive_Bayes;
/*@Author - Arkadipta De*/

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class Prediction_Driver 
	{public static void main(String args[]) throws IOException, ClassNotFoundException, InterruptedException
	 	{Configuration conf = new Configuration();
	 	 Job job = Job.getInstance(conf, "Accuracy_Computaion");
	 	 job.setJarByClass(Prediction_Driver.class);
	 	 job.setMapperClass(Predict_Mapper.class);
	 	 /*job.setReducerClass(Accuracy_Reducer.class);*/
	 	 job.setNumReduceTasks(0);
	 	 job.setMapOutputKeyClass(Text.class);
	 	 job.setMapOutputValueClass(Text.class);
	 	 job.setOutputKeyClass(Text.class);
	 	 job.setOutputValueClass(DoubleWritable.class);
	 	 FileInputFormat.addInputPath(job,new Path("bankdata_Prediction"));
	 	 FileOutputFormat.setOutputPath(job,new Path("bankdata_accuracy"));
		 job.waitForCompletion(true);
		}
	}
