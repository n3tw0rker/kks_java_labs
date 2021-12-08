
// номер 13 в списке
class nodeList <E>
{
	E data;
	nodeList next;
	public nodeList(){}
	public nodeList(E data)
	{
		this.data = data;
		this.next = null;
	}
	public nodeList(E data, nodeList next)
	{
		this.data = data;
		this.next = next;
	}
	public E getData()
	{
		return data;
	}
	public void setData(E data)
	{
		this.data = data;
	}
	public nodeList getNext()
	{
		return next;
	}
	public void setNext(nodeList next){
		this.next = next;
	}
}
public class myList<E> 
{
	private nodeList fe;
	private nodeList le;
	int n = 0;
	public myList(){}
	public myList(myList copying) 
	{
		this.fe = copying.fe;
		this.le = copying.le;
		this.n = copying.n;
	}
	public void add(E element) 
	{
		if (fe != null) 
		{
			nodeList newnodeList = new nodeList(element);
			newnodeList.setNext(fe);
			fe = newnodeList;
			n++;
		}
		else 
		{
			nodeList newnodeList = new nodeList(element);
			fe = newnodeList;
			le = newnodeList;
			n++;
		}
	}
	public void removeAtData(E dataToRemove) throws Exception
	{
		nodeList tmp = fe;
		int exc = n;
		while(tmp.getNext() != null)
		{
			if(fe.data == dataToRemove)
			{
				fe = tmp.getNext();
				n--;
				break;
			}
			if(tmp.getNext().data == dataToRemove) 
			{
				tmp.setNext(tmp.getNext().getNext());
				n--;
				break;
			}
			tmp = tmp.next;
		}
		if(exc == n)
			throw new Exception("Data to remove not found");
	}

	public String toString()
	{
		String str = "";
		nodeList tmp = fe;
		while(tmp != null)
		{
			str += tmp.data + " ";
			tmp = tmp.next;
		}
		return str;
	}
}
