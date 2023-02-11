public class BmiService {
    public int calculate(int weight,double height) {
        int index = (int) (weight / (height * height));
        return index;// индекс массы тела
    }
}