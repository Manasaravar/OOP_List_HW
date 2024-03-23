public interface List <T> {

        public int size();
        public Boolean isEmpty();
        public Boolean contains(T e);
        public void add(T e);
        public void remove(T e);
        public void removeIndex(int id);
        public void addAll(MyList list);
        public void clear();
        public T get(int index);
        public int indexOf(T e);
        public void print();


}
