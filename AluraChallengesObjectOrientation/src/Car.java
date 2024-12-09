import java.util.Calendar;

public class Car {
    private String brand;
    private String model;
    private int launchYear;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void details() {
        String message = """
                Brand: %s
                Model: %s
                Year: %d
                Color: %s
                """.formatted(this.brand, this.model, this.launchYear, this.color);
    }

    public int getAge() {
        Calendar now = Calendar. getInstance();
        int yearActual = now.get(Calendar.YEAR);
        return yearActual - this.launchYear;
    }
}
