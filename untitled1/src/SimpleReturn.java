public class SimpleReturn {

        public int CompareNum()
        {
            int x = 3;
            int y = 8;
            System.out.println("x = " + x + "\ny = " + y);
            if(x>y)
                return x;
            else
                return y;
        }

        public static void main(String ar[])
        {
            SimpleReturn obj = new SimpleReturn();
            int result = obj.CompareNum();
            System.out.println("The greater number among x andy is: " + result);
        }
    }

