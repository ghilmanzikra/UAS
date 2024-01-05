package uasPf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.Scanner;


public class UasPf {
    public static void main(String[] args) {
        JFrame frame = new JFrame("UasPf");
        frame.setContentPane(new UasPf().jPUas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel jPUas;
    private JButton prosesButton;
    private JTextField tfInput;
    private JTextArea textArea1;


    public UasPf() {
        tfInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int jumlahAngka;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Masukkan Jumlah Angka: ");
                jumlahAngka = scanner.nextInt();

                double angka = Double.parseDouble(tfInput.getText());

            }
        });

        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double jumlahGanjil;
                double jumlahGenap;
                int angka  = 0;

                for (angka = 0; angka <= angka; angka++){
                    if (angka % 2 == 0){
                        System.out.println("" + angka + "--> GENAP");
                    }else{
                        System.out.println("" + angka + "--> GANJIL");
                    }
                    break;
                }
            }
        });

            System.out.println("TOTAL PENJUMLAHAN: ");
            System.out.println("RATA-RATA: ");
    }
}


