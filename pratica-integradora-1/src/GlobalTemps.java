public class GlobalTemps {
    public static void main(String[] args) {
        String[] cities = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temps = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int minTemp = 0;
        int maxTemp = 0;

        for (int i = 0; i < temps.length -1; i++){
            if (temps[minTemp][0] > temps[i+1][0]){
                minTemp = i + 1;
            }
            if (temps[maxTemp][1] < temps[i+1][1]){
                maxTemp = i + 1;
            }
        }
        System.out.println("A temperatura mais baixa é " + temps[minTemp][0] + " em " + cities[minTemp]);
        System.out.println("A temperatura mais alta é " + temps[maxTemp][1] + " em " + cities[maxTemp]);
    }
}
