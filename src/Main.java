import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);
        System.out.println("Введите размер списка: ");
int n = sc.nextInt();

ForwardList list = new ForwardList();
for(int i = 0; i < n; i++){
    //list.push_back(rand.nextInt(100));
    list.push_front(rand.nextInt(100));
}
//list.push_back(123);
//list.print();
/*System.out.println("Введите значение добавляемого элемента: ");
int value = sc.nextInt();
        System.out.println("Введите индекс добавляемого элемента: ");
        int index = sc.nextInt();
        list.insert(value, index);
        list.print();
        System.out.println("Введите индекс удаляемого элемента: ");
        int del = sc.nextInt();
        list.remove(del);
        list.print();
        System.out.println("Для удаления списка введите любое число: ");
        int cl = sc.nextInt();
        list.clear(cl);
        list.print();
        System.out.println("Список пуст!");*/
        long start_time = System.nanoTime();
        ForwardList list2 = new ForwardList(list);
        long end_time = System.nanoTime();
        System.out.println("Список скопировался за %f секунд.".formatted((double)(end_time- start_time)*1e-9));
        list2.print();
        list.pop_back();
        list.print();
        list2.print();

        ForwardList d_list = new ForwardList();
        d_list.push_back(2.7);
        d_list.push_back(3.4);
        d_list.push_back(5.1);
        d_list.push_back(8.3);
        d_list.print();

        ForwardList s_list = new ForwardList();
        s_list.push_back("Хорошо");
        s_list.push_back("живет");
        s_list.push_back("на");
        s_list.push_back("свете");
        s_list.push_back("Винни");
        s_list.push_back("Пух");
        s_list.print();

        ForwardList s_list_2 = new ForwardList(s_list);
        s_list_2.push_back(3gi.14);
        s_list_2.push_back(true);
        s_list_2.print();


/*list.pop_front();
list.pop_back();*/
//list.print();

    }
}