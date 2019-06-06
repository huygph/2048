/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.*;
public class board extends javax.swing.JFrame {
    public static Game2048 game2048;
    public board() {
                game2048 = new Game2048();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        o9 = new javax.swing.JLabel();
        o2 = new javax.swing.JLabel();
        o1 = new javax.swing.JLabel();
        o4 = new javax.swing.JLabel();
        o12 = new javax.swing.JLabel();
        o3 = new javax.swing.JLabel();
        o10 = new javax.swing.JLabel();
        o8 = new javax.swing.JLabel();
        o6 = new javax.swing.JLabel();
        o13 = new javax.swing.JLabel();
        o5 = new javax.swing.JLabel();
        o11 = new javax.swing.JLabel();
        o15 = new javax.swing.JLabel();
        o14 = new javax.swing.JLabel();
        o7 = new javax.swing.JLabel();
        o16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        undo = new javax.swing.JButton();
        redo = new javax.swing.JButton();
        back = new javax.swing.JButton();
        start = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2048");
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(false);
        setPreferredSize(new java.awt.Dimension(400, 500));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        o9.setBackground(new java.awt.Color(255, 204, 0));
        o9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o9.setOpaque(true);
        getContentPane().add(o9);
        o9.setBounds(80, 280, 60, 60);

        o2.setBackground(new java.awt.Color(255, 255, 153));
        o2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o2.setOpaque(true);
        getContentPane().add(o2);
        o2.setBounds(140, 160, 60, 60);

        o1.setBackground(new java.awt.Color(255, 204, 0));
        o1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o1.setOpaque(true);
        getContentPane().add(o1);
        o1.setBounds(80, 160, 60, 60);

        o4.setBackground(new java.awt.Color(255, 255, 153));
        o4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o4.setOpaque(true);
        getContentPane().add(o4);
        o4.setBounds(260, 160, 60, 60);

        o12.setBackground(new java.awt.Color(255, 255, 153));
        o12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o12.setOpaque(true);
        getContentPane().add(o12);
        o12.setBounds(260, 280, 60, 60);

        o3.setBackground(new java.awt.Color(255, 204, 0));
        o3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o3.setOpaque(true);
        getContentPane().add(o3);
        o3.setBounds(200, 160, 60, 60);

        o10.setBackground(new java.awt.Color(255, 255, 153));
        o10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o10.setOpaque(true);
        getContentPane().add(o10);
        o10.setBounds(140, 280, 60, 60);

        o8.setBackground(new java.awt.Color(255, 204, 0));
        o8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o8.setOpaque(true);
        getContentPane().add(o8);
        o8.setBounds(260, 220, 60, 60);

        o6.setBackground(new java.awt.Color(255, 204, 0));
        o6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o6.setOpaque(true);
        getContentPane().add(o6);
        o6.setBounds(140, 220, 60, 60);

        o13.setBackground(new java.awt.Color(255, 255, 153));
        o13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o13.setOpaque(true);
        getContentPane().add(o13);
        o13.setBounds(80, 340, 60, 60);

        o5.setBackground(new java.awt.Color(255, 255, 153));
        o5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o5.setOpaque(true);
        getContentPane().add(o5);
        o5.setBounds(80, 220, 60, 60);

        o11.setBackground(new java.awt.Color(255, 204, 0));
        o11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o11.setOpaque(true);
        getContentPane().add(o11);
        o11.setBounds(200, 280, 60, 60);

        o15.setBackground(new java.awt.Color(255, 255, 153));
        o15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o15.setOpaque(true);
        getContentPane().add(o15);
        o15.setBounds(200, 340, 60, 60);

        o14.setBackground(new java.awt.Color(255, 204, 0));
        o14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o14.setOpaque(true);
        getContentPane().add(o14);
        o14.setBounds(140, 340, 60, 60);

        o7.setBackground(new java.awt.Color(255, 255, 153));
        o7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o7.setOpaque(true);
        getContentPane().add(o7);
        o7.setBounds(200, 220, 60, 60);

        o16.setBackground(new java.awt.Color(255, 204, 0));
        o16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        o16.setOpaque(true);
        getContentPane().add(o16);
        o16.setBounds(260, 340, 60, 60);

        jLabel21.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("2048");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(40, 60, 100, 40);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2048");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "High Score", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria Math", 1, 14))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 60, 100, 40);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("4");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Score", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria Math", 1, 14))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 60, 90, 40);

        undo.setBackground(new java.awt.Color(255, 255, 255));
        undo.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        undo.setForeground(new java.awt.Color(255, 255, 255));
        undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/icons8-undo-24.png"))); // NOI18N
        undo.setBorderPainted(false);
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });
        getContentPane().add(undo);
        undo.setBounds(210, 120, 30, 30);

        redo.setBackground(new java.awt.Color(255, 255, 255));
        redo.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        redo.setForeground(new java.awt.Color(255, 255, 255));
        redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/icons8-available-updates-24.png"))); // NOI18N
        redo.setBorderPainted(false);
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });
        getContentPane().add(redo);
        redo.setBounds(260, 120, 30, 30);

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        back.setText("Back");
        back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(210, 440, 60, 23);

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        start.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startKeyPressed(evt);
            }
        });
        getContentPane().add(start);
        start.setBounds(100, 440, 57, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Fractal Wallpapers-part-1 (311).jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 380, 510);

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(400, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   public void showboard() {
      
       if (game2048.Board[0][0] != 0)
       { switch(game2048.Board[0][0])  {
               case 2 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;     
               default : break;}
           }
     if (game2048.Board[0][1] != 0)
     { switch(game2048.Board[0][1])  {
               case 2 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;   
               default : break;
           }}
     if (game2048.Board[0][2] != 0)
     { switch(game2048.Board[0][2])  {
               case 2 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;   
               default : break;
           }}
     if (game2048.Board[0][3] != 0)
     {  switch(game2048.Board[0][3])  {
               case 2 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;      
               default : break;
           }}
     if (game2048.Board[1][0] != 0)
     { switch(game2048.Board[1][0])  {
               case 2 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;      
               default : break;
           }}
     if (game2048.Board[1][1] != 0)
     { switch(game2048.Board[1][1])  {
               case 2 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;       
               default : break;
           }}
     if (game2048.Board[1][2] != 0)
     {  switch(game2048.Board[1][2])  {
               case 2 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;    
               default : break;
           }}
     if (game2048.Board[1][3] != 0)
     {  switch(game2048.Board[1][3])  {
               case 2 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;      
               default : break;
           }}
     if (game2048.Board[2][0] != 0)
     {    switch(game2048.Board[2][0])  {
               case 2 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;  
               default : break;
           }}
     if (game2048.Board[2][1] != 0)
     { switch(game2048.Board[2][1])  {
               case 2 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;  
               default : break;
           }}
     if (game2048.Board[2][2] != 0)
     { switch(game2048.Board[2][2])  {
               case 2 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;   
               default : break;
           }}
     if (game2048.Board[2][3] != 0)
     {  switch(game2048.Board[2][3])  {
               case 2 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;    
               default : break;
           }}
     if (game2048.Board[3][0] != 0)
     { switch(game2048.Board[3][0])  {
               case 2 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;    
               default : break;
           }}
     if (game2048.Board[3][1] != 0)
     {  switch(game2048.Board[3][1])  {
               case 2 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;      
               default : break;
           }}
     if (game2048.Board[3][2] != 0)
     {    switch(game2048.Board[3][2])  {
               case 2 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;    
               default : break;
           }}
     if (game2048.Board[3][3] != 0)
     {  switch(game2048.Board[3][3])  {
               case 2 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2.PNG"))); break;
               case 4 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/4.PNG"))); break;
               case 8 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.PNG"))); break;
               case 16 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/16.PNG"))); break;
               case 32 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/32.PNG"))); break;
               case 64 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/64.PNG"))); break;
               case 128 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/128.PNG"))); break;
               case 256 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/256.PNG"))); break;
               case 512 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/512.PNG"))); break;
               case 1024 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/1024.PNG"))); break;
               case 2048 : o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/2048.PNG"))); break;        
               default : break;
           }}
      if (game2048.Board[0][0] == 0)
          o1.setIcon(null);
      if (game2048.Board[0][1] == 0)
          o2.setIcon(null);
      if (game2048.Board[0][2] == 0)
          o3.setIcon(null);
      if (game2048.Board[0][3] == 0)
          o4.setIcon(null);
      if (game2048.Board[1][0] == 0)
          o5.setIcon(null);
      if (game2048.Board[1][1] == 0)
          o6.setIcon(null);
      if (game2048.Board[1][2] == 0)
          o7.setIcon(null);
      if (game2048.Board[1][3] == 0)
          o8.setIcon(null);
      if (game2048.Board[2][0] == 0)
          o9.setIcon(null);
      if (game2048.Board[2][1] == 0)
          o10.setIcon(null);
      if (game2048.Board[2][2] == 0)
          o11.setIcon(null);
      if (game2048.Board[2][3] == 0)
          o12.setIcon(null);
      if (game2048.Board[3][0] == 0)
          o13.setIcon(null);
      if (game2048.Board[3][1] == 0)
          o14.setIcon(null);
      if (game2048.Board[3][2] == 0)
          o15.setIcon(null);
      if (game2048.Board[3][3] == 0)
          o16.setIcon(null);

       
     
    }
    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
    
        game2048.loadundo();
            showboard();
            start.requestFocus();
    }//GEN-LAST:event_undoActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
          MainMenu mm = new MainMenu();
        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
         int output = JOptionPane.showConfirmDialog(null
               ,"Start new game???","Confirm",JOptionPane.YES_NO_OPTION);

            if(output == JOptionPane.YES_OPTION){
              
               
        for ( int i = 0 ; i < 4 ; i ++) {
            for (int j = 0 ; j < 4 ; j ++ ) {
                game2048.Board[i][j] = 0;
            }
        }
        game2048.addRandom();
        showboard();
        start.requestFocus();}
    }//GEN-LAST:event_startActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    private void startKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            game2048.Up();
            showboard();
        }
         if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            game2048.Left();
            showboard();
        }
          if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            game2048.Down();
            showboard();
        }
           if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            game2048.Right();
            showboard();
        }
    }//GEN-LAST:event_startKeyPressed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed
         game2048.loadredo();
            showboard();
            start.requestFocus();
    }//GEN-LAST:event_redoActionPerformed
    private void keyPressed(java.awt.event.KeyEvent evt) {
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel o1;
    public static javax.swing.JLabel o10;
    public static javax.swing.JLabel o11;
    public static javax.swing.JLabel o12;
    public static javax.swing.JLabel o13;
    public static javax.swing.JLabel o14;
    public static javax.swing.JLabel o15;
    public static javax.swing.JLabel o16;
    public static javax.swing.JLabel o2;
    public static javax.swing.JLabel o3;
    public static javax.swing.JLabel o4;
    public static javax.swing.JLabel o5;
    public static javax.swing.JLabel o6;
    public static javax.swing.JLabel o7;
    public static javax.swing.JLabel o8;
    public static javax.swing.JLabel o9;
    private javax.swing.JButton redo;
    private javax.swing.JButton start;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}
