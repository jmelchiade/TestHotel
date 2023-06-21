public class hotel {
    private String room;
    private int nights = 1;
    private int guests = 1;
    private double telephone = 5.75;
    private double totalAmount;
    private double roomRate = 79.95;
    private double totalRoom = 0;
    private double taxPercentage = 0.065;
    private double totalTaxes = 0;
    private double totalMeal = 0;
    private double totalTips = 0;

    public hotel(String room, int nights, int guests) {
        this.room = room;
        this.guests = guests;
        this.nights = nights;
    }

    public hotel(String room, int nights) {
        this.room = room;
        this.nights = nights;
    }

    public hotel(String room) {
        this.room = room;
    }

    public void calculate() {
        double mealCost = 12.95;
        double tipsBase = 0.075;
        totalRoom = this.roomRate * this.guests * this.nights;
        totalTaxes = totalRoom * taxPercentage;
        totalMeal = mealCost * this.guests * this.nights;
        totalTips = (totalRoom + totalMeal + totalTaxes + this.telephone) * tipsBase;
        this.totalAmount = this.telephone + totalTips + totalRoom + totalMeal + totalTaxes;
    }

    public void addGuest(int guests) {
        this.guests = this.guests + guests;
    }

    public void addNights(int nights) {
        this.nights = this.nights + nights;
    }

    public String getRoom() {
        return room;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public int getNight() {
        return nights;
    }

    public int getGuests() {
        return guests;
    }

    public double getTotalRoom() {
        return totalRoom;
    }

    public double getTotalTaxes() {
        return totalTaxes;
    }

    public double getSubtotal() {
        return totalRoom + totalTaxes;
    }

    public double getTelephone() {
        return telephone;
    }

    public double getTotalMeal() {
        return totalMeal;
    }

    public double getTotalTips() {
        return totalTips;
    }

    public double getTotal() {
        return this.totalAmount;
    }
}