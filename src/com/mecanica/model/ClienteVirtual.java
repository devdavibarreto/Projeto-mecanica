package com.mecanica.model;

import com.mecanica.atendimento.callcenter.AtendenteCall;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class ClienteVirtual {
    public void atendimentoVirtual(){
        Scanner scaneer = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("     " +
                "   DEUS É FIEL   " +
                "    ");
        System.out.println("Seja bem vindo a BARRETO´S CAR AQUI CUIDADOS DO SEU CARRO DE FORMA ÚNICA");
        System.out.println("Para começar poderia nós informar seus Nome ?  ");
        String nome = scaneer.next();
        System.out.println(" Qual seria o modelo do carro do senhor(a)");
        String modeloCarro = scaneer.next();
        System.out.println("Ok vamos te ajudar Sr(a) "+ nome + ", qual o problema com a nave ? " + modeloCarro + "  OPÇÕES : 1 FALTA DE FREIO " +
                " 2 MANUNTENCAO PREVENTIVA " +
                " 3 TROCA DE ÓLEO E FITRO " +
                " 4 NÃO SEI, PRECISO DE UM GUINCHO " +
                " 5 LIGAR PARA O ATENDIMENTO ");
        String opcao = scaneer.next();
        Cliente cliente = new Cliente();
        switch (opcao){
            case "1":{
                System.out.println("Ok podemos agendar sua manuntencao preventiva. ");
                break;
            }
            case "2":{
                System.out.println("Ok podemos agendar sua manuntencao preventiva. ");
                break;
            }
            case "3":{
                System.out.println("Ok podemos podemos agendar sua troca de óleo? OPCAO 1 : SIM " +
                        " OPCAO 2 : NÃO ");
                String resposta = scaneer.next();
                if (Objects.equals(resposta, "1")){
                    System.out.println("Vamos Transferir para um de nossos atendentes");
                    cliente.ligacao();
                }else {
                    System.out.println("Ok podemos te ajudar outro dia, Fique com Deus e ate a proxima!");
                }
                break;
            }
            case "4":{
                System.out.println("Eita ,O caso é serio em ! Vamos esta transferindo para um atendente"
                );
                cliente.ligacao();
                break;
            }

            case "5":{
                cliente.ligacao();
                break;
            }

        }
    }

}
