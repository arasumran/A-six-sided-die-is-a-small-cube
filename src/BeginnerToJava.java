import java.util.*;
import java.util.List;

public class BeginnerToJava {
    public static void main(String[] args) {

        // author arasumran
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





        }

    }
