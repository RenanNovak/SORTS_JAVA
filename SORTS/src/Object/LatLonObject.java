package Object;

import java.util.ArrayList;

import Algoritmos.Bubble;
import Algoritmos.Insert;
import Algoritmos.Merge;
import Algoritmos.Quick;
import Algoritmos.SelectionSort;

public class LatLonObject <T extends Comparable<T>> {
	
	private double longitude;
    private double latitude;
	
	public LatLonObject(double longitude, double latitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	
	
	public LatLonObject(ArrayList<T>List,double longitude,double latitude,String Sort) {
		
		switch(Sort) {
		case "SC":
			SelectionSort<Float> SC = new SelectionSort<Float>(); // SelectionSort en tipo Float.
			break;
		case "SCString":
			SelectionSort<String> SCString = new SelectionSort<String>(); // SelectionSort en tipo String.
			break;
		case "BB":
			Bubble<Float> BB = new Bubble<Float>(); // BubbleSort en tipo Float.
			break;
		case "BBString":
			Bubble<String> BBString = new Bubble<String>(); // BubbleSort en tipo String. 
			break;
		case "II":
			Insert<Float> II = new Insert<Float>(); //InsertionSort en tipo Float.
			break;
		case "IIString":
			Insert<String> IIString = new Insert<String>(); //InsertionSort en tipo String.
			break;
		case "MM":
			Merge<Float> MM = new Merge<Float>();
			break;
		case "MMString":
			Merge<String> MMString = new Merge<String>();
			break;
		case "QQ":
			Quick<Float> QQ = new Quick<Float>();
			break;
		case "QQString":
			Quick<String> QQString = new Quick<String>();
			break;
		default:
			System.out.println("Não existe");
		}
	}
	
	public int compareTo(LatLonObject value) {
		
		if(this.latitude > value.getLatitude()) {
			return 1;
		}else if(this.latitude < value.getLatitude()) {
			return -1;
		}else {
			if (this.longitude > value.getLongitude()) {
				return 1;
			}else if (this.longitude < value.getLongitude()) {
				return -1;
			}
			return 0;
		}
	}
	
	/*@Override
	  public String toString() {
	    return "[CoordinateObject"
	              + " Latitude="  + this.latitude 
	              + " Longitude=" + this.longitude
	              + "]";
	  }*/
	}