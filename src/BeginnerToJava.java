import java.util.*;
import java.util.List;

public class BeginnerToJava {
    public static void main(String[] args) {
        int return_counter =99999999;
        int [] A ={1,6,2,3,3,2,4,5,4,3,2,1,2,3,4,5,6,5,4,3,2,1,1,1,2,3,4,5,5,4,3,2,3,34,5,5,5,5,6,6,6,4,3,4,3,4,2,3,1};

        for( int i=1;i<7;i++)
        {
            int temp_return_counter=0;

            for (Integer val: A)
           {
               if(!val.equals(i))
               {

                if((val+i)==7)
                {
                 temp_return_counter +=2;
                }else
                {
                    temp_return_counter +=1;
                }

               }

           }if(temp_return_counter<return_counter)
        {
            return_counter=temp_return_counter;
        }

        }

        System.out.println(return_counter);





       /*
        ArrayList<Integer> arrayList = new ArrayList<Integer>();int [] list = {1,2,4,5,6,7,8,9};
        for(int i =0;i<list.length;i++){arrayList.add(list[i]); // System.out.println("" + i +".deneme "+ " : "+ var);}
        //System.out.println("max_value : " + max_value +"\n"+ "min_value : " + min_value);
        int smallest_value =1;for (Integer var :arrayList){if (var.equals(smallest_value)){smallest_value +=1;}}System.out.println(smallest_value);

*/
        }

    }
