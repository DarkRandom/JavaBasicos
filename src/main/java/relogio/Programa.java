package relogio;

public class Programa {

    public static void main(String[] args) {

        Relogio relogio = new Relogio(23,59,57);

        while(true){

            try {

                Thread.sleep(1000);
                relogio.atualizar();
                relogio.horaAtual();

            }catch (Exception e){

            }

        }

    }

}
