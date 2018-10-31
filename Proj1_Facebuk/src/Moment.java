import java.util.ArrayList;

public class Moment extends Profile {
    private ArrayList _participants;
    private ArrayList _smileValues;

    public Moment (String name, Image image, ArrayList participants, ArrayList smileValues) {
        super(name, image);
        _participants = participants;
        _smileValues = smileValues;
    }

    public ArrayList getParticipants() {
        return _participants;
    }

    ArrayList getSmileValues() {
        return _smileValues;
    }


    public double getHappinessScore() {
        int nSmiles = _smileValues.size();
        double sum = 0;
        for (int i = 0; i < nSmiles; ++i) {
            sum += (double)_smileValues.get(i);
        }
        return sum/nSmiles;
    }

}