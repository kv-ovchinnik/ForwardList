import java.util.Iterator;

public class ForwardList <T> {
    Element <T> Head;
    int size;
    public ForwardList(){
        this.Head = null;
        size = 0;
        System.out.println("LConstructor: \t" + Integer.toHexString(this.hashCode()));
    }
    ForwardList(ForwardList<T> other){
        for (Element<T> Temp = other.Head; Temp != null; Temp = Temp.getNext())
            this.push_front(Temp.getData());
        revers();

    }
    public void revers(){
        ForwardList<T> revers = new ForwardList<T>();
        while (Head != null){
            revers.push_front(Head.Data);
            pop_front();
        }
        this.Head = revers.Head;
        revers.Head = null;
    }
    public void push_front(T Data){
       /* Element New = new Element(Data);
        New.setNext(Head);
        Head = New;*/
        Head = new Element(Data, Head);
        size++;
    }
    public void  push_back(T Data){
        if(Head == null){
            push_front(Data);
            return;

        }
        Element<T> Temp = Head;
        while (Temp.getNext() != null)
            Temp = Temp.getNext();
        Temp.setNext(new Element(Data));
        size++;
    }
    void insert (T Data, int Index){
        if(Index == 0){
            push_front(Data);
            return;
        }
        if(Index > size )
            return;
        Element<T> Temp = Head;
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
        Element<T> Temp = Head;
        while (Temp.getNext().getNext() !=null)
            Temp = Temp.getNext();
        Temp.setNext(null);
        size--;
    }
    public void remove (int Index){
        Element<T> Temp = Head;
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


    public void clear(int cl){
        Head = null;
    }
    public void print(){
        Element <T>Temp = Head;
        while (Temp != null)
        {
            System.out.print(Temp.getData() + "\t");
            Temp = Temp.getNext();
        }

        System.out.println();
    }
}
