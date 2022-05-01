import javax.swing.*;

import javax.swing.event.AncestorEvent;

import javax.swing.event.AncestorListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

public class Notepad {

    public void Create(){
        JFrame jf=new JFrame("Notepad");

        jf.setSize(500,500);

        JTextArea jt=new JTextArea("Write here ");

        jt.setBounds(10,20,700,700);


        jt.setBackground(Color.white);

        jf.setLayout(null);

        jf.setVisible(true);

        JMenuBar jm=new JMenuBar();

        JMenuItem jit=new JMenuItem();

        JMenu file,edit,view,setting;

       // JPopupMenu back,cut,copy;



//        JPopupMenu jp=new JPopupMenu();
//
//        back=new JPopupMenu("back");
//
//        cut=new JPopupMenu("cut");
//
//        copy=new JPopupMenu("copy");

//        back.addActionListener(new ActionListener() {
//            @Override
//            actionPerformed(ActionEvent e){} {
//                int a = JOptionPane.showConirmDialog(jf, "You Want to back");
//                if (a == JOptionPane.YES_OPTION) {
//                    jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
//                }
//            }


//        });
//        cut.addPopupMenuListener(new PopupMenuListener() {
//            @Override
//            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
//
//           if(e.getSource()==cut){
//                 jt.cut();
//             }
//
//
//            }
//
//        });
//        copy.addPopupMenuListener(new PopupMenuListener() {
//            @Override
//            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
//                if(e.getSource()==copy){
//                    jt.copy();
//                }
//            }
//
//
//        });

//
       JMenuItem past,save,cut,copy,exit,zoom,status;

        cut= new JMenuItem("cut");

        copy =new JMenuItem("copy");

        save=new JMenuItem("save");

      past=new JMenuItem("past");

        exit=new JMenuItem("Exit");

        zoom=new JMenuItem("Zoom");

        status=new JMenuItem("status");

         //zoom =new JMenuItem("Zoom");

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
        zoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==zoom){
                    jt.show();
                }
            }
        });

        status.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Read Given Text ");
            }
        });
//        zoom.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(e.getSource()==zoom){
//                    jt.zo
//                }
//            }
//        });

        file =new JMenu("file");

        file.add(save);

        file.add(exit);

        edit =new JMenu("Edit");

        edit.add(cut);

        view =new JMenu("View");

         view.add(zoom);

         view.add(status);

         setting =new JMenu("Setting ");




        edit.add(copy);

         // edit.add(zoom);

        edit.add(past);

        jm.add(file);

       jm.add(edit);

       jm.add(view);

       jm.add(setting);

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
        Notepad np=new Notepad();
        np.Create();
    }
}
