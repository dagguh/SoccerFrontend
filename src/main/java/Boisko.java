/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Point;
import javax.swing.JLabel;

/**
 *
 * @author Mateusz
 */
public class Boisko {
    public Boisko(JLabel boisko)
    {
        this.srodekBoiska = new Point(boisko.getPreferredSize().width/2,boisko.getPreferredSize().height/2);
    }
    /**
     * Funkcja zwracająca środek boiska
     * @return w postaci punktu zwracany jest środek boiska
     */
    public Point getSrodekBoiska() {
        return srodekBoiska;
    }

    private Point srodekBoiska;
}

/*
    public void przygotowanieBoiska(int [][] boisko)
    {
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
    }*/

