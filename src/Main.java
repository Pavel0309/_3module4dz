public class Main {
    CustomTreeMap<E,Object> map = new CustomTreeMap<>();
    private final static Object PRESENT=new Object();

    public boolean add(E e){
        return map.put(e, PRESENT) == null;
    }

    public boolean remove(E e){
        return map.remove(e) == PRESENT;
    }

    public boolean contains(Object o){return !(map.findNode(o) == null);}
    public int size(){return map.size();}

}