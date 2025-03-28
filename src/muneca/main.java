/* Diego Gabriel López Bernal */
package muneca;

import javax.swing.SwingUtilities;


public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Muneca frame = new Muneca();
            frame.setVisible(true);
        });
    }
}
