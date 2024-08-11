package IntroducaoClasses;

import lombok.Data;

@Data
public class Display {

    private int limite;
    private int valor;

    public Display(int limite){
        this.limite = limite;
        valor = 0;
    }

    public String Exibir(){
        String display = "";
        if (valor < 10){
            display = "0" + valor;
        }else{
            display = "" + valor;
        }

        return display;
    }
    public void Incrementar(){
        valor = (valor+1) % limite;
    }

}
