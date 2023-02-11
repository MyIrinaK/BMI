public class Main{
    public static void main(String[] args){System.out.println("Ваш индекс массы тела равен");
            BmiService service=new BmiService();
            int weight= 98;// вес тела (кг)
            double height=1.87;// рост (м)
            int index=service.calculate(weight,height);
            System.out.println(index);

            }
}