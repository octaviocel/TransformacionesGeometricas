/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author DELL
 */
public class TranformacionLineal extends javax.swing.JFrame {

    private BufferedImage imagen;
    private File seleccion;

    public TranformacionLineal() {
        initComponents();
        this.setLocationRelativeTo(null);
        ButtonGroup group = new ButtonGroup();
        group.add(rdDeformacion);
        group.add(rdRota);
        group.add(rdEscalado);
        group.add(rdTraslacion);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(rdHori);
        group1.add(rdVerti);

        setNoVisible();
    }

    private void setNoVisible() {
        slTranlacionX.setVisible(false);
        slTranlacionY.setVisible(false);
        lblX.setVisible(false);
        lblY.setVisible(false);
        spX.setVisible(false);
        spY.setVisible(false);

        lblRota.setVisible(false);
        spRotar.setVisible(false);

        lblEscala.setVisible(false);
        spEscala.setVisible(false);

        rdHori.setVisible(false);
        rdVerti.setVisible(false);
        spDeformacion.setVisible(false);
        btnAplicar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnImportar = new javax.swing.JButton();
        rdTraslacion = new javax.swing.JRadioButton();
        rdRota = new javax.swing.JRadioButton();
        rdEscalado = new javax.swing.JRadioButton();
        rdDeformacion = new javax.swing.JRadioButton();
        slTranlacionX = new javax.swing.JSlider();
        lblX = new javax.swing.JLabel();
        lblY = new javax.swing.JLabel();
        slTranlacionY = new javax.swing.JSlider();
        spX = new javax.swing.JSpinner();
        spY = new javax.swing.JSpinner();
        spRotar = new javax.swing.JSpinner();
        lblRota = new javax.swing.JLabel();
        btnAplicar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        lblEscala = new javax.swing.JLabel();
        spEscala = new javax.swing.JSpinner();
        rdHori = new javax.swing.JRadioButton();
        rdVerti = new javax.swing.JRadioButton();
        spDeformacion = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Indivisa Text Sans", 1, 14)); // NOI18N
        jLabel2.setText("Imagen");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Indivisa Text Sans", 1, 14)); // NOI18N
        jLabel3.setText("Transformaciones lineales");

        btnImportar.setText("Importar Imagen");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        rdTraslacion.setText("Traslación");
        rdTraslacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdTraslacionActionPerformed(evt);
            }
        });

        rdRota.setText("Rotación");
        rdRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdRotaActionPerformed(evt);
            }
        });

        rdEscalado.setText("Escalado");
        rdEscalado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdEscaladoActionPerformed(evt);
            }
        });

        rdDeformacion.setText("Deformación");
        rdDeformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDeformacionActionPerformed(evt);
            }
        });

        slTranlacionX.setMaximum(300);
        slTranlacionX.setMinimum(-300);
        slTranlacionX.setValue(0);
        slTranlacionX.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slTranlacionXStateChanged(evt);
            }
        });

        lblX.setText("X:");

        lblY.setText("Y:");

        slTranlacionY.setMaximum(300);
        slTranlacionY.setMinimum(-300);
        slTranlacionY.setToolTipText("");
        slTranlacionY.setValue(0);
        slTranlacionY.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slTranlacionYStateChanged(evt);
            }
        });

        spX.setModel(new javax.swing.SpinnerNumberModel(0, -300, 300, 1));
        spX.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spXStateChanged(evt);
            }
        });

        spY.setModel(new javax.swing.SpinnerNumberModel(0, -300, 300, 1));
        spY.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spYStateChanged(evt);
            }
        });

        spRotar.setModel(new javax.swing.SpinnerNumberModel(0, -360, 360, 1));

        lblRota.setText("Angulos    (°)");

        btnAplicar.setText("Aplicar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        lblEscala.setText("Escalar      N veces");

        spEscala.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        rdHori.setText("Horizontal");
        rdHori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdHoriActionPerformed(evt);
            }
        });

        rdVerti.setText("Vertical");

        spDeformacion.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.1d));

        jLabel4.setFont(new java.awt.Font("Indivisa Text Sans", 1, 14)); // NOI18N
        jLabel4.setText("Acciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(rdTraslacion)
                .addGap(68, 68, 68)
                .addComponent(rdRota)
                .addGap(72, 72, 72)
                .addComponent(rdEscalado)
                .addGap(64, 64, 64)
                .addComponent(rdDeformacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRestaurar)
                .addGap(50, 50, 50)
                .addComponent(btnAplicar)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3)
                        .addGap(192, 192, 192)
                        .addComponent(btnImportar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblY, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblX, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slTranlacionX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slTranlacionY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEscala)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRota)
                                        .addGap(63, 63, 63)
                                        .addComponent(spRotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rdHori)
                                .addGap(18, 18, 18)
                                .addComponent(rdVerti)
                                .addGap(32, 32, 32)
                                .addComponent(spDeformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(176, 176, 176))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnImportar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slTranlacionX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblX)
                                .addComponent(spX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblY)
                                    .addComponent(spY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(slTranlacionY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spRotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRota))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEscala)
                            .addComponent(spEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdHori)
                            .addComponent(rdVerti)
                            .addComponent(spDeformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdTraslacion)
                    .addComponent(rdDeformacion)
                    .addComponent(rdEscalado)
                    .addComponent(rdRota)
                    .addComponent(btnAplicar)
                    .addComponent(btnRestaurar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        File imagenSeleccionada;
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Seleccione una imagen");
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG & GIF & BMP", "jpg", "gif", "bmp");
        selector.setFileFilter(filtroImagen);
        int flag = selector.showOpenDialog(this);
        if (flag == JFileChooser.APPROVE_OPTION) {
            try {
                imagenSeleccionada = selector.getSelectedFile();
                seleccion = imagenSeleccionada;
                this.imagen = ImageIO.read(imagenSeleccionada);
                setImagenPanel();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void rdTraslacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdTraslacionActionPerformed
        setNoVisible();
        slTranlacionX.setVisible(true);
        slTranlacionY.setVisible(true);
        lblX.setVisible(true);
        lblY.setVisible(true);
        spX.setVisible(true);
        spY.setVisible(true);
        btnAplicar.setEnabled(false);
    }//GEN-LAST:event_rdTraslacionActionPerformed

    private void slTranlacionXStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slTranlacionXStateChanged
        if (lblImagen != null) {
            try {
                BufferedImage copia = ImageIO.read(seleccion);
                Integer ancho = copia.getWidth();
                Integer alto = copia.getHeight();
                int pixel = 0;
                int nuevai = 0;
                int nuevaj = 0;
                spX.setValue((int) slTranlacionX.getValue());
                for (int i = 0; i < ancho; i++) {
                    for (int j = 0; j < alto; j++) {
                        int x = (int) slTranlacionX.getValue();
                        int y = (int) slTranlacionY.getValue();
                        nuevai = i + x;
                        nuevaj = j + y;
                        try {
                            pixel = imagen.getRGB(nuevai, nuevaj);
                        } catch (Exception e) {
                            pixel = Color.BLACK.getRGB();
                        }
                        copia.setRGB(i, j, pixel);
                    }
                }
                this.lblImagen.setIcon(new ImageIcon(copia));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_slTranlacionXStateChanged

    private void slTranlacionYStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slTranlacionYStateChanged
        if (lblImagen != null) {
            try {
                BufferedImage copia = ImageIO.read(seleccion);
                Integer ancho = copia.getWidth();
                Integer alto = copia.getHeight();
                int pixel = 0;
                int nuevai = 0;
                int nuevaj = 0;
                spX.setValue((int) slTranlacionX.getValue());
                for (int i = 0; i < ancho; i++) {
                    for (int j = 0; j < alto; j++) {
                        int x = (int) slTranlacionX.getValue();
                        int y = (int) slTranlacionY.getValue();
                        nuevai = i + x;
                        nuevaj = j + y;
                        try {
                            pixel = imagen.getRGB(nuevai, nuevaj);
                        } catch (Exception e) {
                            pixel = Color.BLACK.getRGB();
                        }
                        copia.setRGB(i, j, pixel);
                    }
                }
                this.lblImagen.setIcon(new ImageIcon(copia));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_slTranlacionYStateChanged

    private void spXStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spXStateChanged
        slTranlacionX.setValue((int) spX.getValue());
    }//GEN-LAST:event_spXStateChanged

    private void spYStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spYStateChanged
        slTranlacionY.setValue((int) spY.getValue());
    }//GEN-LAST:event_spYStateChanged

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        if (imagen != null) {
            if (rdRota.isSelected()) {
                try {
                    BufferedImage copia = ImageIO.read(seleccion);
                    Integer ancho = copia.getWidth();
                    Integer alto = copia.getHeight();
                    int pixel = 0;
                    int nueva_x = 0;
                    int nueva_y = 0;
                    int xc = ancho / 2;
                    int yc = alto / 2;

                    for (int i = 0; i < ancho; i++) {
                        for (int j = 0; j < alto; j++) {
                            double angulo = Math.toRadians((int) spRotar.getValue());
                            nueva_x = (int) (xc + ((i - xc) * Math.cos(angulo)) - ((j - yc) * Math.sin(angulo)));
                            nueva_y = (int) (yc + ((i - xc) * Math.sin(angulo)) + ((j - yc) * Math.cos(angulo)));

                            try {
                                pixel = imagen.getRGB(nueva_x, nueva_y);
                            } catch (Exception e) {
                                pixel = Color.BLACK.getRGB();
                            }
                            copia.setRGB(i, j, pixel);
                        }
                    }
                    this.lblImagen.setIcon(new ImageIcon(copia));
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (rdEscalado.isSelected()) {
                JLabel imagenNueva = new JLabel();
                double escala = 0;
                int nuevo_ancho = 0;
                int nuevo_alto = 0;
                escala = (int) spEscala.getValue();
                nuevo_ancho = (int) Math.floor(imagen.getWidth() * escala);
                nuevo_alto = (int) Math.floor(imagen.getHeight() * escala);
                Image nueva = imagen.getScaledInstance(nuevo_ancho, nuevo_alto, Image.SCALE_SMOOTH);
                imagenNueva.setIcon(new ImageIcon(nueva));
                JDialog dlg = new JDialog(this);
                dlg.setSize(new Dimension(nuevo_ancho, nuevo_alto));
                dlg.setLocationRelativeTo(null);
                dlg.add(imagenNueva);
                dlg.setVisible(true);
            }
            if (rdDeformacion.isSelected()) {
                Integer ancho = imagen.getWidth();
                Integer alto = imagen.getHeight();
                JLabel imagenNueva = new JLabel();
                double escala = 0;
                int nuevo_ancho = 0;
                int nuevo_alto = 0;

                if (rdHori.isSelected()) {
                    escala = (double) spDeformacion.getValue();
                    nuevo_ancho = (int) (ancho + Math.floor(ancho * escala));
                    nuevo_alto = alto;
                } else if (rdVerti.isSelected()) {
                    escala = (double) spDeformacion.getValue();
                    nuevo_ancho = ancho;
                    nuevo_alto = (int) (alto + Math.floor(alto * escala));
                }

                BufferedImage copia = new BufferedImage(nuevo_ancho, nuevo_alto, BufferedImage.TYPE_INT_RGB);
                int pixel = 0, nueva_x = 0, nueva_y = 0;

                for (int x = 0; x < imagen.getWidth(); x++) {
                    for (int y = 0; y < imagen.getHeight(); y++) {
                        pixel = imagen.getRGB(x, y);
                        if (rdHori.isSelected()) {
                            nueva_x = (int) (x + (escala * y));
                            nueva_y = y;
                        } else if (rdVerti.isSelected()) {
                            nueva_x = x;
                            nueva_y = (int) (y + (escala * x));
                        }
                        try {
                            copia.setRGB(nueva_x, nueva_y, pixel);
                        } catch (Exception e) {
                            copia.setRGB(x, y, pixel);
                        }
                    }
                }
                imagenNueva = new JLabel(new ImageIcon(copia));

                JDialog dlg = new JDialog(this);
                dlg.setSize(new Dimension(nuevo_ancho, nuevo_alto));
                dlg.setLocationRelativeTo(null);
                dlg.add(imagenNueva);
                dlg.setVisible(true);

            }
        }
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        setImagenPanel();
        spDeformacion.setValue(0);
        spEscala.setValue(0);
        spRotar.setValue(0);
        spX.setValue(0);
        spY.setValue(0);
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void rdHoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdHoriActionPerformed
        
    }//GEN-LAST:event_rdHoriActionPerformed

    private void rdRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdRotaActionPerformed
        setNoVisible();
        lblRota.setVisible(true);
        spRotar.setVisible(true);
    }//GEN-LAST:event_rdRotaActionPerformed

    private void rdEscaladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdEscaladoActionPerformed
        setNoVisible();
        lblEscala.setVisible(true);
        spEscala.setVisible(true);
    }//GEN-LAST:event_rdEscaladoActionPerformed

    private void rdDeformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDeformacionActionPerformed
        setNoVisible();
        rdHori.setVisible(true);
        rdVerti.setVisible(true);
        spDeformacion.setVisible(true);
    }//GEN-LAST:event_rdDeformacionActionPerformed

    private void setImagenPanel() {
        if (seleccion != null) {
            ImageIcon icon = new ImageIcon(new ImageIcon(seleccion.getPath()).getImage().getScaledInstance(600, 350, Image.SCALE_DEFAULT));
            // this.icono = icon;
            Image image = icon.getImage();
            this.imagen = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            Graphics2D bGr = imagen.createGraphics();
            bGr.drawImage(image, 0, 0, null);
            bGr.dispose();
            lblImagen.setIcon(icon);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TranformacionLineal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEscala;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblRota;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblY;
    private javax.swing.JRadioButton rdDeformacion;
    private javax.swing.JRadioButton rdEscalado;
    private javax.swing.JRadioButton rdHori;
    private javax.swing.JRadioButton rdRota;
    private javax.swing.JRadioButton rdTraslacion;
    private javax.swing.JRadioButton rdVerti;
    private javax.swing.JSlider slTranlacionX;
    private javax.swing.JSlider slTranlacionY;
    private javax.swing.JSpinner spDeformacion;
    private javax.swing.JSpinner spEscala;
    private javax.swing.JSpinner spRotar;
    private javax.swing.JSpinner spX;
    private javax.swing.JSpinner spY;
    // End of variables declaration//GEN-END:variables
}
