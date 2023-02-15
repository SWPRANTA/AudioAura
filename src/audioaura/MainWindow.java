package audioaura;
import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame{
    public MainWindow(){
        super("AudioAura_MP3 Player");
        Container ctn = getContentPane();
        ctn.setLayout(null);
        
        JButton play = new JButton("Play");
        play.setBounds(150, 10, 200, 40);
       
        JButton pause = new JButton("Pause");
        pause.setBounds(150, 70, 200, 40);
        
        JButton next = new JButton("Next");
        next.setBounds(150, 130, 200, 40);
       
        JButton previous = new JButton("Previous");
        previous.setBounds(150, 190, 200, 40);
        
        ctn.add(play);
        ctn.add(pause);
        ctn.add(next);
        ctn.add(previous);
       
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
