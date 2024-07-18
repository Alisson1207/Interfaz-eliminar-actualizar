package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Form_actualizar {
    private JPanel panel;
    private JLabel lb_titulo;
    private JTextField tf_cedula;
    private JTextField tf_nombre;
    private JTextField tf_b2;
    private JLabel lb_cedula;
    private JLabel lb_nombre;
    private JLabel lb_b1;
    private JLabel lb_b2;
    private JTextField tf_b1;
    private JButton bt_actualizar;
    private JButton bt_eliminar;

    public Form_actualizar() {
        bt_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Estudiante estudiante = new Estudiante();
                estudiante.setCedula(tf_cedula.getText());
                estudiante.setNombre(tf_nombre.getText());
                estudiante.setB1(Float.parseFloat(tf_b1.getText()));


                String url = "jdbc:mysql://localhost:3306/clase02";
                String usuario = "root";
                String password = "123456";
                try(Connection connection = DriverManager.getConnection(url, usuario, password)){
                    String actualizar = "update estudiantePoo set b1='"++"', b2='"+estudiante.getNota2()+"' where cedula ='"+estudiante.getCedula()+"'";
                    PreparedStatement consultar = connection.prepareStatement(actualizar);
                    int consulta = consultar.executeUpdate();
                    if (consulta>0){
                        confirmacion.setText("El estudiante con cedula"+estudiante.getCedula()+"ha sido sactualizado correctamente");
                    } else {
                        confirmacion.setText("No se pudo actualizar el estudiante");
                    }
                }
                catch (SQLException exception){
                    System.out.println(exception.getMessage());
                }

            }
        });
    }
}

