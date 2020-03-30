
public enum Registradores {
	ZERO("00000"),
	AT("00001"),
	V0("00010"),
	V1("00011"),
	A0("00100"),
	A1("00101"),
	A2("00110"),
	A3("00111"),
	T0("01000"),
	T1("01001"),
	T2("01010"),
	T3("01011"),
	T4("01100"),
	T5("01101"),
	T6("01110"),
	T7("01111"),
	S0("10000"),
	S1("10001"),
	S2("10010"),
	S3("10011"),
	S4("10100"),
	S5("10101"),
	S6("10110"),
	S7("10111"),
	T8("11000"),
	T9("11001"),
	K0("11010"),
	K1("11011"),
	GP("11100"),
	SP("11101"),
	FP("11010"),
	RA("11111");
	
String descricao;
	
	Registradores(String string) {
		this.descricao = string;
	}
	
	public static String valor(String a) {
		a=a.toUpperCase();
		
		if(a == "$ZERO") return Registradores.ZERO.descricao;
		else if(a == "$AT") return Registradores.AT.descricao;
		else if(a == "$V0") return Registradores.V0.descricao;
		else if(a == "$V1") return Registradores.V1.descricao;
		else if(a == "$A0") return Registradores.A0.descricao;
		else if(a == "$A1") return Registradores.A1.descricao;
		else if(a == "$A2") return Registradores.A2.descricao;
		else if(a == "$A3") return Registradores.A3.descricao;
		else if(a == "$T0") return Registradores.T0.descricao;
		else if(a == "$T1") return Registradores.T1.descricao;
		else if(a == "$T2") return Registradores.T2.descricao;
		else if(a == "$T3") return Registradores.T3.descricao;
		else if(a == "$T4") return Registradores.T4.descricao;
		else if(a == "$T5") return Registradores.T5.descricao;
		else if(a == "$T6") return Registradores.T6.descricao;
		else if(a == "$T7") return Registradores.T7.descricao;
		else if(a == "$S0" || a == "$R0") return Registradores.S0.descricao;
		else if(a == "$S1" || a == "$R1") return Registradores.S1.descricao;
		else if(a == "$S2" || a == "$R2") return Registradores.S2.descricao;
		else if(a == "$S3" || a == "$R3") return Registradores.S3.descricao;
		else if(a == "$S4" || a == "$R4") return Registradores.S4.descricao;
		else if(a == "$S5" || a == "$R5") return Registradores.S5.descricao;
		else if(a == "$S6" || a == "$R6") return Registradores.S6.descricao;
		else if(a == "$S7" || a == "$R7") return Registradores.S7.descricao;
		else if(a == "$T8" || a == "$R8") return Registradores.T8.descricao;
		else if(a == "$T9" || a == "$R9") return Registradores.T9.descricao;
		else if(a == "$K0") return Registradores.K0.descricao;
		else if(a == "$K1") return Registradores.K1.descricao;
		else if(a == "$GP") return Registradores.GP.descricao;
		else if(a == "$SP") return Registradores.SP.descricao;
		else if(a == "$FP") return Registradores.FP.descricao;
		else if(a == "$RA") return Registradores.RA.descricao;
		else return a;
		
	}
	
	
}
