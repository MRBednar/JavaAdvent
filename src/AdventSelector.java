import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AdventSelector {

	public static void main(String[] args) throws IOException {
		int day;
		Map<Integer, IDay> map = new HashMap<Integer, IDay>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
		    put(1, new Day1());
		    put(2, new Day2());
		}};
		for (String arg : args)
		{
			day = Integer.parseInt(arg);
			IDay runDay = map.get(day);
			runDay.Run();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
		}

	}
	
	

}
