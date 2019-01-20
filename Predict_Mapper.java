package Naive_Bayes;
/*@Author - Arkadipta De*/

import java.io.IOException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class Predict_Mapper extends Mapper<LongWritable,Text,Text,Text>
	{protected void map(LongWritable key, Text value,Context context) throws IOException, InterruptedException 
		{String lines = value.toString().trim();
		 String lineParts[] = lines.split("\t");
		 Text target = new Text(lineParts[0]);
	 	 String valueParts[] = lineParts[1].split(",");
	 	 String yes_prob[] = valueParts[0].split("\\{yes=");
	 	 String no_prob[] = valueParts[1].split("no=");
	 	 String no_probs[] = no_prob[1].split("\\}");
	 	 
	 	 double y_prob = Double.parseDouble(yes_prob[1]);
	 	 double n_prob = Double.parseDouble(no_probs[0]);
	 	 
	 	 if(y_prob >= n_prob)
	 	 	{Text prediction = new Text("\"yes\"");
	 	 	 context.write(target, prediction);
	 	 	}
	 	 else if(y_prob < n_prob)
	 	 	{Text prediction = new Text("\"no\"");
	 	 	 context.write(target, prediction);
	 	 	}
		}
	}