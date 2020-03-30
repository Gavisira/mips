
public enum Opcode {

	ADD("100000"),
	ADDI("001000"),
	SUB("100010"),
	MULT("011000"),
	DIV("011010"),
	AND("100100"),
	ANDI("001100"),
	OR("100101"),
	ORI("001101"),
	XOR("100110"),
	NOR("100111"),
	SLT("101010"),
	SLTI("101011"),
	SLL("000000"),
	SRL("000010"),
	LW("1000011"),
	SW("101011"),
	BEQ("000100"),
	BNE("000101"),
	J("000010"),
	JR("001000"),
	JAL("001001"),
	NOP("");
	
	String descricao;
	
	Opcode(String string) {
		this.descricao = string;
	}
	
}
