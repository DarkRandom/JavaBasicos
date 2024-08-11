package IntroducaoClasses;

public class RelogioPrograma {

    public static void main(String[] args) {

        Relogio relogio = new Relogio(18,59,55);

        while (true){
            relogio.atualizar();
            relogio.Exibir();
            try {
                Thread.sleep(1000);
            } catch(Exception e){
                System.err.println("Falha ao atulizar o relogio");
                System.exit(0);
            }
        }

    }

}
