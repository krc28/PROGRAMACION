package Semana3;
public class Capsulas { 


    public static void main(String[] args) { 
	// Inicializar Primitivos 
	int  i1 = 12; 
        int  i2 = 300;
	long l1 = 200L; // sufijo para primitivo long
	long l2 = 200l; // sufijo para primitivo long
	long l3 = 200;
	float f1 = 1e-39F; // sufijo para primitivo float
	float f2 = 1e+11f; // sufijo para primitivo float
	float f3 = 1;
	double d1 = 32e46d; // sufijo para primitivo double
	double d2 = 14D; // sufijo para primitivo double
	double d3 = 1; 

	// Inicializar "Wrappers" con primitivos
	Integer wi1 = new Integer(i1);
	Long wl1 = new Long(l1);
	Float wf1 = new Float(f1);
	Double wd1 = new Double(d1);


	// Convertir/Imprimir Valores de "Wrappers" como double (primitivo)
	prt(wi1.doubleValue());
	prt(wl1.doubleValue());
	prt(wf1.doubleValue());
	prt(wd1.doubleValue());

	// Convertir/Imprimir Valores de "Wrappers" como float (primitivo)
	prt(wi1.floatValue());
	prt(wl1.floatValue());
	prt(wf1.floatValue());
	prt(wd1.floatValue());

	// Convertir/Imprimir Valores de "Wrappers" como long (primitivo)
	prt(wi1.longValue());
	prt(wl1.longValue());
	prt(wf1.longValue());
	prt(wd1.longValue());


	// Convertir/Imprimir Valores de "Wrappers" como integer (primitivo)
	prt(wi1.intValue());
	prt(wl1.intValue());
	prt(wf1.intValue());
	prt(wd1.intValue());

	// Inicializar "String's" con valores numericos 
	String str1 = "7";
	String str2 = "57";
	String str3 = "3.23";
	String str4 = "797.43";
	

	// Inicializar "Wrappers" con "String's" 
	Integer wi2 = new Integer(str1);
        Long wl2 = new Long(str2);
	Float wf2 = new Float(str3);
	Double wd2 = new Double(str4);

	// Imprimir Valores 
	prt(wi2);
	prt(wl2);
	prt(wf2);
	prt(wd2);

	// Convertir/Imprimir Valores de "Wrappers" como String's
	prt(wi2.toString());
	prt(wl2.toString());
	prt(wf2.toString());
	prt(wd2.toString());	
	
	// Inicializar "Wrappers" con primitivos
	Integer wi3 = new Integer(0);
        Long wl3 = new Long(0);
	Float wf3 = new Float(0);
	Double wd3 = new Double(0);

	// Convertir/Imprimir Valores de "Wrappers" a través de "String's"
	// a su respectivo primitivo
	prt(wi3.parseInt(str1));
	prt(wl3.parseLong(str2));
	prt(wf3.parseFloat(str3));
	prt(wd3.parseDouble(str4));

    }

    static void prt(String s) { 
	System.out.println("Un String con valor " + s);
    }
    static void prt(Integer i) { 
	System.out.println("Un Integer (\"Wrapper\") con valor " + i);
    }
    static void prt(Long l) { 
	System.out.println("Un Long (\"Wrapper\") con valor " + l);
    }
    static void prt(Float f) { 
	System.out.println("Un Float (\"Wrapper\") con valor " + f);
    }
    static void prt(Double d) { 
	System.out.println("Un Double (\"Wrapper\") con valor " + d);
    }
    static void prt(int i) { 
	System.out.println("Un int (primitivo) con valor " + i);
    }
    static void prt(long l) { 
	System.out.println("Un long (primitivo) con valor " + l);
    }
    static void prt(float f) { 
	System.out.println("Un float (primitivo) con valor " + f);
    }
    static void prt(double d) { 
	System.out.println("Un double (primitivo) con valor " + d);
    }
}