import com.fazecast.jSerialComm.SerialPort;

public class DataReceiver implements Runnable {
    public SerialPort comPort;
    String dataReceived;
    public DataReceiver(SerialPort comPort ){
        this.comPort =comPort;
    }

     @Override
	public void run() {
        try {
            byte[] readBuffer = new byte[comPort.bytesAvailable()];
            while (true)
            {
               while (comPort.bytesAvailable() == 0)
                  Thread.sleep(20);
               
               if(comPort.readBytes(readBuffer, readBuffer.length) > 0){
               dataReceived = new String(readBuffer);
               System.out.println(dataReceived);
               }
               readBuffer = new byte[comPort.bytesAvailable()];
               
            }
         } catch (Exception e) { e.printStackTrace(); }
		
	}
}