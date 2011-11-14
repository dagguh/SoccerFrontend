/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Point;

/**
 *
 * @author Mateusz
 */
public class Servlet {
    public Servlet(){}
    
    /**
     * Informacja czy jest ruch gracza o podanej nazwie
     * @param nazwa oznacza nick gracza, którego ruch jest sprawdzany
     * @return zwraca true - juśli gracz ma ruch, false jeśli go nie ma
     */
    public boolean czyMojRuch(String nazwa)
    {
        if((nazwa.equals(gracz1) && numerGracza==1) || (nazwa.equals(gracz2) && numerGracza==2))
            return true;
        return false;
    }
    /**
     * Funkcja pozwalająca na wypisanie boiska
     * Stosowana w celach testowych
     */
    public void wypiszBoisko()
    {
        if(startGry==true)
        {
            System.out.println("xt: " + pozycjaPilki.x + " yt: " + pozycjaPilki.y);
            for(int i=0;i<11;i++)
            {
                for(int j=0;j<9;j++)
                {
                    System.out.printf("%4d",boisko[i][j]);
                }
                System.out.println("");
            }
        }
    }
    /**
     * Zwraca informacje na temat poprawności danego ruchu 
     * @param kierunek określa w jakim kierunku porusza się piłka
     * @return  true - poprawny i legalny ruch, false w przeciwnym wypadku
     */
    public int czyWolnePole(int kierunek,String nick)
    {
        if(startGry==true && czyMojRuch(nick) &&  (boisko[pozycjaPilki.y][pozycjaPilki.x] & kierunek) == 0 && kierunek!=0)   
        {
            boisko[pozycjaPilki.y][pozycjaPilki.x] = (boisko[pozycjaPilki.y][pozycjaPilki.x] | kierunek); // pole zajęte
            obliczPrzesuniecie(kierunek);
            pozycjaPilki.x += przesuniecie.x;
            pozycjaPilki.y += przesuniecie.y;
            if(pozycjaPilki.y == -1)
            {
                return 2;//wygrana gracza 2
            }
            else if(pozycjaPilki.y== 11)
            {
                return 3;//wygrana gracza 1
            }
            //zajete pole = blokada i koniec gry
            if(boisko[pozycjaPilki.y][pozycjaPilki.x] == 255)
            {
                if(numerGracza==1)
                    return 2;//wygrana gracza 2
                else
                    return 1;//wygrana gracza 1
            }
            //puste pole - oznacza zmianę gracza
            if(boisko[pozycjaPilki.y][pozycjaPilki.x]==0)
            {
                if(numerGracza==1) numerGracza = 2;
                else numerGracza =1;
            }
            if(kierunek < 16) kierunek = (kierunek << 4);
            else kierunek = (kierunek >> 4);
            boisko[pozycjaPilki.y][pozycjaPilki.x] = (boisko[pozycjaPilki.y][pozycjaPilki.x] | kierunek); // pole zajęte
            
            return 1;//normalny, poprawny ruch
        }
        return 0;
    }
    /**
     * Prywatna metoda do obliczania przesuniecia na boisku
     * @param kierunek kierunek w ktorym nastapiło przesunięcie
     */
    private void obliczPrzesuniecie(int kierunek)
    {
        //Point przesuniecie = new Point();
        przesuniecie.setLocation(0,0);
        if(kierunek == 1)
            przesuniecie.setLocation(0, -1);
        else if(kierunek == 2)
            przesuniecie.setLocation(1, -1);
        else if(kierunek == 4)
            przesuniecie.setLocation(1, 0);
        else if(kierunek == 8)
            przesuniecie.setLocation(1, 1);
        else if(kierunek == 16)
            przesuniecie.setLocation(0, 1);
        else if(kierunek == 32)
            przesuniecie.setLocation(-1, 1);
        else if(kierunek == 64)
            przesuniecie.setLocation(-1, 0);
        else if(kierunek == 128)
            przesuniecie.setLocation(-1, -1);
    }
    /**
     * Funkcja ta jest wywoływana przy tworzeniu nowej gry.
     * Tworzone jest nowe boisko do gry, które jednoznacznie
     * definiuje pola, które gracz może osiągnąć (ogranicza
     * możliwość wyjścia poza boisko)
     */
    private void przygotowanieNowegoBoiska()
    {
        pozycjaPilki.x = 4;
        pozycjaPilki.y = 5;
        boisko = new int[11][9];
        numerGracza = 1;
        for(int i=0;i<11;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(j==0) boisko[i][j] = 241;
                else if(j==8) boisko[i][j] = 31;
                if(i==0)
                {
                    if(j==0) boisko[i][j] = 247;
                    else if(j<3) boisko[i][j] = 199;
                    else if(j==3) boisko[i][j] = 193;
                    else if(j==4) boisko[i][j] = 0;
                    else if(j==5) boisko[i][j] = 7;
                    else if(j<8) boisko[i][j] = 199;
                    else if(j==8) boisko[i][j] = 223;
                }
                else if(i==10)
                {
                    if(j==0) boisko[i][j] = 253;
                    else if(j<3) boisko[i][j] = 124;
                    else if(j==3) boisko[i][j] = 112;
                    else if(j==4) boisko[i][j] = 0;
                    else if(j==5) boisko[i][j] = 28;
                    else if(j<8) boisko[i][j] = 124;
                    else if(j==8) boisko[i][j] = 127;
                }
                else if(j!=0 && j!=8) boisko[i][j] = 0;
            }
        }
        return;
    }
    /**
     * Gracz wysyła informacje, że chce grać. Jeśli będzie 2 graczy
     * to rozpoczyna się gra
     * @param nick Czyli unikalny identyfikator gracza
     */
    public void chceGrac(String nick)
    {
        if(gracz1==null)
            gracz1 = nick;
        else
        {
            gracz2 = nick;
            startGry = true;
            przygotowanieNowegoBoiska();
        }
    }
    /**
     * Zwracanie numeru gracza
     * @return Zwracany jest numer gracza
     */
    public int getNumerGracza()
    {
        return numerGracza;
    }
    private int [][]boisko;         //boisko do gry w piłkarzyki ;)
    private Point pozycjaPilki = new Point();
    private Point przesuniecie = new Point();//aktualna pozycja piłki na boisku, przesuniecie pilki
    private int numerGracza;        //numer gracza mającego aktualnie ruch - może być to 1 lub 2
    private String gracz1=null,gracz2=null;   //nazwy graczy
    private boolean startGry = false;
}
