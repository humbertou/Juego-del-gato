package vista;

import controlador.ControladorGato;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JOptionPane;

/**
 * Esta clase es la encargada de establecer la interfaz del juego del gato.
 * Tiene como atributos un arreglo de imágenes para los botones, el turno 
 * y una instancia a la clase controlador (para que establezca la comunicación
 * con la lógica)
 * 
 * @version 15 de junio 2016 
 * @author Humberto
 */
public class VentanaGato extends javax.swing.JFrame {

    /**
     * Creates new form VentanaGato
     */
    private controlador.ControladorGato controlador;
    private int turno;
    private final ImageIcon[] arregloImagenBoton; 
    
    public VentanaGato() {
        this.turno = 0;
        this.controlador = new ControladorGato();
        this.arregloImagenBoton = new ImageIcon[2];
        this.arregloImagenBoton[0] = new ImageIcon("letraO.png");
        this.arregloImagenBoton[1] = new ImageIcon("letraX.gif");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pnlGato = new javax.swing.JPanel();
        btnIzqArriba = new javax.swing.JButton();
        btnIzqCentro = new javax.swing.JButton();
        btnIzqAbajo = new javax.swing.JButton();
        btnCentroArriba = new javax.swing.JButton();
        btnCentroCentro = new javax.swing.JButton();
        btnCentroAbajo = new javax.swing.JButton();
        btnDerArriba = new javax.swing.JButton();
        btnDerCentro = new javax.swing.JButton();
        btnDerAbajo = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juego del gato");
        setResizable(false);

        pnlGato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnIzqArriba.setMaximumSize(new java.awt.Dimension(73, 71));
        btnIzqArriba.setMinimumSize(new java.awt.Dimension(73, 71));
        btnIzqArriba.setPreferredSize(new java.awt.Dimension(73, 71));
        btnIzqArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqArribaActionPerformed(evt);
            }
        });

        btnIzqCentro.setMaximumSize(new java.awt.Dimension(73, 71));
        btnIzqCentro.setMinimumSize(new java.awt.Dimension(73, 71));
        btnIzqCentro.setPreferredSize(new java.awt.Dimension(73, 71));
        btnIzqCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqCentroActionPerformed(evt);
            }
        });

        btnIzqAbajo.setMaximumSize(new java.awt.Dimension(73, 71));
        btnIzqAbajo.setMinimumSize(new java.awt.Dimension(73, 71));
        btnIzqAbajo.setPreferredSize(new java.awt.Dimension(73, 71));
        btnIzqAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqAbajoActionPerformed(evt);
            }
        });

        btnCentroArriba.setMaximumSize(new java.awt.Dimension(73, 71));
        btnCentroArriba.setMinimumSize(new java.awt.Dimension(73, 71));
        btnCentroArriba.setPreferredSize(new java.awt.Dimension(73, 71));
        btnCentroArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroArribaActionPerformed(evt);
            }
        });

        btnCentroCentro.setMaximumSize(new java.awt.Dimension(73, 71));
        btnCentroCentro.setMinimumSize(new java.awt.Dimension(73, 71));
        btnCentroCentro.setPreferredSize(new java.awt.Dimension(73, 71));
        btnCentroCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroCentroActionPerformed(evt);
            }
        });

        btnCentroAbajo.setMaximumSize(new java.awt.Dimension(73, 71));
        btnCentroAbajo.setMinimumSize(new java.awt.Dimension(73, 71));
        btnCentroAbajo.setPreferredSize(new java.awt.Dimension(73, 71));
        btnCentroAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroAbajoActionPerformed(evt);
            }
        });

        btnDerArriba.setMaximumSize(new java.awt.Dimension(73, 71));
        btnDerArriba.setMinimumSize(new java.awt.Dimension(73, 71));
        btnDerArriba.setPreferredSize(new java.awt.Dimension(73, 71));
        btnDerArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerArribaActionPerformed(evt);
            }
        });

        btnDerCentro.setMaximumSize(new java.awt.Dimension(73, 71));
        btnDerCentro.setMinimumSize(new java.awt.Dimension(73, 71));
        btnDerCentro.setPreferredSize(new java.awt.Dimension(73, 71));
        btnDerCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerCentroActionPerformed(evt);
            }
        });

        btnDerAbajo.setMaximumSize(new java.awt.Dimension(73, 71));
        btnDerAbajo.setMinimumSize(new java.awt.Dimension(73, 71));
        btnDerAbajo.setPreferredSize(new java.awt.Dimension(73, 71));
        btnDerAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerAbajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGatoLayout = new javax.swing.GroupLayout(pnlGato);
        pnlGato.setLayout(pnlGatoLayout);
        pnlGatoLayout.setHorizontalGroup(
            pnlGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGatoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIzqAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIzqCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIzqArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(pnlGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCentroCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCentroArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCentroAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pnlGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDerAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDerArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDerCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        pnlGatoLayout.setVerticalGroup(
            pnlGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGatoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlGatoLayout.createSequentialGroup()
                        .addComponent(btnCentroArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnCentroCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCentroAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlGatoLayout.createSequentialGroup()
                            .addComponent(btnDerArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDerCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDerAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlGatoLayout.createSequentialGroup()
                            .addComponent(btnIzqArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnIzqCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnIzqAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setText("Juego del Gato: Es para dos jugadores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlGato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    Métodos set y get
    */
    public ControladorGato getControlador() {
        return controlador;
    }

    public void setControlador(ControladorGato controlador) {
        this.controlador = controlador;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    /**
     * Este método se llama para cambiar el turno luego de apretar un botón.
     * El turno 0 es el jugador 1 y el turno 1 es el jugador 2.
     */
    public void cambiarTurno(){
        if (getTurno() == 0){
            setTurno(1);
        }
        else {
            setTurno(0);
        }
    }
    
    /**
    * Este método muestra un jOoptionPane para saber si quiere seguir jugando o
    * no. 
    * 
    */
    public void mostrarMensajeGanador(){
        int resultado, respuesta;
        resultado = getControlador().establecerGanador();
        if (resultado == 0){
            respuesta = JOptionPane.showConfirmDialog(null,  "¿Jugar de Nuevo?", "Ganó Jugador "
                    + Integer.toString(this.turno+1),
                    JOptionPane.YES_NO_OPTION);
            generarAccionRespuesta(respuesta);
            
        }
        else if (resultado == 1){
            respuesta = JOptionPane.showConfirmDialog (null,  "¿Jugar de Nuevo?", "Empate",
                    JOptionPane.YES_NO_OPTION);
            generarAccionRespuesta(respuesta);
            
        }   
    }
    
    /**
    * Este método genera la accion de la respuesta del option pane luego de 
    * terminar el juego. Si la respuesta es si resetea el juego y si no cierra
    * la ventana. 
    * 
    * @param pRespuesta la respuesta que recibe del option pane
    */
    public void generarAccionRespuesta (int pRespuesta){
        if (pRespuesta == JOptionPane.YES_OPTION){
                resetearJuego();
            }
            else{
                this.dispose();
            }
    }
    
    /**
    * Este método restablece los valores originales de los botones en
    * la pantalla de juego. Los íconos los pone en null y los vuelve a
    * habililtar
    * 
    */
    public void resetearJuego(){
        btnCentroAbajo.setEnabled(true);
        btnCentroArriba.setEnabled(true);
        btnCentroCentro.setEnabled(true);
        btnIzqAbajo.setEnabled(true);
        btnIzqArriba.setEnabled(true);
        btnIzqCentro.setEnabled(true);
        btnDerAbajo.setEnabled(true);
        btnDerArriba.setEnabled(true);
        btnDerCentro.setEnabled(true);
        btnCentroAbajo.setIcon(null);
        btnCentroArriba.setIcon(null);
        btnCentroCentro.setIcon(null);
        btnIzqAbajo.setIcon(null);
        btnIzqArriba.setIcon(null);
        btnIzqCentro.setIcon(null);
        btnDerAbajo.setIcon(null);
        btnDerArriba.setIcon(null);
        btnDerCentro.setIcon(null);
        getControlador().resetearJuego();
        setTurno(0);
    }
    
    /*
     * 
     * Botones de la interfaz. 
     */
    private void btnIzqArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqArribaActionPerformed
        getControlador().recibirPosicion(0, 0);
        btnIzqArriba.setIcon(this.arregloImagenBoton[getTurno()]);
        btnIzqArriba.setEnabled(false);
        getControlador().cambiarTurno();
        mostrarMensajeGanador();
        cambiarTurno();
    }//GEN-LAST:event_btnIzqArribaActionPerformed

    private void btnIzqCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqCentroActionPerformed
        getControlador().recibirPosicion(0, 1);
        btnIzqCentro.setIcon(this.arregloImagenBoton[getTurno()]);
        btnIzqCentro.setEnabled(false);
        getControlador().cambiarTurno();
        mostrarMensajeGanador();
        cambiarTurno();
    }//GEN-LAST:event_btnIzqCentroActionPerformed

    private void btnIzqAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqAbajoActionPerformed
        getControlador().recibirPosicion(0, 2);
        btnIzqAbajo.setIcon(this.arregloImagenBoton[getTurno()]);
        btnIzqAbajo.setEnabled(false);
        getControlador().cambiarTurno();
        mostrarMensajeGanador();
        cambiarTurno();
    }//GEN-LAST:event_btnIzqAbajoActionPerformed

    private void btnCentroArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroArribaActionPerformed
        getControlador().recibirPosicion(1, 0);
        btnCentroArriba.setIcon(this.arregloImagenBoton[getTurno()]);
        btnCentroArriba.setEnabled(false);
        getControlador().cambiarTurno();
        mostrarMensajeGanador();
        cambiarTurno();
    }//GEN-LAST:event_btnCentroArribaActionPerformed

    private void btnCentroCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroCentroActionPerformed
        getControlador().recibirPosicion(1, 1);
        btnCentroCentro.setIcon(this.arregloImagenBoton[getTurno()]);
        btnCentroCentro.setEnabled(false);
        getControlador().cambiarTurno();
        mostrarMensajeGanador();
        cambiarTurno();
    }//GEN-LAST:event_btnCentroCentroActionPerformed

    private void btnCentroAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroAbajoActionPerformed
        getControlador().recibirPosicion(1, 2);
        btnCentroAbajo.setIcon(this.arregloImagenBoton[getTurno()]);
        btnCentroAbajo.setEnabled(false);
        getControlador().cambiarTurno();
        mostrarMensajeGanador();
        cambiarTurno();
    }//GEN-LAST:event_btnCentroAbajoActionPerformed

    private void btnDerArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerArribaActionPerformed
        getControlador().recibirPosicion(2, 0);
        btnDerArriba.setIcon(this.arregloImagenBoton[getTurno()]);
        btnDerArriba.setEnabled(false);
        getControlador().cambiarTurno();
        mostrarMensajeGanador();
        cambiarTurno();
    }//GEN-LAST:event_btnDerArribaActionPerformed

    private void btnDerCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerCentroActionPerformed
        getControlador().recibirPosicion(2, 1);
        btnDerCentro.setIcon(this.arregloImagenBoton[getTurno()]);
        btnDerCentro.setEnabled(false);
        getControlador().cambiarTurno();
        mostrarMensajeGanador();
        cambiarTurno();
    }//GEN-LAST:event_btnDerCentroActionPerformed

    private void btnDerAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerAbajoActionPerformed
        getControlador().recibirPosicion(2, 2);
        btnDerAbajo.setIcon(this.arregloImagenBoton[getTurno()]);
        btnDerAbajo.setEnabled(false);
        getControlador().cambiarTurno();
        mostrarMensajeGanador();
        cambiarTurno();
    }//GEN-LAST:event_btnDerAbajoActionPerformed
    
    /**
    * Crea la instancia de ventana de gato y la pone visible. 
    * A su vez pone los parámetros de look and feel para 
    * Windows.
    *
    */
    public void iniciarVentana(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e){
            System.out.println("UIManager Exception : "+e);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentroAbajo;
    private javax.swing.JButton btnCentroArriba;
    private javax.swing.JButton btnCentroCentro;
    private javax.swing.JButton btnDerAbajo;
    private javax.swing.JButton btnDerArriba;
    private javax.swing.JButton btnDerCentro;
    private javax.swing.JButton btnIzqAbajo;
    private javax.swing.JButton btnIzqArriba;
    private javax.swing.JButton btnIzqCentro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlGato;
    // End of variables declaration//GEN-END:variables
}
