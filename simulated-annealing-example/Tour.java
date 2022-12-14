import java.util.*;

public class Tour {
    private List<City> cities;
    private int distance;

    public Tour(List<City> cities) {
        this.cities = new ArrayList<>(cities);
        Collections.shuffle(this.cities);
    }
    public City getCity(int index) {
        return cities.get(index);
    }

    public int getTourLength() {
        if (distance != 0) return distance;

        int totalDistance = 0;

        for (int i = 0; i < noCities(); i++) {
            City start = getCity(i);
            City end = getCity(i + 1 < noCities() ? i + 1 : 0);
            totalDistance += Util.distance(start, end);
        }

        distance = totalDistance;
        return totalDistance;
    }

    public Tour duplicate() {
        return new Tour(new ArrayList<>(cities));
    }

    public int noCities() {
        return cities.size();
    }

    public List<City> getCities() {
	    return cities;
    }
    public String toString() {
      String str = "";
      for(int i=0; i < cities.size(); i++) {
        int y = cities.get(i).getY();
	int x = cities.get(i).getX();
	str = str + "(" + x + "," + y + ") " ;
      }	      
      return str;
    }
}

