package relogio;

import lombok.Data;

@Data
public class Display {

    int valor;
    int limite;

    public Display(int valor, int limite){

        this.valor = valor;
        this.limite = limite;

    }

    public void incrementar(){

        valor = (valor + 1) % limite;

    }

    public String exibir(){

        String display;

        if (valor < 10){
            display = "0" + valor;

        }else{

            display = "" + valor;

        }

        return display;
    }


}
