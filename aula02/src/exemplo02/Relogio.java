package exemplo02;

public class Relogio {
    //atributos
    private int hora, minuto, segundo;

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
            System.out.println("Entrada inválida.");
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
        System.out.println("Hora atual: " + hora + ":" +
                minuto + ":" + segundo);
    }

}
