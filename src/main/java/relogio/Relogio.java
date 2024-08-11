package relogio;

public class Relogio {

    Display horas;
    Display minutos;
    Display segundos;


    public Relogio(int hora,int minuto,int segundo){
        horas = new Display(hora,24);
        minutos = new Display(minuto, 60);
        segundos = new Display(segundo, 60);
    }

    public void atualizar(){
        segundos.incrementar();
        if (segundos.getValor() == 0){
            minutos.incrementar();
            if(minutos.getValor() == 0){
                horas.incrementar();
            }
        }
    }

    public void horaAtual(){

        System.out.println("Hora atual: " + horas.exibir() + ":" + minutos.exibir() + ":" + segundos.exibir() );

    }
}
