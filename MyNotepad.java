import javax.swing.*;

import javax.swing.event.AncestorEvent;

import javax.swing.event.AncestorListener;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

public class MyNotepad {

    public void Create(){
        JFrame jf=new JFrame("Notepad");

        jf.setSize(500,500);

        JTextArea jt=new JTextArea("Write here ");

        jt.setBounds(100,150,500,500);

        jf.setLayout(null);

        jf.setVisible(true);

        JMenuBar jm=new JMenuBar();

        JMenuItem jit=new JMenuItem();

        JMenu file,edit;

        JMenuItem cut,copy,past,save,exit;

        cut= new JMenuItem("cut");

        copy =new JMenuItem("copy");

        save=new JMenuItem("save");

        past=new JMenuItem("past");

        exit=new JMenuItem("Exit");

        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             if(e.getSource()==cut){
                 jt.cut();
             }

            }
        });

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             if (e.getSource()==copy) {
                 jt.copy();
             }
            }
        });



        past.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(e.getSource()==past){
                  jt.paste();
              }
            }
        });



        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int a= JOptionPane.showConfirmDialog(jf,"You Want to exit");
              if(a==JOptionPane.YES_OPTION){
                  jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
              }
            }
        });
      
        file =new JMenu("file");

        file.add(save);

        file.add(exit);

        edit =new JMenu("Edit");

        edit.add(cut);

        edit.add(copy);

        edit.add(past);

        jm.add(file);

        jm.add(edit);

       jf.setJMenuBar(jm);

        jf.add(jm);

        jf.add(jit);


    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        jf.add(jt);

        jf.add(jm);

        jf.add(jit);

        jt.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {
                System.out.println("text area ");
            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {
                System.out.println("Romive ");
            }

            @Override
            public void ancestorMoved(AncestorEvent event) {

            }
        });


            jf.addWindowListener(new WindowAdapter() {
                @Override
                public void windowActivated(WindowEvent e) {
                    super.windowActivated(e);
                    System.out.println("Window Activated");
                }
                @Override
                public void windowDeactivated(WindowEvent e){
                    super.windowDeactivated(e);
                    System.out.println("Window Diactivated");
                }
                @Override
                public void windowClosing(WindowEvent e){
                    super.windowClosing(e);
                    System.out.println("Window is Closing ");
                }
            });
    }

    public static void main(String[] args) {
        MyNotepad np=new MyNotepad();
        np.Create();
    }
}
