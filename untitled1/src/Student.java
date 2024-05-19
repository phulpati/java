public class Student
{
    public static void main(String[] args)
    {
        String address = "Kathmandu,Nepal";
        if (address.endsWith("Nepal"))
        {
            if (address.contains("Bhaktapur"))
            {
                System.out.println("Yout city is bhaktapur");
            } else if (address.contains("Lalitpur"))
            {
                System.out.println("Your city is lalitpur");
            }else{
                System.out.println(address.split(",")[1]);
            }
        }
        else{
            System.out.println("You are not living in Nepal");
        }

    }
}
