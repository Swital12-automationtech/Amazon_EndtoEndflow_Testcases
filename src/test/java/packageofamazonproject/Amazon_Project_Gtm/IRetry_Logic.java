package packageofamazonproject.Amazon_Project_Gtm;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry_Logic implements IRetryAnalyzer
{
		int intialcount = 0;
		int retrycount = 2;
		@Override
		public boolean retry(ITestResult result) 
		{
			if(intialcount<retrycount)
			{
				intialcount++;
				return true;
			}
			return false;
		}
}
