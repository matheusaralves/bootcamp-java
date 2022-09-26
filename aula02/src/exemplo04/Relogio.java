package exemplo04;

public class Relogio {
    // valor padrão (constante):
    private final int HORA_PADRAO = 12;

    // atributos:
    private int hora, minuto, segundo;

    // atributo da classe:
    private static String marca;

    // construtor
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // métodos
    // [retorno] nome ([parametros]) {}

    // altera hora
    public void setHora(int novaHora) {
        if (novaHora >= 0 && novaHora < 24) {
            hora = novaHora;
        } else {
            this.hora = HORA_PADRAO;
        }
    }

    // altera minuto
    public void setMinuto(int novoMinuto) {
        if (novoMinuto >= 0 && novoMinuto < 60) {
            minuto = novoMinuto;
        } else {
            System.out.println("Entrada inválida.");
        }

    }

    // altera segundo
    public void setSegundo(int novoSegundo) {
        if (novoSegundo >= 0 && novoSegundo < 60) {
            segundo = novoSegundo;
        } else {
            System.out.println("Entrada inválida.");
        }

    }

    // pega hora
    public int getHora() {
        return hora;
    }

    // pega minuto
    public int getMinuto() {
        return minuto;
    }

    // pega segundo
    // pega minuto
    public int getSegundo() {
        return segundo;
    }



    public void exibir() {
        System.out.println(Relogio.marca + " Hora atual: " + hora + ":" +
                minuto + ":" + segundo);
    }

    // Mais indicado:
    public String show() {
        return (Relogio.marca + " Hora atual: " + hora + ":" +
                minuto + ":" + segundo);
    }


    public static String horaAtual() {
        return "0:0:0";
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Relogio.marca = marca;
    }

}
