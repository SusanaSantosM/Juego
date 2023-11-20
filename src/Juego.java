/**
 * @author Susana
 * @version v1.0
 */
import javax.swing.JOptionPane;
public class Juego {
  private int numeroAdivinar;
  private int intentosMax;

  /**
   *  Constructor
   * @param numeroAdivinar
   * @param intentosMax para adivinar el número
   */
  public Juego(int numeroAdivinar, int intentosMax){
    this.numeroAdivinar = numeroAdivinar;
    this.intentosMax = intentosMax;

  }
  public void jugar(){
    /**
     * Método para intentar divinar el número
     * @param NumeroUsuario
     * @param intento las veces que se trata de adivinar el número
     */
    for(int intentos = 1; intentos<=intentosMax; intentos++) {
      int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Intento " +intentos+ " : Ingresa un número entre 1 y 50: "));

      if(numeroUsuario == numeroAdivinar){
        String intento = null;
        JOptionPane.showMessageDialog(null, "¡Adivinaste el número! " +numeroAdivinar+ " en " +intentos+ "intentos. ");
        break;
      } else if(numeroUsuario < numeroAdivinar){
        JOptionPane.showMessageDialog(null, "El número a adivinar es mayor.");
      } else {
        JOptionPane.showMessageDialog(null, "El número a adivinar es menor.");
      }
      if(intentos == intentosMax){
        JOptionPane.showMessageDialog(null, "¡Lo siento! Ya no hay más intentos. El número correcto era " +numeroAdivinar);
      }
    }
  }
}
