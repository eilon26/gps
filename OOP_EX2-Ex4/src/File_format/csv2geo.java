package File_format;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import GIS.*;

public class csv2geo {
	double length;
	double width;
	ArrayList<String[]> g;
	Layers l; 
	public csv2geo(String csvFile) {
	//String csvFile = "C:\\Users\\danie\\Desktop\\Ex2\\data\\WigleWifi_20171203085618.csv";
    String line = "";
    String cvsSplitBy = ",";
    this.g = new ArrayList<String[]>();//#########
    
    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
    {
        while ((line = br.readLine()) != null) 
        {
            String[] userInfo = line.split(cvsSplitBy);
            
            this.g.add(userInfo);//#####
//            for (int i = 0; i < userInfo.length; i++) {
//				System.out.print(userInfo[i] + " ");
//			}
//            System.out.println();
            //System.out.println("ID: " + userInfo[0] + " , Name: " + userInfo[1]);
        }
        this.length = this.g.size();
        this.width=this.g.get(1).length;
        this.l = new Layer(g);
    } catch (Exception e) {
        e.printStackTrace();
    }
	}
    
}