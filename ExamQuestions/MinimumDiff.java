package ExamQuestions;
import java.util.*;
import java.io.*;
public class MinimumDiff {
	

	    
	    private static int[] input;
	    
	    private static void compute(int[] input){
	        
	        List<Integer> result = new ArrayList<Integer>();
	        Arrays.sort(input);
	        int mindist = Integer.MAX_VALUE;
	        Set<Integer> indexes = new HashSet<Integer>();
	        int currdist;
	        
	        for(int i = 0; i < input.length-1; i++){
	            currdist = input[i+1] - input[i];
	            if(currdist < mindist){
	                indexes = new HashSet<Integer>();
	                indexes.add(i);
	                mindist = currdist;
	            }
	            if(currdist == mindist){
	                indexes.add(i);
	            }
	        }
	        
	        Iterator<Integer> it = indexes.iterator();
	        int next;
	        while(it.hasNext()){
	            next = it.next();
	            result.add(input[next]);
	            result.add(input[next+1]);
	        }
	        
	        Collections.sort(result);
	        for(int k = 0; k < result.size(); k++){
	            System.out.print(result.get(k)+" ");
	            // if((k+1)%2==0){
	            //     System.out.println();
	            // }
	        }
	    }
	    
	    public static void main(String[] args) throws IOException{
	        
	        // int N;
	        // String[] temp;
	        // String line = "";
	        
	        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // line = br.readLine();
	        // N = Integer.parseInt(line);
	        // line = br.readLine();
	        // temp = line.split(" ");
	        // input = new int[N];
	        
	        // for(int i = 0; i < N; i++){
	        //     input[i] = Integer.parseInt(temp[i]);
	        // }
	        int[] input= {6,2,4,10};
	        compute(input);
	    }
	}

