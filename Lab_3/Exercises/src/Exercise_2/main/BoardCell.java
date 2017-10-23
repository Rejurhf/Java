import en.Enum.*;

public class BoardCell {
    private Status cellStatus;
    private Direction cellDirection;
    private Place cellPlace;
    private String conntent;

    public void setCellStatus(Status status){
        this.cellStatus = status;
    }

    public Status getCellStatus() {
        return cellStatus;
    }

    public void setCellDirection(Direction direction){
        this.cellDirection = direction;
    }

    public Direction getCellDirection() {
        return cellDirection;
    }

    public void setCellPlace(Place place){
        this.cellPlace = place;
    }

    public Place getCellPlace() {
        return cellPlace;
    }

    public void setConntent(String content){
        this.conntent = content;
    }

    public String getConntent() {
        return conntent;
    }
}
