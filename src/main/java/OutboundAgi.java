import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.BaseAgiScript;

public class OutboundAgi extends BaseAgiScript {
    @Override
    public void service(AgiRequest agiRequest, AgiChannel agiChannel) throws AgiException {
        // Answer the channel...
        answer();

        // ...say hello...
        sayAlpha("welcome");

        // ...and hangup.
        hangup();


    }
}
