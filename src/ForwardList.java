import java.util.Iterator;

public class ForwardList {
    Element Head;
    int size;
    public ForwardList(){
        this.Head = null;
        size = 0;
        System.out.println("LConstructor: \t" + Integer.toHexString(this.hashCode()));
    }
    public void push_front(int Data){
       /* Element New = new Element(Data);
        New.setNext(Head);
        Head = New;*/
        Head = new Element(Data, Head);
        size++;
    }
    public void  push_back(int Data){
        if(Head == null){
            push_front(Data);
            return;

        }
        Element Temp = Head;
        while (Temp.getNext() != null)
            Temp = Temp.getNext();
        Temp.setNext(new Element(Data));
        size++;
    }
    void insert (int Data, int Index){
        if(Index == 0){
            push_front(Data);
            return;
        }
        if(Index > size )
            return;
        Element Temp = Head;
        for(int i = 0; i < Index - 1; i++)
            Temp = Temp.getNext();
        /*Element New = new Element(Data);
        New.setNext(Temp.getNext());
        Temp.setNext(New);
*/
       Temp.setNext(new Element(Data, Temp.getNext()));
    }
    public void pop_front(){
        Head = Head.getNext();
        size--;
    }
    public void pop_back(){
        Element Temp = Head;
        while (Temp.getNext().getNext() !=null)
            Temp = Temp.getNext();
        Temp.setNext(null);
        size--;
    }
    public void remove (int Index){
        Element Temp = Head;
        if (Index <= 0 || Index >= size) {
            Head = Temp.getNext();
            return;
        }

        for (int i = 0; i < Index - 1; i++) {
            Temp = Temp.getNext();
        }
        Temp.setNext(Temp.getNext().getNext());
        size --;
    }
    public void revers (ForwardList){
        
    }

    public void clear(int cl){
        Head = null;
    }
    public void print(){
        Element Temp = Head;
        while (Temp != null)
        {
            System.out.println(Temp.getData() + "\t");
            Temp = Temp.getNext();
        }

        System.out.println();
    }
}
