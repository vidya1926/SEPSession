package steps;

import java.util.List;
import java.util.Map;

public interface IDataReader {

	public List<Map<String,String>> getAllrows();
	
	public Map<String,String> singleRow();
	
	
	
}
