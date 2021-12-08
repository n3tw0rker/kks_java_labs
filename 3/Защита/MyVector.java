import java.util.Arrays;

public class MyVector<E> {
    E[] array;
    int size = 0;
    int max;

    //Конструктор
    public MyVector(int maximum) {
        array = (E[]) new Object[maximum];
        max = maximum;
    }

    public void add(E el){
        if(this.size == this.max)
            changeMax();
        this.array[this.size] = el;
        this.size++;
    }
    public void changeMax(){
        E[] changedArray = (E[]) new Object[this.max + 10];
        for(int i = 0; i < this.max; i++){
            changedArray[i] = this.array[i];
        }
        this.array = changedArray;
        this.max = changedArray.length;
    }

    public void removeAll (E el) {
        for(int i = 0; i < this.array.length; i++) {
            if(this.array[i] == el) {
                for(int j = i; j < this.array.length - 1; j++){
                    this.array[j] = this.array[j + 1];
                }
                i--;
                this.size --;
            }
        }
    }

   /* @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                return '[' + res + ']';
            res += array[i] + ", ";
        }
        return res;
    }

    */
   //Попытка вывести массив без null-a, есть ли в этом необходимость...
   @Override
   public String toString() {
       return Arrays.toString(array);
   }
}
