public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTV = new SmartTv();
        
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Canal Atual: " + smartTV.canal);

        smartTV.mudarCanal(13);

        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("TV ligada ? " + smartTV.ligada);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.ligar ();
        System.out.println("TV ligada ? " + smartTV.ligada);
        smartTV.desligar ();
        System.out.println("TV ligada ? " + smartTV.ligada);

    }
}
