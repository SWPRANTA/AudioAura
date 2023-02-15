package audioaura;

import javax.swing.SwingUtilities;

public class AudioAura {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow mainWindow = new MainWindow();
            }

        });
    }

}
