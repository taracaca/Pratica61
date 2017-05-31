
import java.util.HashMap;
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ayrton
 */
public class Pratica61 {

    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time();
        HashMap<String, Jogador> team1 = new HashMap<>();
        HashMap<String, Jogador> team2 = new HashMap<>();

      
        time1.addJogador("Goleiro", new Jogador(1, "Fulano"));
        time1.addJogador("Lateral", new Jogador(4, "Ciclano"));
        time1.addJogador("Atacante", new Jogador(10, "Beltrano"));

        time2.addJogador("Goleiro", new Jogador(1, "João"));
        time2.addJogador("Lateral", new Jogador(7, "José"));
        time2.addJogador("Atacante", new Jogador(15, "Mario"));

        team1 = time1.getJogadores();
        team2 = time2.getJogadores();

        Set<String> chaves1 = team1.keySet();
        Set<String> chaves2 = team2.keySet();

        System.out.println("Posição   Time 1   Time 2");

        for (String chave : chaves1) {
            //if (chaves1.equals(chaves2)) {
                System.out.println(chave + "   " + team1.get(chave) + "  " + team2.get(chave));
            //}
        }
    }
}
