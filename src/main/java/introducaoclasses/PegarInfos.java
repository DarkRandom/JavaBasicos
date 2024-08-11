package introducaoclasses;

import java.lang.reflect.Field;

public class PegarInfos {

    public static void mostrarInfo(Object pessoa){

        Class<?> classe = pessoa.getClass();
        Field[] campos = classe.getDeclaredFields();

        String nomeAt = "";
        Object valorAt = null;

        for (Field campo: campos){

            try {

                nomeAt = campo.getName();
                campo.setAccessible(true);
                valorAt = campo.get(pessoa);

            } catch (Exception e){


            }

            System.out.println(nomeAt + ": " + valorAt);
        }

    }

    public static String pegarinfo(Object obj){

        Class<?> classe = obj.getClass();
        Field[] campos = classe.getDeclaredFields();
        String infos = "";

        String campoNome;
        Object campoValor;

        for(Field campo: campos){

            try {

                campoNome = campo.getName();
                campoValor = campo.get(obj);

                infos += campoNome + ": " + campoValor + "\n";


            } catch (Exception e){

            }

        }

        return infos;
    }

    public static void comparar(Object objeto1,Object objeto2){

        Class<?> classe1 = objeto1.getClass();
        Class<?> classe2 = objeto2.getClass();

        Field[] campos = classe1.getDeclaredFields();
        Field[] campos2 = classe2.getDeclaredFields();

        String nomeAt = "";
        Object valorAt = null;

        int num = 0;

        for (Field campo: campos){

            try {

                System.out.println( ( ( campo.getName().equals(campos2[num].getName()) && campo.get(objeto1).equals(campos2[num].get(objeto2)) )? campo.getName() + " É Igual ": campo.getName() + " Não é igual! " ) );

            }catch (Exception e){

            }

            num++;

        }

    }

}
