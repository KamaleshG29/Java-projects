package demo;

public class GreedyAlgorithm {
	
	static class Transport{
		
		String name;
		int time;
		int cost;
Transport(String name,int time,int cost){
	this.name=name;
	this.cost=cost;
	this.time=time;
}
	}	
	public static void main(String args[]) {
		Transport[] options= {
				new Transport("flight",1,5000),
				new Transport("train",15,1000),
				new Transport("Bus",30,500),
		};
		Transport best=options[0];
		for(int i=1;i<options.length;i++) {
			if(options[i].cost<best.cost) {
				best=options[i];
			}
		}
		System.out.println("best option to reach fast to goa");
		System.out.println(best.name+"- Time :"+best.time+"Hours-cost:"+best.cost);
			
		}
	}
	

