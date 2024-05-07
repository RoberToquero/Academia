import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.JOptionPane;
import java.awt.Color;
public class Bloc3_Java extends javax.swing.JFrame {
    boolean letranegrita=false;
    boolean letracursiva=false;
    boolean letrasubrayado=false;
    SimpleAttributeSet estilo = new SimpleAttributeSet(); 
    public Bloc3_Java() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesalineacion = new javax.swing.ButtonGroup();
        contextual = new javax.swing.JPopupMenu();
        cacerca = new javax.swing.JMenuItem();
        m_color_fondo = new javax.swing.JMenu();
        fondo_azul = new javax.swing.JRadioButtonMenuItem();
        fondo_amarillo = new javax.swing.JRadioButtonMenuItem();
        fondo_rojo = new javax.swing.JRadioButtonMenuItem();
        fondo_blanco = new javax.swing.JRadioButtonMenuItem();
        color_de_fondo = new javax.swing.ButtonGroup();
        herram_alineacion = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextPane();
        Barra_herramientas1 = new javax.swing.JToolBar();
        bot_abrir = new javax.swing.JButton();
        bot_guardar = new javax.swing.JButton();
        bot_guardar_como = new javax.swing.JButton();
        bot_imprimir = new javax.swing.JButton();
        Barra_herramientas2 = new javax.swing.JToolBar();
        bot_cerrar = new javax.swing.JButton();
        barra_herramientas3 = new javax.swing.JToolBar();
        btn_negrita = new javax.swing.JToggleButton();
        btn_cursiva = new javax.swing.JToggleButton();
        btn_subrayado = new javax.swing.JToggleButton();
        barra_herramientas4 = new javax.swing.JToolBar();
        btn_alin_izq = new javax.swing.JToggleButton();
        btn_alin_cent = new javax.swing.JToggleButton();
        btn_alin_der = new javax.swing.JToggleButton();
        btn_alin_just = new javax.swing.JToggleButton();
        barramenu = new javax.swing.JMenuBar();
        marchivo = new javax.swing.JMenu();
        mabrir = new javax.swing.JMenuItem();
        mguardar = new javax.swing.JMenuItem();
        mguardarcomo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mimprimir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mcerrar = new javax.swing.JMenuItem();
        mformato = new javax.swing.JMenu();
        malineacion = new javax.swing.JMenu();
        alinizquierda = new javax.swing.JRadioButtonMenuItem();
        alincentrada = new javax.swing.JRadioButtonMenuItem();
        alinderecha = new javax.swing.JRadioButtonMenuItem();
        alinjustificada = new javax.swing.JRadioButtonMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnegrita = new javax.swing.JCheckBoxMenuItem();
        mcursiva = new javax.swing.JCheckBoxMenuItem();
        msubrayado = new javax.swing.JCheckBoxMenuItem();
        minfo = new javax.swing.JMenu();
        acerca = new javax.swing.JMenuItem();

        cacerca.setMnemonic('e');
        cacerca.setText("Acerca de ...");
        cacerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cacercaActionPerformed(evt);
            }
        });
        contextual.add(cacerca);

        m_color_fondo.setText("Color de fondo");

        color_de_fondo.add(fondo_azul);
        fondo_azul.setSelected(true);
        fondo_azul.setText("Azul");
        fondo_azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondo_azulActionPerformed(evt);
            }
        });
        m_color_fondo.add(fondo_azul);

        color_de_fondo.add(fondo_amarillo);
        fondo_amarillo.setText("Amarillo");
        fondo_amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondo_amarilloActionPerformed(evt);
            }
        });
        m_color_fondo.add(fondo_amarillo);

        color_de_fondo.add(fondo_rojo);
        fondo_rojo.setText("Rojo");
        fondo_rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondo_rojoActionPerformed(evt);
            }
        });
        m_color_fondo.add(fondo_rojo);

        color_de_fondo.add(fondo_blanco);
        fondo_blanco.setText("Blanco");
        fondo_blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondo_blancoActionPerformed(evt);
            }
        });
        m_color_fondo.add(fondo_blanco);

        contextual.add(m_color_fondo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BLOC JAVA");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        texto.setFont(new java.awt.Font("Times New Roman", 0, 32)); // NOI18N
        texto.setComponentPopupMenu(contextual);
        jScrollPane2.setViewportView(texto);

        Barra_herramientas1.setRollover(true);

        bot_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Abrir.png"))); // NOI18N
        bot_abrir.setFocusable(false);
        bot_abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bot_abrir.setMaximumSize(new java.awt.Dimension(32, 32));
        bot_abrir.setMinimumSize(new java.awt.Dimension(32, 32));
        bot_abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bot_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_abrirActionPerformed(evt);
            }
        });
        Barra_herramientas1.add(bot_abrir);

        bot_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardar.png"))); // NOI18N
        bot_guardar.setFocusable(false);
        bot_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bot_guardar.setMaximumSize(new java.awt.Dimension(32, 32));
        bot_guardar.setMinimumSize(new java.awt.Dimension(32, 32));
        bot_guardar.setPreferredSize(new java.awt.Dimension(32, 32));
        bot_guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bot_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_guardarActionPerformed(evt);
            }
        });
        Barra_herramientas1.add(bot_guardar);

        bot_guardar_como.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardar_como.png"))); // NOI18N
        bot_guardar_como.setFocusable(false);
        bot_guardar_como.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bot_guardar_como.setMaximumSize(new java.awt.Dimension(32, 32));
        bot_guardar_como.setMinimumSize(new java.awt.Dimension(32, 32));
        bot_guardar_como.setPreferredSize(new java.awt.Dimension(32, 32));
        bot_guardar_como.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bot_guardar_como.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_guardar_comoActionPerformed(evt);
            }
        });
        Barra_herramientas1.add(bot_guardar_como);

        bot_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imprimir.png"))); // NOI18N
        bot_imprimir.setFocusable(false);
        bot_imprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bot_imprimir.setMaximumSize(new java.awt.Dimension(32, 32));
        bot_imprimir.setMinimumSize(new java.awt.Dimension(32, 32));
        bot_imprimir.setPreferredSize(new java.awt.Dimension(32, 32));
        bot_imprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bot_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_imprimirActionPerformed(evt);
            }
        });
        Barra_herramientas1.add(bot_imprimir);

        Barra_herramientas2.setRollover(true);

        bot_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cerrar.png"))); // NOI18N
        bot_cerrar.setFocusable(false);
        bot_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bot_cerrar.setMaximumSize(new java.awt.Dimension(32, 32));
        bot_cerrar.setMinimumSize(new java.awt.Dimension(32, 32));
        bot_cerrar.setPreferredSize(new java.awt.Dimension(32, 32));
        bot_cerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bot_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_cerrarActionPerformed(evt);
            }
        });
        Barra_herramientas2.add(bot_cerrar);

        barra_herramientas3.setRollover(true);

        btn_negrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Negrita.png"))); // NOI18N
        btn_negrita.setFocusable(false);
        btn_negrita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_negrita.setMaximumSize(new java.awt.Dimension(32, 32));
        btn_negrita.setMinimumSize(new java.awt.Dimension(32, 32));
        btn_negrita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_negrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_negritaActionPerformed(evt);
            }
        });
        barra_herramientas3.add(btn_negrita);

        btn_cursiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cursiva.png"))); // NOI18N
        btn_cursiva.setFocusable(false);
        btn_cursiva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cursiva.setMaximumSize(new java.awt.Dimension(32, 32));
        btn_cursiva.setMinimumSize(new java.awt.Dimension(32, 32));
        btn_cursiva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cursivaActionPerformed(evt);
            }
        });
        barra_herramientas3.add(btn_cursiva);

        btn_subrayado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Subrayado.png"))); // NOI18N
        btn_subrayado.setFocusable(false);
        btn_subrayado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_subrayado.setMaximumSize(new java.awt.Dimension(32, 32));
        btn_subrayado.setMinimumSize(new java.awt.Dimension(32, 32));
        btn_subrayado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_subrayado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subrayadoActionPerformed(evt);
            }
        });
        barra_herramientas3.add(btn_subrayado);

        barra_herramientas4.setRollover(true);

        herram_alineacion.add(btn_alin_izq);
        btn_alin_izq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alin_izq.png"))); // NOI18N
        btn_alin_izq.setFocusable(false);
        btn_alin_izq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_alin_izq.setMaximumSize(new java.awt.Dimension(32, 32));
        btn_alin_izq.setMinimumSize(new java.awt.Dimension(32, 32));
        btn_alin_izq.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_alin_izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alin_izqActionPerformed(evt);
            }
        });
        barra_herramientas4.add(btn_alin_izq);

        herram_alineacion.add(btn_alin_cent);
        btn_alin_cent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alin_cent.png"))); // NOI18N
        btn_alin_cent.setFocusable(false);
        btn_alin_cent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_alin_cent.setMaximumSize(new java.awt.Dimension(32, 32));
        btn_alin_cent.setMinimumSize(new java.awt.Dimension(32, 32));
        btn_alin_cent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_alin_cent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alin_centActionPerformed(evt);
            }
        });
        barra_herramientas4.add(btn_alin_cent);

        herram_alineacion.add(btn_alin_der);
        btn_alin_der.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alin_der.png"))); // NOI18N
        btn_alin_der.setFocusable(false);
        btn_alin_der.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_alin_der.setMaximumSize(new java.awt.Dimension(32, 32));
        btn_alin_der.setMinimumSize(new java.awt.Dimension(32, 32));
        btn_alin_der.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_alin_der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alin_derActionPerformed(evt);
            }
        });
        barra_herramientas4.add(btn_alin_der);

        herram_alineacion.add(btn_alin_just);
        btn_alin_just.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alin_just.png"))); // NOI18N
        btn_alin_just.setFocusable(false);
        btn_alin_just.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_alin_just.setMaximumSize(new java.awt.Dimension(32, 32));
        btn_alin_just.setMinimumSize(new java.awt.Dimension(32, 32));
        btn_alin_just.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_alin_just.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alin_justActionPerformed(evt);
            }
        });
        barra_herramientas4.add(btn_alin_just);

        marchivo.setMnemonic('A');
        marchivo.setText("Archivo");

        mabrir.setMnemonic('b');
        mabrir.setText("Abrir");
        mabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mabrirActionPerformed(evt);
            }
        });
        marchivo.add(mabrir);

        mguardar.setMnemonic('G');
        mguardar.setText("Guardar");
        mguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mguardarActionPerformed(evt);
            }
        });
        marchivo.add(mguardar);

        mguardarcomo.setMnemonic('u');
        mguardarcomo.setText("Guardar como...");
        marchivo.add(mguardarcomo);
        marchivo.add(jSeparator1);

        mimprimir.setMnemonic('u');
        mimprimir.setText("Imprimir...");
        marchivo.add(mimprimir);
        marchivo.add(jSeparator2);

        mcerrar.setMnemonic('C');
        mcerrar.setText("Cerrar");
        mcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mcerrarMouseClicked(evt);
            }
        });
        mcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcerrarActionPerformed(evt);
            }
        });
        marchivo.add(mcerrar);

        barramenu.add(marchivo);

        mformato.setMnemonic('F');
        mformato.setText("Formato");
        mformato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mformatoMouseClicked(evt);
            }
        });

        malineacion.setMnemonic('A');
        malineacion.setText("Alineación");

        botonesalineacion.add(alinizquierda);
        alinizquierda.setMnemonic('I');
        alinizquierda.setSelected(true);
        alinizquierda.setText("Izquierda");
        alinizquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alinizquierdaActionPerformed(evt);
            }
        });
        malineacion.add(alinizquierda);

        botonesalineacion.add(alincentrada);
        alincentrada.setMnemonic('C');
        alincentrada.setText("Centrada");
        alincentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alincentradaActionPerformed(evt);
            }
        });
        malineacion.add(alincentrada);

        botonesalineacion.add(alinderecha);
        alinderecha.setMnemonic('D');
        alinderecha.setText("Derecha");
        alinderecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alinderechaActionPerformed(evt);
            }
        });
        malineacion.add(alinderecha);

        botonesalineacion.add(alinjustificada);
        alinjustificada.setMnemonic('J');
        alinjustificada.setText("Justificada");
        alinjustificada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alinjustificadaActionPerformed(evt);
            }
        });
        malineacion.add(alinjustificada);

        mformato.add(malineacion);
        mformato.add(jSeparator3);

        mnegrita.setMnemonic('N');
        mnegrita.setSelected(true);
        mnegrita.setText("Negrita");
        mnegrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnegritaActionPerformed(evt);
            }
        });
        mformato.add(mnegrita);

        mcursiva.setMnemonic('v');
        mcursiva.setSelected(true);
        mcursiva.setText("Cursiva");
        mcursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcursivaActionPerformed(evt);
            }
        });
        mformato.add(mcursiva);

        msubrayado.setMnemonic('S');
        msubrayado.setSelected(true);
        msubrayado.setText("Subrayado");
        msubrayado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msubrayadoActionPerformed(evt);
            }
        });
        mformato.add(msubrayado);

        barramenu.add(mformato);

        minfo.setMnemonic('I');
        minfo.setText("Info");

        acerca.setMnemonic('e');
        acerca.setText("Acerca de ...");
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });
        minfo.add(acerca);

        barramenu.add(minfo);

        setJMenuBar(barramenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Barra_herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra_herramientas3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra_herramientas4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Barra_herramientas2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Barra_herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Barra_herramientas2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barra_herramientas3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barra_herramientas4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcerrarActionPerformed
        cerrar();
    }//GEN-LAST:event_mcerrarActionPerformed

    private void mcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcerrarMouseClicked
        
    }//GEN-LAST:event_mcerrarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated
   
    private void alinizquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alinizquierdaActionPerformed
        izquierda();
    }//GEN-LAST:event_alinizquierdaActionPerformed
    private void alincentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alincentradaActionPerformed
        centro();
    }//GEN-LAST:event_alincentradaActionPerformed
   
    private void alinderechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alinderechaActionPerformed
        derecha();
    }//GEN-LAST:event_alinderechaActionPerformed
    
    private void alinjustificadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alinjustificadaActionPerformed
        justificada();
    }//GEN-LAST:event_alinjustificadaActionPerformed
    private void negrita(){
    if (letranegrita==false){
            letranegrita=true;
            StyleConstants.setBold(estilo, true);
            btn_negrita.setIcon(new javax.swing.ImageIcon("src/Negrita1.png"));
            mnegrita.setSelected(true);
        } else {
            letranegrita=false;
            StyleConstants.setBold(estilo, false);
            btn_negrita.setIcon(new javax.swing.ImageIcon("src/Negrita.png"));
            mnegrita.setSelected(false);
        }
        estilo.addAttributes(estilo);
        texto.setParagraphAttributes(estilo, true);
    } 
    private void subrayado(){
        if (letrasubrayado==false)
        {
            letrasubrayado=true;
            btn_subrayado.setIcon(new javax.swing.ImageIcon("src/Subrayado1.png"));
            msubrayado.setSelected(true);
            StyleConstants.setUnderline(estilo, true);
        }
        else
        {
            letrasubrayado=false;
            btn_subrayado.setIcon(new javax.swing.ImageIcon("src/Subrayado.png"));
            StyleConstants.setUnderline(estilo, false);
            mcursiva.setSelected(false);
        }
        estilo.addAttributes(estilo);
        texto.setParagraphAttributes(estilo, true); 
    }
     private void cursiva(){
        if (letracursiva==false)
        {
            letracursiva=true;
            btn_cursiva.setIcon(new javax.swing.ImageIcon("src/Cursiva1.png"));
            mcursiva.setSelected(true);
            StyleConstants.setItalic(estilo, true);
            System.out.print("cursi activa");
        }
        else
        {
            letracursiva=false;
            btn_cursiva.setIcon(new javax.swing.ImageIcon("src/Cursiva.png"));
            StyleConstants.setItalic(estilo, false);
            mcursiva.setSelected(false);
            System.out.print("cursi  no activa");
        }
        estilo.addAttributes(estilo);
        texto.setParagraphAttributes(estilo, true); 
    }
    private void mnegritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnegritaActionPerformed
        negrita();
    }//GEN-LAST:event_mnegritaActionPerformed

    private void msubrayadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msubrayadoActionPerformed
        subrayado();
    }//GEN-LAST:event_msubrayadoActionPerformed

    private void mformatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mformatoMouseClicked

    }//GEN-LAST:event_mformatoMouseClicked
    

    private void mcursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcursivaActionPerformed
        cursiva();
    }//GEN-LAST:event_mcursivaActionPerformed

    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
        JOptionPane.showMessageDialog(null,"Editor de texto de Fray Luis Centro Académico","Información",1);
    }//GEN-LAST:event_acercaActionPerformed

    private void cacercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cacercaActionPerformed
       JOptionPane.showMessageDialog(null,"Editor de texto de Fray Luis Centro Académico","Información",1);
    }//GEN-LAST:event_cacercaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        alinizquierda.setSelected(true);
	btn_alin_izq.setSelected(true);
        mnegrita.setSelected(false);
        mcursiva.setSelected(false);
        msubrayado.setSelected(false);
        fondo_blanco.setSelected(true);
        StyleConstants.setFontFamily(estilo, "Times New Roman");
        StyleConstants.setFontSize(estilo,32);
        estilo.addAttributes(estilo);
        texto.setBackground (Color.white);
        btn_alin_izq.setIcon(new javax.swing.ImageIcon("src/Alin_izq1.png"));
    }//GEN-LAST:event_formWindowOpened

    private void fondo_azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondo_azulActionPerformed
        texto.setBackground (new Color (0, 0, 255,255));
    }//GEN-LAST:event_fondo_azulActionPerformed

    private void fondo_amarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondo_amarilloActionPerformed
        texto.setBackground (new Color (255, 255, 0,255));
    }//GEN-LAST:event_fondo_amarilloActionPerformed

    private void fondo_rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondo_rojoActionPerformed
        texto.setBackground (new Color (255, 0, 0,255));
    }//GEN-LAST:event_fondo_rojoActionPerformed

    private void fondo_blancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondo_blancoActionPerformed
        texto.setBackground (new Color (255, 255, 255,255));
    }//GEN-LAST:event_fondo_blancoActionPerformed

    private void bot_guardar_comoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_guardar_comoActionPerformed
        guardar_como();
    }//GEN-LAST:event_bot_guardar_comoActionPerformed

    private void bot_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cerrarActionPerformed
        cerrar();
    }//GEN-LAST:event_bot_cerrarActionPerformed
    private void btn_negritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_negritaActionPerformed
        negrita();
    }//GEN-LAST:event_btn_negritaActionPerformed
    private void btn_cursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cursivaActionPerformed
        cursiva();
    }//GEN-LAST:event_btn_cursivaActionPerformed
    private void btn_subrayadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subrayadoActionPerformed
        subrayado();
    }//GEN-LAST:event_btn_subrayadoActionPerformed
 
    private void btn_alin_izqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alin_izqActionPerformed
       izquierda();
    }//GEN-LAST:event_btn_alin_izqActionPerformed
    private void izquierda(){
        alinizquierda.setSelected(true);
        btn_alin_izq.setIcon(new javax.swing.ImageIcon("src/alin_izq1.png"));
        btn_alin_cent.setIcon(new javax.swing.ImageIcon("src/alin_cent.png"));
        btn_alin_der.setIcon(new javax.swing.ImageIcon("src/alin_der.png"));
        btn_alin_just.setIcon(new javax.swing.ImageIcon("src/alin_just.png"));
        StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_LEFT);
	estilo.addAttributes(estilo);
        texto.setParagraphAttributes(estilo, true);
    }
    private void centro(){
        alincentrada.setSelected(true);
        btn_alin_izq.setIcon(new javax.swing.ImageIcon("src/alin_izq.png"));
        btn_alin_cent.setIcon(new javax.swing.ImageIcon("src/alin_cent1.png"));
        btn_alin_der.setIcon(new javax.swing.ImageIcon("src/alin_der.png"));
        btn_alin_just.setIcon(new javax.swing.ImageIcon("src/alin_just.png"));
        StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_CENTER);
        estilo.addAttributes(estilo);
        texto.setParagraphAttributes(estilo, true);
    } 
     private void derecha(){
        alinderecha.setSelected(true); 
        btn_alin_izq.setIcon(new javax.swing.ImageIcon("src/alin_izq.png"));
        btn_alin_cent.setIcon(new javax.swing.ImageIcon("src/alin_cent.png"));
        btn_alin_der.setIcon(new javax.swing.ImageIcon("src/alin_der1.png"));
        btn_alin_just.setIcon(new javax.swing.ImageIcon("src/alin_just.png"));
        StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_RIGHT);
        estilo.addAttributes(estilo);
        texto.setParagraphAttributes(estilo, true);
    }
     private void justificada(){
        alinjustificada.setSelected(true);
        btn_alin_just.setSelected(true);
        btn_alin_izq.setIcon(new javax.swing.ImageIcon("src/alin_izq.png"));
        btn_alin_cent.setIcon(new javax.swing.ImageIcon("src/alin_cent.png"));
        btn_alin_der.setIcon(new javax.swing.ImageIcon("src/alin_der.png"));
        btn_alin_just.setIcon(new javax.swing.ImageIcon("src/alin_just1.png"));
        StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_JUSTIFIED);
        estilo.addAttributes(estilo);
        texto.setParagraphAttributes(estilo, true);  
    }
    private void btn_alin_centActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alin_centActionPerformed
        centro();
    }//GEN-LAST:event_btn_alin_centActionPerformed

    private void btn_alin_derActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alin_derActionPerformed
        derecha();
    }//GEN-LAST:event_btn_alin_derActionPerformed

    private void btn_alin_justActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alin_justActionPerformed
        justificada();
    }//GEN-LAST:event_btn_alin_justActionPerformed

    private void bot_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_imprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_bot_imprimirActionPerformed

    private void bot_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_abrirActionPerformed
        abrir();
    }//GEN-LAST:event_bot_abrirActionPerformed

    private void bot_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_guardarActionPerformed
        guardar();
    }//GEN-LAST:event_bot_guardarActionPerformed

    private void mguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mguardarActionPerformed
        guardar();
    }//GEN-LAST:event_mguardarActionPerformed

    private void mabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mabrirActionPerformed
        abrir();
    }//GEN-LAST:event_mabrirActionPerformed
    private void abrir(){
        
    }
    private void imprimir(){
        
    }
    private void guardar_como(){
        
    }
    private void guardar(){
        
    }
    private void cerrar(){
        System.exit(0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
            javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            }   catch (Exception e) {
		e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bloc3_Java().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar Barra_herramientas1;
    private javax.swing.JToolBar Barra_herramientas2;
    private javax.swing.JMenuItem acerca;
    private javax.swing.JRadioButtonMenuItem alincentrada;
    private javax.swing.JRadioButtonMenuItem alinderecha;
    private javax.swing.JRadioButtonMenuItem alinizquierda;
    private javax.swing.JRadioButtonMenuItem alinjustificada;
    private javax.swing.JToolBar barra_herramientas3;
    private javax.swing.JToolBar barra_herramientas4;
    private javax.swing.JMenuBar barramenu;
    private javax.swing.JButton bot_abrir;
    private javax.swing.JButton bot_cerrar;
    private javax.swing.JButton bot_guardar;
    private javax.swing.JButton bot_guardar_como;
    private javax.swing.JButton bot_imprimir;
    private javax.swing.ButtonGroup botonesalineacion;
    private javax.swing.JToggleButton btn_alin_cent;
    private javax.swing.JToggleButton btn_alin_der;
    private javax.swing.JToggleButton btn_alin_izq;
    private javax.swing.JToggleButton btn_alin_just;
    private javax.swing.JToggleButton btn_cursiva;
    private javax.swing.JToggleButton btn_negrita;
    private javax.swing.JToggleButton btn_subrayado;
    private javax.swing.JMenuItem cacerca;
    private javax.swing.ButtonGroup color_de_fondo;
    private javax.swing.JPopupMenu contextual;
    private javax.swing.JRadioButtonMenuItem fondo_amarillo;
    private javax.swing.JRadioButtonMenuItem fondo_azul;
    private javax.swing.JRadioButtonMenuItem fondo_blanco;
    private javax.swing.JRadioButtonMenuItem fondo_rojo;
    private javax.swing.ButtonGroup herram_alineacion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu m_color_fondo;
    private javax.swing.JMenuItem mabrir;
    private javax.swing.JMenu malineacion;
    private javax.swing.JMenu marchivo;
    private javax.swing.JMenuItem mcerrar;
    private javax.swing.JCheckBoxMenuItem mcursiva;
    private javax.swing.JMenu mformato;
    private javax.swing.JMenuItem mguardar;
    private javax.swing.JMenuItem mguardarcomo;
    private javax.swing.JMenuItem mimprimir;
    private javax.swing.JMenu minfo;
    private javax.swing.JCheckBoxMenuItem mnegrita;
    private javax.swing.JCheckBoxMenuItem msubrayado;
    private javax.swing.JTextPane texto;
    // End of variables declaration//GEN-END:variables
}
