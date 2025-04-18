public class experiment16 {
    
    public int roomNo;
        public float roomArea;
        public String roomType;
        public boolean hasAC;

        // Method to set data

        public void setData(int no, float area, String type, boolean ac) {
        roomNo = no;
        roomArea = area;
        roomType = type;
        hasAC = ac;
    }

    // Method to display data
    public void displayData() {
    System.out.println("Room No: " + roomNo);
    System.out.println("Room Area: " + roomArea + " sq. ft.");
    System.out.println("Room Type: " + roomType);
    System.out.println("AC Machine: " + (hasAC ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        
    experiment16 r = new experiment16();
    r.setData(101, 250.5f, "Deluxe", true);
    r.displayData();

}
}