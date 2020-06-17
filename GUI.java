import javax.swing.*;
import javax.swing.JFrame;

public class GUI extends JPanel{
//    private Coordinate coordinate;

    /**
     * Graphical User Interface that takes in one input and calculates the score
     * until the user chooses to exit
     */
    public GUI(){
        String inputX, inputY, result;
        int again;
        double coordx, coordy;
        do{
            inputX = JOptionPane.showInputDialog("Enter a X coordinate: ");
            inputY = JOptionPane.showInputDialog("Enter a Y coordinate: ");
            coordx = Double.parseDouble(inputX);
            coordy = Double.parseDouble(inputY);
            result = "Your score is " + Darts.score(coordx, coordy);
            JOptionPane.showMessageDialog(null, result);
            again = JOptionPane.showConfirmDialog(null, "Restart?");
        }while(again == JOptionPane.YES_OPTION);

//        addMouseListener(new CoordinateListener());
//        setBackground(Color.black);
//        setPreferredSize(new Dimension(300, 300));
    }

//    static class Coordinate {
//        private int x, y;
//
//        Coordinate(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//        public int getX() {
//            return x;
//        }
//        public void setX(int x) {
//            this.x = x;
//        }
//        public int getY() {
//            return y;
//        }
//        public void setY(int y) {
//            this.y = y;
//        }
//    }
//    public void paint(Graphics g){
//        super.paint(g);
//        g.setColor(Color.white);
//        g.drawString("Coordinates: (" + x + ", " + y + ")", 5, 15);
//        setBackground (Color.lightGray);
//    }
//    private class CoordinateListener implements MouseListener {
//        public void mousePressed(MouseEvent e) {
//            x = e.getX();
//            y = e.getY();
//            repaint();
//        }
//        public void mouseReleased(MouseEvent e) {
//        }
//        public void mouseEntered(MouseEvent e) {}
//        public void mouseExited(MouseEvent e) {
//        }
//        public void mouseClicked(MouseEvent e) {
//        }
//    }

    /**
     * Driver Class
     * @param args
     */
    public static void main(String[] args){
//        JFrame frame = new JFrame("Bullseye");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI panel = new GUI();
//        frame.getContentPane().add(panel);
//        frame.pack();
//        frame.setVisible(true);
    }
}