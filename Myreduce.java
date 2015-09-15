package usecase2;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*;

public class Myreduce extends Reducer<IntWritable, IntWritable, IntWritable, IntWritable> {
 @Override
  public void reduce(IntWritable key, Iterable<IntWritable> value, Context context)
      throws IOException, InterruptedException {
	  
	  int count=0;
	  for(IntWritable data:value){
	count+=data.get();
	 
  }
	  context.write(key, new IntWritable(count));
}
}
