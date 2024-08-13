package JANELA;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.Dimension;

public class Janelas {

    private static JDesktopPane jDesktopPane;

    public Janelas(JDesktopPane jDesktopPane) {
        Janelas.jDesktopPane = jDesktopPane;
    }

    public void janelas(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();
        } else {
            jDesktopPane.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
        Dimension dimensao = jInternalFrame.getDesktopPane().getSize();
        jInternalFrame.setLocation((dimensao.width - jInternalFrame.getSize().width) / 2, (dimensao.height - jInternalFrame.getSize().height) / 2);
    }
}
