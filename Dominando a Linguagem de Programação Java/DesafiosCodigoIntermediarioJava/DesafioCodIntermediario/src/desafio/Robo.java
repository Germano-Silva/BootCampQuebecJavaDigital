// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;

public class Robo{
    public static void main(String[] args){
        String movimentos = new Scanner(System.in).nextLine();
        var x = 0;
        var y = 0;
        // TODO: Implemente os movimentos do Robô e verifique sua posição:
        for (int i = 0; i < movimentos.length(); i++){
            char ch = movimentos.charAt(i);
            if (ch == 'W'){
                x++;
            }if (ch ==    ){
                x--;
            } if (ch ==    ){
                y++;
            }if (ch ==    ){
                y--;
            }
        }
        if (x == 0 && y == 0){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}