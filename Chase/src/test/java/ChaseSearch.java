


//import com.sun.xml.internal.bind.marshaller.DataWriter;
import org.testng.annotations.Test;

import CommonApi.Base;

import Util.DataReader;
import java.io.IOException;

public class ChaseSearch extends ChaseBase {


    DataReader dr = new DataReader();
    //DataWriter dw = new DataWriter();


    String path = "Chase/Data/ChaseSearch.xls";
    //@Test
    public void searchItems() throws IOException {

        String[][] itemLocator = dr.fileReader(path);
        for (int i = 1; i<itemLocator.length; i++){
            typeByCssThenEnter(itemLocator[i][0], itemLocator[i][1]);
        }
    }


}


//
//
//import org.testng.annotations.Test;
//import Util.DataReader;
//
//import java.io.IOException;
//
///**
// * Created by rrt on 8/29/2015.
// */
//public class Search extends ChaseBase {
//
//    DataReader dr = new DataReader();
//    String path = "Chase/Data/ChaseSearch.xls";
//    @Test
//    public void searchItems() throws IOException {
//        String[][] itemLocator = dr.fileReader(path);
//        for (int i = 1; i<itemLocator.length; i++){
//            typeByCssThenEnter(itemLocator[i][0], itemLocator[i][1]);
//        }
//    }
//}


