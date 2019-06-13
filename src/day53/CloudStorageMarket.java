package day53;

public class CloudStorageMarket {
	public static void main(String[] args) {
		CloudStorage cl = new CloudStorage(50, 2, "firuz", "firuz123");
		GoogleDrive gl = new GoogleDrive(50, 3, "sheroz", "1234", true);
		System.out.println(cl);
		System.out.println(gl);
		CloudStorage.changeRegion("USA");
		GoogleDrive.changeRegion("CANADA");
		
		System.out.println("Google region: " + GoogleDrive.region);
		System.out.println("Cloud region: " + CloudStorage.region);
	}

}
