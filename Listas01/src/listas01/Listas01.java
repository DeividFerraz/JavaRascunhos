/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Pichau
 */
public class Listas01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Lista diferente de vetores, iniciam Vazias e seus elementos sao colocador sobre demanda
        tipo de lista Interface, nao da pra chamar direto com "list", precisa ser ArrayLista, LinkedList ETC
        */
        List<String> lista = new ArrayList<>(); //Lista de integer mas poderia ser String Tambem
                               //Como a classe List nao funciona sozinha, importamos o ArrayLista pra poder ela funcionar
         
        //add obj a lista
        lista.add("Maria");
        lista.add("Devid");
        lista.add("Ana");
        lista.add("Yzabella");
        //add obj a lista na posicao que eu desejo
        lista.add(2, "Marco");
        
        //ver o tamanho da lista
        System.out.println(lista.size());
        
        //remover obj da lista
        lista.remove("Maria");
        
        //remover todos os obj que começa com alguma letra
        lista.removeIf(x -> x.charAt(0) == 'M');//Aqui foi usado a funçao lambda 
        //Aqui eu estou dizendo. Pega o elemento X e ve se esse elemento X.charAt 0  é igual a M. essa resposta da verdadeiro ou falso     
        
        
        //Como encontrar a posiçao de um elemento
        System.out.println("Posiçao do Ana: " + lista.indexOf("Ana"));
        
        
        //Só deixar na lista só quem começa o nome com determinado letra
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        //Filtrando a outra Lista para me trazer apenas os nomes com A, o metodo stream nao é Compativel com lista, ai eu uso o filter para ele 
        //me devolver os nomes com letra A, que tambem é funçao do lambida, ai eu preciso converter ele denovo para lista, ai eu uso a funçao
        //  .collect(Collectors.toLista());
        for(String obj : lista){
            System.out.println(obj);
        }
        System.out.println("--------------------");
        for(String obj : resultado){
            System.out.println(obj);
        }
        System.out.println("--------------------");
        String nome = lista.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
        //esse findFirst vai pegar o primeiro elemento que inicia com a letra A, se ele nao existir ele vai me retornar nulo
        System.out.println(nome);
    }
    
}
