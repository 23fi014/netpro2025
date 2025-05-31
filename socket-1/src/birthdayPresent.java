import java.io.Serializable;

public class birthdayPresent implements Serializable {

    public String message;
    public String gift;
    public String giftColor;
    public String name;
    public int birthday;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public int getBirthday(){
        return birthday;
    }

    public void setBirthday(int birthday){
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return giftColor;
    }

    public void setColor(String giftColor) {
        this.giftColor = giftColor;
    }


}