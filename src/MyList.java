

public class MyList <E> implements List <E> {
    private Node <E> head, tail;
    private E data;
    private int size;

    public MyList(Node<E> next, Node<E> previous, E data) {
        this.head = next;
        this.tail = previous;
        this.data = data;
        this.size = 0;
    }
    public MyList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() { // Возвращает размер списка
        return size;
    }

    @Override //Возвращает true, если этот список пустой и false если в списке есть хотя бы один элемент.
    public Boolean isEmpty() {
        return size() == 0;
    }



    @Override // Добавление элемента в конец списка
    public void add(E data) {
        {
            Node<E> temp = new Node<E>(data);

            if (head == null) {
                head = temp;
                tail = head;

            } else {
                temp.setPrevious(tail);
                tail.setNext(temp);
                tail = temp;
            }
            size++;
        }
    }
        @Override // очистка списка
            public void clear() {
            this.size = 0;
            this.head = null;
            this.tail = null;
        }
        @Override
        public void removeIndex(int index) {
            if (index == 0) {
                head = head.getNext();
                return;
            }
            if (index > size) {
                System.out.println("Превышен размер списка");
                return;
            } else {
                Node<E> temp = head;
                for (int i = 0; i < index - 1; i++)
                    temp = temp.getNext();
                temp.setNext(temp.getNext().getNext());
                temp.setPrevious(temp.getPrevious().getPrevious());
            }
            size--;
    }

        @Override
        public void remove (E delElement)  { // удаление элемента списка
            if (size == 0) return;

            Node current = head;

            while (current.getE() != delElement) {
                current = current.getNext();
                if (current == null) {
                    return;
                }
            }

            if (current == head) {
                head = current.getNext();
            } else {
                current.getPrevious().setNext(current.getNext());
            }

            if (current == tail) {
                tail = current.getPrevious();
            } else {
                current.getNext().setPrevious(current.getPrevious());
            }
            size--;
    }
    @Override
    public void addAll (MyList list) { // добавление списка к существующему
       for (Node<E> temp = list.head; temp != null; temp = temp.getNext()) {
           this.add(temp.getE());
       }
    }
    @Override
    public E get(int index){ // возвращает по индексу элемент
            Node<E> node = null;
            if (!isEmpty() && (index >= 0 && index < size)) {
                node = head;
                for(int i = 1; i<=index; i++){
                    node = node.getNext();
                }
            }
            return node.getE();
    }
    @Override
    public Boolean contains(E element) { // проверяет наличие элемента в списке
        for (int i = 0; i < size(); i++) {
            if (get(i).equals(element)) return true;
        }
        return false;
    }

    public void print() { // печатает список
        System.out.println("MyList (размером " + size() + ") : ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (head.getNext() == null) {
            System.out.println(head.getE());
            return;
        }
        Node temp = head;
        System.out.print(temp.getE() + " <-> ");
        temp = head.getNext();
        while (temp.getNext() != null) {
            System.out.print(temp.getE() + " <-> ");
            temp = temp.getNext();
        }
        System.out.print(temp.getE() + "\n");
        }
        @Override
        public int indexOf(E e) { //возвращает индекс переданного аргумента
            for (int i = 0; i < size(); i++) {
                if (get(i).equals(e)) return i;
            }
            return -1;
        }
}

