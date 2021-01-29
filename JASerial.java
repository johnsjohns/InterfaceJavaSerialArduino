import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.fazecast.jSerialComm.SerialPort;

public class JASerial {
    private SerialPort port[], porta;
    private int address = 0;

    public JASerial(){
        port = SerialPort.getCommPorts();
    }

   public String[] getPort(){
       port = null;
       port = SerialPort.getCommPorts();
       String[] portas = new String[port.length];
       for(int i = 0; i < port.length; i++){
           portas[i] = port[i].getSystemPortName();
       }
       return portas;
   }

   public void setPort(int port){
       this.address = port;
   }

   public void connect(){
       port[address].openPort();
       port[address].setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 100, 0);
   }

   public void close(){
       port[address].closePort();
   }

   public void sendString(String value ){
      
       try{
           OutputStream out = port[address].getOutputStream();
           int count = 0;
           while (count <= value.length()-1){
               out.write(value.charAt(count));
               count++;
           }
           out.close();
       } catch (IOException e){
           e.printStackTrace();
       }
       receive();
   }

   public void receive(){
       InputStream in = port[address].getInputStream();
       try {
           for (int j = 0; j < 1000; ++j)
            System.out.print((char)in.read());
            in.close();
    } catch (Exception e) { e.printStackTrace(); }
    
   }
}