
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Text2Speech {

    Voice voice;
    VoiceManager vm = VoiceManager.getInstance();
    private static final String VOICENAME = "kevin16";

    public void doSpeak(String speak) {

        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try {
            voice.speak(speak);
        } catch (Exception e) {
        }
    }
//    public static void main(String[] args) {
//        Text2Speech su = new Text2Speech();
//        su.doSpeak("You look so beautiful in white");
//    }
}
