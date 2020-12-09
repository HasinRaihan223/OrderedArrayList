import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  NoNullArrayList(){
    super();
  }

  NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }


}
