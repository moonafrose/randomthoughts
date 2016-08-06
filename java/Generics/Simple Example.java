
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
     GenericExample<String> stringType = new GenericExample<>("Hi");
     stringType.printType();
     GenericExample<Integer> integerType = new GenericExample<>(1);
     integerType.printType();
    }

}
class GenericExample<T>
{
    private T object=null;
    public GenericExample(T parameter)
    {
        this.object=parameter;
    }
    protected void printType(){
    System.out.println("Type passed:"+object.getClass().getName());
}
}
