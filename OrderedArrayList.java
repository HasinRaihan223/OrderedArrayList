public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  OrderedArrayList(){
    super();
  }

  OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T t){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be " + t);
    }
    if (size()==0){
      super.add(t);
      return true;
    }
    if (size()==1){
      if (t.compareTo(get(0))==-1){
        super.add(0, t);
      }
      else if (t.compareTo(get(size()-1))==1){
        super.add(size(), t);
      }
      return true;
    }
    if (t.compareTo(get(0))==-1){
      super.add(0, t);
      return true;
    }
    if (t.compareTo(get(size()-1))==1){
      super.add(size(), t);
      return true;
    }
    else {
      for (int i = 0; i < size()-1;i++){
         T lowerBound = super.get(i);
         T upperBound = super.get(i+1);
         if (t.compareTo(lowerBound) >= 0 && t.compareTo(upperBound) <= 0) {
            super.add(i+1, t);
            return true;
         }
       }
     }
     return true;
  }

  public void add(int index, T t){
    add(t);
  }

  public T set(int index, T t){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be null");
    }
    else{
      T x = super.get(index);
      super.remove(index);
      add(index, t);
      return x;
    }
  }

}
