

public class Inst {

	public int imediato;
	public String instrucao;
	public Opcode opcode;
	public String op;
	public String rs;
	public String rt;
	public String rd;
	public String shamt = "00000";

	public Inst(String ins) {
		String [] nova;
		nova = ins.split(" ");
		int caso = 0;

		instrucao = ins;

		op = nova[0].toLowerCase();
		instrucao = op;
		String t1 = nova[1].toLowerCase();
		String t2 = nova[2].toLowerCase();
		String t3 = "0";
		if (!op.equals("lw") && !op.equals("sw") && !op.equals("neg")) {t3 = nova[3]; caso = 1;}
		if (op.equals("sll") || op.equals("srl")) {caso = 3; shamt = nova[3];}
		
		if(op.equals("add")) op = Opcode.ADD.descricao;
		else if(op.equals("addi")) op = Opcode.ADDI.descricao;
		else if(op.equals("sub")) op = Opcode.SUB.descricao;
		else if(op.equals("mult")) op = Opcode.MULT.descricao;
		else if(op.equals("div")) op = Opcode.DIV.descricao;
		else if(op.equals("and")) op = Opcode.AND.descricao;
		else if(op.equals("andi")) op = Opcode.ANDI.descricao;
		else if(op.equals("or")) op = Opcode.OR.descricao;
		else if(op.equals("ori")) op = Opcode.ORI.descricao;
		else if(op.equals("xor")) op = Opcode.XOR.descricao;
		else if(op.equals("nor")) op = Opcode.NOR.descricao;
		else if(op.equals("slt")) op = Opcode.SLT.descricao;
		else if(op.equals("slti")) op = Opcode.SLTI.descricao;
		else if(op.equals("sll")) op = Opcode.SLL.descricao;
		else if(op.equals("srl")) op = Opcode.SRL.descricao;
		else if(op.equals("lw")) op = Opcode.LW.descricao;
		else if(op.equals("beq")) op = Opcode.BEQ.descricao;
		else if(op.equals("bne")) op = Opcode.BNE.descricao;
		else if(op.equals("j")) op = Opcode.J.descricao;
		else if(op.equals("jr")) op = Opcode.JR.descricao;
		else if(op.equals("jal")) op = Opcode.JAL.descricao;
		else if(op.equals("nop")) op = Opcode.NOP.descricao;
		else if(op.equals("sw")) op = Opcode.SW.descricao;

		switch(caso) {
		
		case 1:{
			
			rd = Registradores.valor(t1);
			rs = Registradores.valor(t2);
			rt = "00000";
			break;
			}
		case 0:{
			rd = Registradores.valor(t1);
			rs = Registradores.valor(t2);
			rt = Registradores.valor(t3);
			break;
		}
		case 3:{
			rd = "00000";
			rs = "00000";
			rt = "00000";
		}
			
		
		
		
	}
}
	
	public String retorno() {
		return (op + " " + rs + " " + rt + " " + rd + " " + shamt + " " + instrucao);
	}
	}
