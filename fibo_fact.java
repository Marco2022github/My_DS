package Array_DS;

public class fibo_fact {

    public void fibo( int a[]){

        System.out.println("test");

        for(int i = 0; i <= a.length; i++){


            a[i] = a[i+1] + a[i-1];

            System.out.println(a[i]);

        }


    }

    public int facto(int a[], int fact){

        fact = 1;

         if( fact == 0){

             System.out.println(" The factorial number is equal to zero");

         }
         else {

             for(int i = 1; i >= fact ; i++){

                 fact = fact * i;
             }
         }

        return fact;


    }

    public static void main(String args[]){

        fibo_fact a = new fibo_fact();

        int arry[] = {34,23,45,1,34,2,1};

        //System.out.println("test");

        //int size = 4;

       for (int i = 0; i >= arry.length; i++)

            {
                a.fibo(arry);

            }

    }
}


