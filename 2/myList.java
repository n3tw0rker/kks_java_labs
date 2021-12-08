class nodeList <E>{                   
    E value;                    
    nodeList next;                  

    public nodeList(){}            

    public nodeList(E value){      
        this.value = value;    
        this.next = null;      
    }

    public nodeList(E value, nodeList next){  
        this.value = value;           
        this.next = next;             
    }

    public E getValue(){                
        return value;
    }

    public void setValue(E value){      
        this.value = value;

    }

    public nodeList getNext(){      
        return next;
    }

    public void setNext(nodeList next){ 
        this.next = next;
    }
}
public class myList<E> {   
    private nodeList fe;              
    private nodeList le;              
    int length = 0;       

    public myList() {    

    }


    public myList(myList copying) {
        this.fe = copying.fe;
        this.le = copying.le;
        this.length = copying.length;
    }

    public void add(E element) {
        if (fe != null) {
            nodeList  newnodeList = new nodeList(element);
             newnodeList.setNext(fe);
            fe =  newnodeList;
            length++;
        } else {
            nodeList  newnodeList = new nodeList(element);
            fe =  newnodeList;
            le =  newnodeList;
            length++;
        }
    }
    public void removeAtValue(E valueToRemove) throws Exception{
        nodeList tmp = fe;
        int exc = length;
        while(tmp.getNext() != null){
            if(fe.value == valueToRemove){
                fe = tmp.getNext();
                length--;
                break;
            }
            if(tmp.getNext().value == valueToRemove) {
                tmp.setNext(tmp.getNext().getNext());
                length--;
                break;
            }
            tmp = tmp.next;
        }
        if(exc == length)
            throw new Exception("Значение для удаление не найдено");
    }
    
    public String toString(){
        String str = "";
        Node tmp = fe;
        while(tmp != null){
            str += tmp.value + " ";
            tmp = tmp.next;
        }
        return str;
    }
}
