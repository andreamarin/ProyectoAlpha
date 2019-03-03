package client;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

/**
 *
 * @author andreamarin
 */
public class GameGUI extends javax.swing.JFrame {
    private GameClient game;
    private Map panelNames; 
    
    public GameGUI() {
        game = new GameClient();
        game.setFrame(this);
        panelNames = new HashMap<String, JPanel>();
        
        initComponents();
        fillMap();
    }
    
    public void setGame(GameClient client){
        this.game = client;
    }
    
    public void fillMap(){
        panelNames.put("m11", m11);
        panelNames.put("m12", m12);
        panelNames.put("m13", m13);
        panelNames.put("m14", m14);
        panelNames.put("m15", m15);
        panelNames.put("m21", m21);
        panelNames.put("m22", m22);
        panelNames.put("m23", m23);
        panelNames.put("m24", m24);
        panelNames.put("m25", m25);
        panelNames.put("m31", m31);
        panelNames.put("m32", m32);
        panelNames.put("m33", m33);
        panelNames.put("m34", m34);
        panelNames.put("m35", m35);
        panelNames.put("m41", m41);
        panelNames.put("m42", m42);
        panelNames.put("m43", m43);
        panelNames.put("m44", m44);
        panelNames.put("m45", m45);
    }
    
    public void changeColor(String pos){
       ((JPanel) panelNames.get(pos)).setBackground(Color.red);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m11 = new javax.swing.JPanel();
        m12 = new javax.swing.JPanel();
        m13 = new javax.swing.JPanel();
        m14 = new javax.swing.JPanel();
        m15 = new javax.swing.JPanel();
        m24 = new javax.swing.JPanel();
        m21 = new javax.swing.JPanel();
        m25 = new javax.swing.JPanel();
        m22 = new javax.swing.JPanel();
        m23 = new javax.swing.JPanel();
        m34 = new javax.swing.JPanel();
        m31 = new javax.swing.JPanel();
        m35 = new javax.swing.JPanel();
        m32 = new javax.swing.JPanel();
        m33 = new javax.swing.JPanel();
        m44 = new javax.swing.JPanel();
        m45 = new javax.swing.JPanel();
        m41 = new javax.swing.JPanel();
        m43 = new javax.swing.JPanel();
        m42 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        empezar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        m11.setBackground(new java.awt.Color(219, 240, 255));
        m11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m11Layout = new javax.swing.GroupLayout(m11);
        m11.setLayout(m11Layout);
        m11Layout.setHorizontalGroup(
            m11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m11Layout.setVerticalGroup(
            m11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m12.setBackground(new java.awt.Color(219, 240, 255));
        m12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m12Layout = new javax.swing.GroupLayout(m12);
        m12.setLayout(m12Layout);
        m12Layout.setHorizontalGroup(
            m12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m12Layout.setVerticalGroup(
            m12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m13.setBackground(new java.awt.Color(219, 240, 255));
        m13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m13Layout = new javax.swing.GroupLayout(m13);
        m13.setLayout(m13Layout);
        m13Layout.setHorizontalGroup(
            m13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m13Layout.setVerticalGroup(
            m13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m14.setBackground(new java.awt.Color(219, 240, 255));
        m14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m14Layout = new javax.swing.GroupLayout(m14);
        m14.setLayout(m14Layout);
        m14Layout.setHorizontalGroup(
            m14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m14Layout.setVerticalGroup(
            m14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m15.setBackground(new java.awt.Color(219, 240, 255));
        m15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m15Layout = new javax.swing.GroupLayout(m15);
        m15.setLayout(m15Layout);
        m15Layout.setHorizontalGroup(
            m15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m15Layout.setVerticalGroup(
            m15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m24.setBackground(new java.awt.Color(219, 240, 255));
        m24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m24Layout = new javax.swing.GroupLayout(m24);
        m24.setLayout(m24Layout);
        m24Layout.setHorizontalGroup(
            m24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m24Layout.setVerticalGroup(
            m24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        m21.setBackground(new java.awt.Color(219, 240, 255));
        m21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m21Layout = new javax.swing.GroupLayout(m21);
        m21.setLayout(m21Layout);
        m21Layout.setHorizontalGroup(
            m21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m21Layout.setVerticalGroup(
            m21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m25.setBackground(new java.awt.Color(219, 240, 255));
        m25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m25Layout = new javax.swing.GroupLayout(m25);
        m25.setLayout(m25Layout);
        m25Layout.setHorizontalGroup(
            m25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m25Layout.setVerticalGroup(
            m25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        m22.setBackground(new java.awt.Color(219, 240, 255));
        m22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m22Layout = new javax.swing.GroupLayout(m22);
        m22.setLayout(m22Layout);
        m22Layout.setHorizontalGroup(
            m22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m22Layout.setVerticalGroup(
            m22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        m23.setBackground(new java.awt.Color(219, 240, 255));
        m23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m23Layout = new javax.swing.GroupLayout(m23);
        m23.setLayout(m23Layout);
        m23Layout.setHorizontalGroup(
            m23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m23Layout.setVerticalGroup(
            m23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        m34.setBackground(new java.awt.Color(219, 240, 255));
        m34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m34Layout = new javax.swing.GroupLayout(m34);
        m34.setLayout(m34Layout);
        m34Layout.setHorizontalGroup(
            m34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m34Layout.setVerticalGroup(
            m34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m31.setBackground(new java.awt.Color(219, 240, 255));
        m31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m31Layout = new javax.swing.GroupLayout(m31);
        m31.setLayout(m31Layout);
        m31Layout.setHorizontalGroup(
            m31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m31Layout.setVerticalGroup(
            m31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m35.setBackground(new java.awt.Color(219, 240, 255));
        m35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m35Layout = new javax.swing.GroupLayout(m35);
        m35.setLayout(m35Layout);
        m35Layout.setHorizontalGroup(
            m35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m35Layout.setVerticalGroup(
            m35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m32.setBackground(new java.awt.Color(219, 240, 255));
        m32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m32Layout = new javax.swing.GroupLayout(m32);
        m32.setLayout(m32Layout);
        m32Layout.setHorizontalGroup(
            m32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m32Layout.setVerticalGroup(
            m32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m33.setBackground(new java.awt.Color(219, 240, 255));
        m33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m33Layout = new javax.swing.GroupLayout(m33);
        m33.setLayout(m33Layout);
        m33Layout.setHorizontalGroup(
            m33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m33Layout.setVerticalGroup(
            m33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m44.setBackground(new java.awt.Color(219, 240, 255));
        m44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m44MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m44Layout = new javax.swing.GroupLayout(m44);
        m44.setLayout(m44Layout);
        m44Layout.setHorizontalGroup(
            m44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m44Layout.setVerticalGroup(
            m44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m45.setBackground(new java.awt.Color(219, 240, 255));
        m45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m45MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m45Layout = new javax.swing.GroupLayout(m45);
        m45.setLayout(m45Layout);
        m45Layout.setHorizontalGroup(
            m45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m45Layout.setVerticalGroup(
            m45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m41.setBackground(new java.awt.Color(219, 240, 255));
        m41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m41Layout = new javax.swing.GroupLayout(m41);
        m41.setLayout(m41Layout);
        m41Layout.setHorizontalGroup(
            m41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m41Layout.setVerticalGroup(
            m41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m43.setBackground(new java.awt.Color(219, 240, 255));
        m43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m43Layout = new javax.swing.GroupLayout(m43);
        m43.setLayout(m43Layout);
        m43Layout.setHorizontalGroup(
            m43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m43Layout.setVerticalGroup(
            m43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        m42.setBackground(new java.awt.Color(219, 240, 255));
        m42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        m42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m42MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout m42Layout = new javax.swing.GroupLayout(m42);
        m42.setLayout(m42Layout);
        m42Layout.setHorizontalGroup(
            m42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        m42Layout.setVerticalGroup(
            m42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Bienvenido(a), ");

        nombre.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        nombre.setText("Andrea");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Score:");

        score.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        score.setText("5");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        empezar.setText("Conectarse");
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(m31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(m21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(score))
                            .addComponent(empezar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(m25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(score))
                        .addGap(51, 51, 51)
                        .addComponent(empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m11MouseClicked
        m11.setBackground(Color.red);
    }//GEN-LAST:event_m11MouseClicked

    private void m12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m12MouseClicked

    private void m13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m13MouseClicked

    private void m14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m14MouseClicked

    private void m15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m15MouseClicked

    private void m24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m24MouseClicked

    private void m21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m21MouseClicked

    private void m25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m25MouseClicked

    private void m22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m22MouseClicked

    private void m23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m23MouseClicked

    private void m34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m34MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m34MouseClicked

    private void m31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m31MouseClicked

    private void m35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m35MouseClicked

    private void m32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m32MouseClicked

    private void m33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m33MouseClicked

    private void m44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m44MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m44MouseClicked

    private void m45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m45MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m45MouseClicked

    private void m41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m41MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m41MouseClicked

    private void m43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m43MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m43MouseClicked

    private void m42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m42MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m42MouseClicked

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //this.setVisible(false);
        game.escribe("12");
        //this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        Login log = new Login();
        log.setVisible(true);
        log.setClient(game);
    }//GEN-LAST:event_empezarActionPerformed

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
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empezar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel m11;
    private javax.swing.JPanel m12;
    private javax.swing.JPanel m13;
    private javax.swing.JPanel m14;
    private javax.swing.JPanel m15;
    private javax.swing.JPanel m21;
    private javax.swing.JPanel m22;
    private javax.swing.JPanel m23;
    private javax.swing.JPanel m24;
    private javax.swing.JPanel m25;
    private javax.swing.JPanel m31;
    private javax.swing.JPanel m32;
    private javax.swing.JPanel m33;
    private javax.swing.JPanel m34;
    private javax.swing.JPanel m35;
    private javax.swing.JPanel m41;
    private javax.swing.JPanel m42;
    private javax.swing.JPanel m43;
    private javax.swing.JPanel m44;
    private javax.swing.JPanel m45;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton salir;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables
}
