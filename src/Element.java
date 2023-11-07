public class Element <T> { //T - Generic typ
    T Data;
    Element<T> Next;

    public T getData() {
        return Data;
    }

    public Element <T> getNext() {
        return Next;
    }

    public void setData(T data) {
        Data = data;
    }

    public void setNext(Element <T> next) {
        Next = next;
    }

    public Element(T Data){
        setData(Data);
        setNext(null);
        //System.out.println("EConstructor: \t" + Integer.toHexString(this.hashCode()));
    }
    public Element(T Data, Element<T> Next){
        setData(Data);
        setNext(Next);
        //System.out.println("EConstructor: \t" + Integer.toHexString(this.hashCode()));
    }
}
