package MShape.MLang.Commands;

public class UpCommand implements ICommand { 
    @Override
    public String toString() {
        return "Up";
    }

    @Override
    public float GetDelayTiem() {
        return 200;
    }

}
