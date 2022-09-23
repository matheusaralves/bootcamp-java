package praticaIntegradora;

public class PraticaIntegradora01 {
    public static void main(String[] args) {
        String city[] = {
                "London",
                "Madrid",
                "New York",
                "Buenos Aires",
                "Asuncíon",
                "São Paulo",
                "Lima",
                "Santigo de Chile",
                "Lisboa",
                "Tokio"
        };

        int temperature[][] = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        int highTemp = 0, lowTemp = 0, highCity = 0, lowCity = 0;

        for (int i = 0; i < city.length; i++) {
            if (temperature[i][0] < lowTemp) {
                lowTemp = temperature[i][0];
                lowCity = i;
            }
            if (temperature[i][1] > highTemp) {
                highTemp = temperature[i][1];
                highCity = i;
            }
        }

        System.out.println("Hotest town is " + city[highCity]);
        System.out.println("Colest town is " + city[lowCity]);
    }
}
