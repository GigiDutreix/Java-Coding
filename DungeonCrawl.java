
public class DungeonCrawl {
public class Room {

    // --- Instance Variables ---
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room south;
    private Room west;

    // --- Constructor ---

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        // Exits are initially null (no connections)
        this.north = null;
        this.east = null;
        this.south = null;
        this.west = null;
    }

   
    public void setExits(Room n, Room e, Room w, Room s) {
        this.north = n;
        this.east = e;
        this.west = w; 
        this.south = s;
    }

   
    public String getName() {
        return this.name;
    }

  
    public Room getNorth() {
        return this.north;
    }

  
    public Room getEast() {
        return this.east;
    }

  
    public Room getSouth() {
        return this.south;
    }

  
    public Room getWest() {
        return this.west;
    }

   
    public String getExits() {
        String exitsString = ""; // Start with an empty string

        if (this.north != null) {
            exitsString += "[N]orth: " + this.north.getName() + "\n";
        }
        if (this.east != null) {
            exitsString += "[E]ast: " + this.east.getName() + "\n";
        }
        if (this.south != null) {
            exitsString += "[S]outh: " + this.south.getName() + "\n";
        }
        if (this.west != null) {
            exitsString += "[W]est: " + this.west.getName() + "\n";
        }

        
        if (exitsString.length() > 0) {
             exitsString = exitsString.substring(0, exitsString.length() - 1);
        }


        return exitsString;
    }

  
    public String toString() {
        // Format: [Name]\nDescription\nExits list
        String roomInfo = "[" + this.name + "]\n";
        roomInfo += this.description + "\n";
        roomInfo += this.getExits(); 

        return roomInfo;
    }

 
}}
