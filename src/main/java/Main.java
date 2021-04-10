import org.apache.logging.log4j.*;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        

        int iteration = Integer.parseInt(args[0]);

        Marker declarativeMarker = MarkerManager.getMarker("Declarative");
        Marker questionMarker = MarkerManager.getMarker("Question");
        Marker  noMarker= MarkerManager.getMarker("Nomark");
        Logger logger = LogManager.getLogger();
        Thread t = new Thread();


        for(int i =1; i<=iteration; i++){
            ThreadContext.put("iteration",String.valueOf(i));
            logger.error("Nesze hát a rózsavíz,");
            logger.fatal(declarativeMarker, "Gyöngyöm, gyöngyvirágom.");
            logger.error(questionMarker, "Hol a tojás, piros tojás?");
            logger.fatal(declarativeMarker, "Tarisznyámba várom.");
            logger.error(questionMarker,"Szabad-e locsolni?");
            t.sleep(1500);
        }
    }
}
