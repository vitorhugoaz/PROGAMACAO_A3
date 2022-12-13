
package classes;

    
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

	public class background extends JDesktopPane{
	     private Image imagem;
	  	public background(){
		 }

	public background(String img){
	     if(img!=null){
		imagem = new ImageIcon(getClass().getResource(img)).getImage();
            }
        }

public background(Image imagemInicial){
	if(imagemInicial != null){
	  imagem = imagemInicial;
}
}

public void setImage(String img){
	if(img != null) {
	   imagem = new ImageIcon(getClass().getResource(img)).getImage();
        }else{
                imagem = null;
}

repaint();
}

@Override
public void paint(Graphics g) {
if (imagem != null) {
g.drawImage(imagem, 0, 0, getWidth(), getHeight(),this);
setOpaque(false);
}else{
setOpaque(true);
}
super.paint(g);
    }
}
