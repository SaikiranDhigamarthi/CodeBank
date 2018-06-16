import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShipmentCompanyDetails {

	public static void main(String[] args) {

		Map<Integer, String> map;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number Of Cargos:");
		int noOfCargos = sc.nextInt();

		System.out.println("Enter The Cargo ID:");
		Integer integerArray[] = new Integer[noOfCargos];
		for (int i = 0; i < noOfCargos; i++) {
			integerArray[i] = sc.nextInt();
		}

		System.out.println("Enter The Number Of Shipments:");
		int noOfShipments = sc.nextInt();

		System.out.println("Enter The Shipment name");
		String strArray[] = new String[noOfShipments];
		for (int i = 0; i < noOfShipments; i++) {
			strArray[i] = sc.next();

		}
		map = new HashMap<Integer, String>();
		if (noOfCargos > noOfShipments) {
			for (int i = 0; i < noOfShipments; i++) {
				map.put(integerArray[i], strArray[i]);
			}
		} else {
			for (int i = 0; i < noOfCargos; i++) {
				map.put(integerArray[i], strArray[i]);
			}
		}

		System.out.println("Enter The Cargo ID Number 1");
		
		int cargoId = sc.nextInt();
		String id = map.get(cargoId);
		if (id == null) {
			System.out.println("Yet To Be Shipped!!!!");
		} else {
			System.out.println(id);
		}

	}

}
