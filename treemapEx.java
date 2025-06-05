package kiran;
import java.util.TreeMap;
public class treemapEx {

	public static void main(String[] args) {
		TreeMap<String,String>vk=new TreeMap<String,String>();
		vk.put("India","New Delhi");
		vk.put("USA","Washington");
		vk.put("germany","Brelin");
		vk.put("Japan","Tokyo");
		vk.put("India","Delhi");
		System.out.println(vk);
		System.out.println(vk.firstKey());
		System.out.println(vk.lastKey());
		System.out.println(vk.higherKey("India"));
		System.out.println(vk.lowerKey("japan"));
		}
	}
