package ins_stat_op;

public class getsetmet {
	int a;
	short s;
	long l;
	byte b;
	char c;
	double d;
	float f;
	//Get and set methods for assigning and accessing the variables
	public int getA() {
		return a;
	}

	public void setA(int a1) {
		a = a1;
	}

	public short getS() {
		return s;
	}

	public void setS(short s1) {
		s = s1;
	}

	public long getL() {
		return l;
	}

	public void setL(long l1) {
		l = l1;
	}

	public byte getB() {
		return b;
	}

	public void setB(byte b1) {
		b = b1;
	}

	public char getC() {
		return c;
	}

	public void setC(char c1) {
		c = c1;
	}

	public double getD() {
		return d;
	}

	public void setD(double d1) {
		d = d1;
	}

	public float getF() {
		return f;
	}

	public void setF(float f1) {
		f = f1;
	}

	public static void main(String[] args) {
		getsetmet gsm=new getsetmet();
		gsm.setA(12);
		byte b1=10;//type casting: assigning the values before execution or manipulating the datatype to its original one.
		gsm.setB(b1);
		gsm.setC('a');
		gsm.setD(12.2154);
		gsm.setF(12);
		short s1=12;
		gsm.setS(s1);
		System.out.println(gsm.getA());
		System.out.println(gsm.getB());
		System.out.println(gsm.getC());
		System.out.println(gsm.getD());
		System.out.println(gsm.getF());
		System.out.println(gsm.getS());
		}

}
