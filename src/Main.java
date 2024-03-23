import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       MyList<Character> list = new MyList<>();
       MyList<Character> list3 = new MyList<>();
       MyList<Integer> list2 = new MyList<>();
        Random random = new Random();
        // Заполнение списков случайным образом
        for (int i = 0; i < random.nextInt(1,27); i++) {
            list.add((char)(97 + i));
            list3.add((char)(71 + i));
            list2.add(i+ random.nextInt(0,100));
        }
        // Вызов методов для проверки
//            list.print();
//            list3.print();
//            list2.print();
//            System.out.println(list.indexOf('b'));
//            System.out.println(list.get(3));
//            System.out.println(list.contains('d'));
//            list.addAll(list3);
//            list.print();
//            list.remove('d');
//            list.removeIndex(5);
//            list.print();
//            list.clear();
//            list.print();
                    ///////////////Задание//////////////////
//        1)	 Создать свой интерфейс List. В его основу его имплементации положить
//        параметризованный объект Node, который будет принимать параметром объект любого класса.
//        Реализовать одну имплементацию (можно без итератора)
//        Методы, которые нужно реализовать:
//        - int size()
//                - Boolean isEmpty()
//                - Boolean contains(E e)
//                - void add(E e)
//        - void remove(E e)
//        - void remove(int id)
//        - void addAll(List list)
//        - void clear()
//                - E get(int index)
//        - int indexOf(E e)

    }
}