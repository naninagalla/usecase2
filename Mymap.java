package usecase2;

import java.io.IOException;
import java.util.*;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mymap extends Mapper<LongWritable, Text, IntWritable, IntWritable> {
  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {
	  
	  String line=value.toString();
	  
	  StringTokenizer tokens=new StringTokenizer(line);
	  while(tokens.hasMoreTokens()){
	context.write(new IntWritable(tokens.nextToken().length()), new IntWritable(1));
	  }
	  
  }
}

