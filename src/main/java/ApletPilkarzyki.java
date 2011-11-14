/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ApletPilkarzyki.java
 *
 * Created on 2011-10-09, 13:18:14
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author Mateusz
 */
public class ApletPilkarzyki extends javax.swing.JApplet {

    /** Initializes the applet ApletPilkarzyki */
    @Override
    public void init() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApletPilkarzyki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApletPilkarzyki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApletPilkarzyki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApletPilkarzyki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {

                @Override
                public void run() {
                    initComponents();
                    czyjRuch.setText("Ruch należy do gracza 1");
                    nick = "testowy";
                    s  = new Servlet();
                    b= new Boisko(boisko);
                    s.chceGrac(nick);
                    s.chceGrac("drugi");
                    x = b.getSrodekBoiska().x;
                    y = b.getSrodekBoiska().y;//oznaczenie srodka boiska
                    System.out.println(x + " "+ y);
                    //linie = new Line2D() {}[1000];
                    wskaznik.setVisible(false);
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        wskaznik = new javax.swing.JLabel();
        boisko = new javax.swing.JLabel();
        czyjRuch = new javax.swing.JLabel();
        stanGry = new javax.swing.JLabel();
        restart = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(34, 177, 76));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(643, 532));
        jPanel1.setMinimumSize(new java.awt.Dimension(643, 532));
        jPanel1.setPreferredSize(new java.awt.Dimension(643, 532));

        wskaznik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pilkarzyki/pix.png"))); // NOI18N

        boisko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pilkarzyki/boisko.png"))); // NOI18N
        boisko.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boisko.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boiskoMouseClicked(evt);
            }
        });
        boisko.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                boiskoMouseMoved(evt);
            }
        });

        czyjRuch.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        czyjRuch.setText("Ruch należy do gracza czerwonego");

        stanGry.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        stanGry.setText("Na razie jest remis");

        restart.setText("Restart gry");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boisko)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(czyjRuch)
                    .addComponent(stanGry)
                    .addComponent(wskaznik)
                    .addComponent(restart))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(boisko))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(restart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stanGry)
                        .addGap(15, 15, 15)
                        .addComponent(czyjRuch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wskaznik)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        wskaznik.getAccessibleContext().setAccessibleParent(boisko);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void boiskoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boiskoMouseClicked
    if(s.czyWolnePole(kierunek,nick)!=0)//czyli pole jest ok
    {
        BasicStroke bs = new BasicStroke(2);
        Graphics2D g = (Graphics2D) boisko.getGraphics();
        g.setStroke(bs);
        //Line2D line = new Line2D.Double(x, y,  wskaznik.getLocation().x, wskaznik.getLocation().y);
        g.setColor(Color.white);
        //boisko.removeAll();
        if(s.czyWolnePole(kierunek,nick) == 2)
        {
            g.drawLine(x, y,  wskaznik.getLocation().x, wskaznik.getLocation().y);
            stanGry.setText("Wygrał gracz 1. Koniec gry");
            koniecGry = true;
        }
        else if(s.czyWolnePole(kierunek,nick) == 3)
        {
            g.drawLine(x, y,  wskaznik.getLocation().x, wskaznik.getLocation().y);
            stanGry.setText("Wygrał gracz 2. Koniec gry"); 
            koniecGry = true;
        }
        else
        {
            czyjRuch.setText("Ruch należy do mnie zwraca "+s.czyMojRuch(nick));
            Line2D line = new Line2D.Double(x, y,  wskaznik.getLocation().x, wskaznik.getLocation().y);
            g.draw(line);
            //g.drawLine(x, y,  wskaznik.getLocation().x, wskaznik.getLocation().y);
            x = wskaznik.getLocation().x;
            y = wskaznik.getLocation().y;
            if(s.czyWolnePole(kierunek, nick)==4)
            {
                wskaznik.setText("Zablokowany. "+ (s.getNumerGracza()==1?"Gracz 2 ":"Gracz 1 ") + " wygrywa");
                koniecGry = true;
            }       
        }
    }
    s.wypiszBoisko();
}//GEN-LAST:event_boiskoMouseClicked

/**
 * Poruszanie się kursora myszy po boisku. 
 * Pozwala określić gdzie ma zostać umieszczona piłka
 * po kliknięciu przez gracza
 * @param evt 
 */
private void boiskoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boiskoMouseMoved
    int nowyX = evt.getX();
    int nowyY = evt.getY();//nowa pozycja X oraz Y
    if(pomiedzy(nowyX,x-20,x+20) && pomiedzy(nowyY,y-60,y-20) )//1
    {
        wskaznik.setLocation(x, y-40);
        kierunek = 1;
    }
    else if(pomiedzy(nowyX,x+20,x+60) && pomiedzy(nowyY,y-60,y-20) )//2
    {
        wskaznik.setLocation(x+40, y-40);
        kierunek = 2;
    }
    else if(pomiedzy(nowyX,x+20,x+60) && pomiedzy(nowyY,y-20,y+20) )//4
    {
        wskaznik.setLocation(x+40, y);
        kierunek = 4;
    }
    else if(pomiedzy(nowyX,x+20,x+60) && pomiedzy(nowyY,y+20,y+60) )//8
    {
        wskaznik.setLocation(x+40, y+40);
        kierunek = 8;
    }
    else if(pomiedzy(nowyX,x-20,x+20) && pomiedzy(nowyY,y+20,y+60) )//16
    {
        wskaznik.setLocation(x, y+40);
        kierunek = 16;
    }
    else if(pomiedzy(nowyX,x-60,x-20) && pomiedzy(nowyY,y+20,y+60) )//32
    {
        wskaznik.setLocation(x-40, y+40);
        kierunek = 32;
    }
    else if(pomiedzy(nowyX,x-60,x-20) && pomiedzy(nowyY,y-20,y+20) )//64
    {
        wskaznik.setLocation(x-40, y);
        kierunek = 64;
    }
    else if(pomiedzy(nowyX,x-60,x-20) && pomiedzy(nowyY,y-60,y-20) )//128
    {
        wskaznik.setLocation(x-40, y-40);
        kierunek = 128;
    }
    else
    {
        wskaznik.setLocation(x, y);
        kierunek = 0;//złe położenie kursora
    }
}//GEN-LAST:event_boiskoMouseMoved

private boolean pomiedzy(int wartosc, int min, int max)
{
    if(wartosc >= min && wartosc <= max  )
        return true;
    else return false;
}
private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
    //s.przygotowanieNowegoBoiska();
    x = b.getSrodekBoiska().x;
    y = b.getSrodekBoiska().y;//oznaczenie srodka boiska
    boisko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pilkarzyki/boisko.png")));
    koniecGry = false;
}//GEN-LAST:event_restartActionPerformed

    int x=0,y=0,kierunek;
    boolean koniecGry = false;
    String nick = null;
    Servlet s;
    Boisko b;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boisko;
    private javax.swing.JLabel czyjRuch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton restart;
    private javax.swing.JLabel stanGry;
    private javax.swing.JLabel wskaznik;
    // End of variables declaration//GEN-END:variables
}