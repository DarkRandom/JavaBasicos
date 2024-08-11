package IntroducaoClasses;

public class Relogio {

    private Display horas;
    private Display minutos;
    private Display segundos;

    public Relogio(){
        horas = new Display(24);
        minutos = new Display(60);
        segundos = new Display(60);
    }

    public Relogio(int hora, int minuto, int segundo){
        horas = new Display(24);
        minutos = new Display(60);
        segundos = new Display(60);

        horas.setValor(hora);
        minutos.setValor(minuto);
        segundos.setValor(segundo);
    }

    public void atualizar(){
        segundos.Incrementar();
        if (segundos.getValor() == 0){
            minutos.Incrementar();
            if (minutos.getValor() == 0){
                horas.Incrementar();
            }
        }
    }

    public void Exibir(){
        System.out.println( "Horario Atual: " + horas.Exibir() + ":" + minutos.Exibir() + ":" + segundos.Exibir() );
    }

}
