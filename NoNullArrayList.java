import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  NoNullArrayList(){
    super();
  }

  NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set(int index, T t){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be " + t);
    }
    else {
      return super.set(index, t);
    }
  }

  public boolean add(T t){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be " + t);
    }
    else {
      return super.add(t);
    }
  }

  public void add(int index, T t){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be " + t);
    }
    else {
      super.add(index, t);
    }
  }

}
