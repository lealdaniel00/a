import javax.sound.sampled.*;

public class AudioClip implements Runnable{
    @Override public void run(){
        try{
            String url = "C:/Users/danie/OneDrive/Escritorio/Codigo Jaa/Hilos1/SmoothCriminal.wav";
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(url)));
            sonido.start();
            while(sonido.isRunning()){
                Thread.sleep(250);
            }
            sonido.close();
        }catch(Exception ex){
            System.out.println(""+ex);
            AudioFileFormat.Type[] tipos = AudioSystem.getAudioFileTypes();
            System.out.println("Formatos soportados");
            for (AudioFileFormat.Type tipo : tipos){
                System.out.print(tipo.getExtension()+", ");
            }
            System.out.println("");
        }   
    }

}
