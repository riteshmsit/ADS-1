import java.io.File;
import java.util.*;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
// class worddetails {
// 	int docid;
// 	ArrayList<Integer> arrli;
// 	worddetails(int docid, ArrayList<Integer> arrli) {
// 		this.docid = docid;
// 		this.arrli = arrli;
// 	}
// 	int compareTo(Comparator that) {
// 		if (this.arrli.size() > that.arrli.size()) {
// 			return 1;
// 		} if (this.arrli.size() > that.arrli.size()) {
// 			return -1;
// 		} if (this.docid < that.docid) {
// 			return 1;
// 		} if (this.docid > that.docid) {
// 			return 1;
// 		} 
// 		return 0;
// 	}
// }
class Solution {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		//System.out.print("enter the directory containing word files: ");
		Scanner scan = new Scanner(System.in);
		WordProfileGenerator wpg = new WordProfileGenerator("Files");
		//System.out.println("The following are the docid, total freq,frequencies in each file and freq positions of each word");
		wpg.reader();
		wpg.presenter();	
	}
}
class WordProfileGenerator {
	File folder;
	Insertion insert;
	File[] listoffiles;
	LinkedHashMap<String,ArrayList<Object>> lhm;
	WordProfileGenerator(String path_directory) {
		this.folder= new File(path_directory);
		this.listoffiles = folder.listFiles();
		this.lhm = new LinkedHashMap<String,ArrayList<Object>>();
		insert = new Insertion();
	}
	void reader() throws FileNotFoundException,IOException {
		for (int i = 0; i < listoffiles.length;i++) {		
			FileReader in = new FileReader(listoffiles[i].getAbsolutePath());
		    BufferedReader br = new BufferedReader(in);
		    String line;
		    while ((line = br.readLine()) != null) {
		    	this.parser(line,i);
		    }
		    in.close();		
		}
	}
	//reading the file and building hashmap
	void parser(String data,int indexoffile) {
		String[] data_splitted = data.split(" ");
		for (int i = 0 ; i < data_splitted.length;i++) {
			if (!this.lhm.containsKey(data_splitted[i])) {			
				ArrayList<Object> sal = new ArrayList<Object>(); 
				ArrayList<Integer> ssal = new ArrayList<Integer>(); 
				ssal.add(i);
				sal.add(1);
				sal.add(ssal);
				LinkedHashMap<Integer,ArrayList<Object>> slhm = new LinkedHashMap<Integer,ArrayList<Object>>();  
				slhm.put(indexoffile,sal);
				ArrayList<Object> al = new ArrayList<Object>();
				al.add(1);
				al.add(slhm);
				this.lhm.put(data_splitted[i],al);
			} else {
				Integer total_frequency = (Integer) this.lhm.get(data_splitted[i]).get(0);
				total_frequency+=1;
				this.lhm.get(data_splitted[i]).set(0, total_frequency);
				LinkedHashMap<Integer, ArrayList<Object>> tmp_sublhm = (LinkedHashMap<Integer, ArrayList<Object>>) this.lhm.get(data_splitted[i]).get(1);
				if (tmp_sublhm.containsKey(indexoffile)) {
					Integer sub_frequency = (Integer) tmp_sublhm.get(indexoffile).get(0);
					sub_frequency += 1;
					tmp_sublhm.get(indexoffile).set(0,sub_frequency);
					ArrayList<Integer> tmp_ssal =  (ArrayList<Integer>) tmp_sublhm.get(indexoffile).get(1);
					tmp_ssal.add(i);		
				} else {
					ArrayList<Object> tmp_sal = new ArrayList<Object>(); 
					ArrayList<Integer> tmp_ssal = new ArrayList<Integer>(); 
					tmp_ssal.add(i);
					tmp_sal.add(1);
					tmp_sal.add(tmp_ssal);
					tmp_sublhm.put(indexoffile,tmp_sal);		
				}
			}
		}
	}
	void presenter() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int totalfreq = (int) lhm.get(line).get(0);
		//System.out.println("Enter your word");
		//String line = sc.nextLine();
		//System.out.println(lhm);
		ArrayList<worddetails> comp = new ArrayList<worddetails>();
		LinkedHashMap<Integer, ArrayList<Object>> lkm = (LinkedHashMap<Integer, ArrayList<Object>>) this.lhm.get(line).get(1);
		//LinkedHashMap<Integer, ArrayList<Object>> lkm = new LinkedHashMap<Integer, ArrayList<Object>>();
		
			//System.out.println("Here are the contents of your word in each file");
			// Iterator it = new Iterator();
		    //System.out.println(lhm.get(line));
			//System.out.println(lkm);
			//lkm.getKey();
			// Iterator it = lkm.iterator();
			// while (it.hasNext()) {
			// 	System.out.println(it.next());
			// }
			//System.out.println(lkm.getKeys());
			if (lhm.get(line) != null) {
			System.out.println(line + ":" + totalfreq);
		} else {
			System.out.println("word is not present in any file");
		}
		
			Map<String, ArrayList<Object>> test1 = new LinkedHashMap<String, ArrayList<Object>>();
			// int y = 0;
lkm.forEach((key,value) -> {
	// System.out.println("5");
     //System.out.println(key + " "+ value);
	// System.out.println(value.get(1));
	ArrayList<Object> obj = new ArrayList<Object>();
	ArrayList<Object> obj2 = new ArrayList<Object>();
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	// ArrayList<Integer> val = new ArrayList<Integer>();
	// val = (ArrayList<Integer>) value;
	//System.out.println(val);
    al1 = (ArrayList) value.get(1);
    int doc = (int) key;
    int subfreq = (int) value.get(0);
    obj.add(doc);
    obj.add(subfreq);
    obj.add(al1);
    obj2.add(obj);
    WordProfileGeneratorr wpgg = new WordProfileGeneratorr(doc, subfreq, al1, obj2);
    insert.add(wpgg);
    


    // System.out.println(doc);
    // System.out.println(subfreq);
	//worddetails c = new worddetails(key, al1);
	// y++;
	//System.out.println(count);
	//comp.add(c);
    });
if (lhm.get(line) != null) {
insert.insertion();
}
//System.out.println(count);
//System.out.println(count);
    // Insertion.sort(comp.toArray(), Comparator comparing);
     //Insertion.sort((Comparable[])comp.toArray() , 0, comp.toArray().length);
     //Insertion.show((Comparable[])comp.toArray());
    //lkm.put(value);
    		// System.out.println(lkm.get(0));
			//System.out.println(lhm.get(line).get(0));
		
	}
}