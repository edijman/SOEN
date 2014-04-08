package ChessGameKenai;
import java.awt.Color;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;

public class setProperty {

	private Chess_Data data;
	public void setPlayerIconPath(Object object) {
        Packet packet = (Packet) object;
        if (data.isServer()) {
            data.getPlayers().get(1).setImagePath(packet.getPlayerIconPath());
        } else {
            data.getPlayers().get(0).setImagePath(packet.getPlayerIconPath());
        }
        data.notifyView();
    }

    /**
     * The method setGuestName simply sets the guest name
     * of the player this method is used to update the view of the client
     * when a client changes his name the name is send to the other client that is connected
     * so he would also see that name changed
     * @param object as an Object
     */
    public void setGuestName(Object object) {
        Packet packet = (Packet) object;
        if (data.isServer()) {
            data.getPlayers().get(1).setName(packet.getGuestName());
        } else {
            data.getPlayers().get(0).setName(packet.getGuestName());
        }
        data.notifyView();
    }
}
