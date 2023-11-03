package certificacionJava11.principal;

public class Question18 {
	
	int aCount;
	int tCount;
	int cCount;
	int gCount;
	public static void main(String[] args) {
		Question18 pop = new Question18(1,2,3,4);
	System.out.println(pop.aCount+" "+pop.cCount+" "+pop.gCount); // 1 3 4
	}

	Question18(int a, int tCount, int c, int g){
	cCount = setCCount(c);
	aCount = a;
	setGCount(g);
	}

	int setCCount(int c){
	return c;
	}
	void setGCount(int gCount){
	this.gCount = gCount;
	}

	

}
