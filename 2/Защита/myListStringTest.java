public class myListStringTest 
{
	public static void main(String[] args)
	{
		myList<String> testList = new myList();
		testList.add("приветствую");
		testList.add("здравствуйте");
		testList.add("добрый день");
		testList.add("добрый вечер");
		System.out.println(testList);
		try 
		{            
			testList.removeAtData("приветствую"); 
			testList.removeAtData("защита лаб работы "); 
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println(testList);
	}
}
