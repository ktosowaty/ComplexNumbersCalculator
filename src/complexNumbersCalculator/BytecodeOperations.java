package complexNumbersCalculator;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class BytecodeOperations implements Opcodes {

	private static ClassWriter cw = new ClassWriter(0);
	FieldVisitor fv;
	private static MethodVisitor mv;
	AnnotationVisitor av0;
	
	public static void add() {
		mv = cw.visitMethod(ACC_PUBLIC, "add", "(LcomplexNumbersCalculator/ComplexNumber;LcomplexNumbersCalculator/ComplexNumber;)LcomplexNumbersCalculator/ComplexNumber;", null, null);
		mv.visitCode();
		Label l0 = new Label();
		mv.visitLabel(l0);
		mv.visitLineNumber(18, l0);
		mv.visitVarInsn(ALOAD, 1);
		mv.visitVarInsn(ALOAD, 2);
		mv.visitMethodInsn(INVOKEVIRTUAL, "complexNumbersCalculator/ComplexNumber", "add", "(LcomplexNumbersCalculator/ComplexNumber;)LcomplexNumbersCalculator/ComplexNumber;", false);
		mv.visitVarInsn(ASTORE, 1);
		Label l1 = new Label();
		mv.visitLabel(l1);
		mv.visitLineNumber(19, l1);
		mv.visitVarInsn(ALOAD, 1);
		mv.visitInsn(ARETURN);
		Label l2 = new Label();
		mv.visitLabel(l2);
		mv.visitLocalVariable("this", "LcomplexNumbersCalculator/BytecodeOperations;", null, l0, l2, 0);
		mv.visitLocalVariable("val", "LcomplexNumbersCalculator/ComplexNumber;", null, l0, l2, 1);
		mv.visitLocalVariable("i", "LcomplexNumbersCalculator/ComplexNumber;", null, l0, l2, 2);
		mv.visitMaxs(2, 3);
		mv.visitEnd();
	}
	
	public static void sub() {
		mv = cw.visitMethod(ACC_PUBLIC, "sub", "(LcomplexNumbersCalculator/ComplexNumber;LcomplexNumbersCalculator/ComplexNumber;)LcomplexNumbersCalculator/ComplexNumber;", null, null);
		mv.visitCode();
		Label l0 = new Label();
		mv.visitLabel(l0);
		mv.visitLineNumber(42, l0);
		mv.visitVarInsn(ALOAD, 1);
		mv.visitVarInsn(ALOAD, 2);
		mv.visitMethodInsn(INVOKEVIRTUAL, "complexNumbersCalculator/ComplexNumber", "subtract", "(LcomplexNumbersCalculator/ComplexNumber;)LcomplexNumbersCalculator/ComplexNumber;", false);
		mv.visitVarInsn(ASTORE, 1);
		Label l1 = new Label();
		mv.visitLabel(l1);
		mv.visitLineNumber(43, l1);
		mv.visitVarInsn(ALOAD, 1);
		mv.visitInsn(ARETURN);
		Label l2 = new Label();
		mv.visitLabel(l2);
		mv.visitLocalVariable("this", "LcomplexNumbersCalculator/BytecodeOperations;", null, l0, l2, 0);
		mv.visitLocalVariable("val", "LcomplexNumbersCalculator/ComplexNumber;", null, l0, l2, 1);
		mv.visitLocalVariable("i", "LcomplexNumbersCalculator/ComplexNumber;", null, l0, l2, 2);
		mv.visitMaxs(2, 3);
		mv.visitEnd();
	}
	
	public static void ComplexNumber() {
		mv = cw.visitMethod(ACC_PUBLIC, "ComplexNumber", "(LcomplexNumbersCalculator/Token;)LcomplexNumbersCalculator/ComplexNumber;", null, null);
		mv.visitCode();
		Label l0 = new Label();
		mv.visitLabel(l0);
		mv.visitLineNumber(66, l0);
		mv.visitVarInsn(ALOAD, 1);
		mv.visitFieldInsn(GETFIELD, "complexNumbersCalculator/Token", "image", "Ljava/lang/String;");
		mv.visitLdcInsn("i");
		mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
		Label l1 = new Label();
		mv.visitJumpInsn(IFNE, l1);
		mv.visitTypeInsn(NEW, "complexNumbersCalculator/ComplexNumber");
		mv.visitInsn(DUP);
		mv.visitVarInsn(ALOAD, 1);
		mv.visitFieldInsn(GETFIELD, "complexNumbersCalculator/Token", "image", "Ljava/lang/String;");
		mv.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "parseDouble", "(Ljava/lang/String;)D", false);
		mv.visitMethodInsn(INVOKESPECIAL, "complexNumbersCalculator/ComplexNumber", "<init>", "(D)V", false);
		mv.visitInsn(ARETURN);
		mv.visitLabel(l1);
		mv.visitLineNumber(69, l1);
		mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
		mv.visitVarInsn(ALOAD, 1);
		mv.visitFieldInsn(GETFIELD, "complexNumbersCalculator/Token", "image", "Ljava/lang/String;");
		mv.visitVarInsn(ASTORE, 2);
		Label l2 = new Label();
		mv.visitLabel(l2);
		mv.visitLineNumber(70, l2);
		mv.visitVarInsn(ALOAD, 2);
		mv.visitLdcInsn("i");
		mv.visitLdcInsn("");
		mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", false);
		mv.visitVarInsn(ASTORE, 2);
		Label l3 = new Label();
		mv.visitLabel(l3);
		mv.visitLineNumber(71, l3);
		mv.visitVarInsn(ALOAD, 2);
		mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
		Label l4 = new Label();
		mv.visitJumpInsn(IFNE, l4);
		mv.visitTypeInsn(NEW, "complexNumbersCalculator/ComplexNumber");
		mv.visitInsn(DUP);
		mv.visitInsn(DCONST_0);
		mv.visitInsn(DCONST_1);
		mv.visitMethodInsn(INVOKESPECIAL, "complexNumbersCalculator/ComplexNumber", "<init>", "(DD)V", false);
		mv.visitInsn(ARETURN);
		mv.visitLabel(l4);
		mv.visitLineNumber(72, l4);
		mv.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
		mv.visitTypeInsn(NEW, "complexNumbersCalculator/ComplexNumber");
		mv.visitInsn(DUP);
		mv.visitInsn(DCONST_0);
		mv.visitVarInsn(ALOAD, 2);
		mv.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "parseDouble", "(Ljava/lang/String;)D", false);
		mv.visitMethodInsn(INVOKESPECIAL, "complexNumbersCalculator/ComplexNumber", "<init>", "(DD)V", false);
		mv.visitInsn(ARETURN);
		Label l5 = new Label();
		mv.visitLabel(l5);
		mv.visitLocalVariable("this", "LcomplexNumbersCalculator/BytecodeOperations;", null, l0, l5, 0);
		mv.visitLocalVariable("t", "LcomplexNumbersCalculator/Token;", null, l0, l5, 1);
		mv.visitLocalVariable("s", "Ljava/lang/String;", null, l2, l5, 2);
		mv.visitMaxs(6, 3);
		mv.visitEnd();
	}
	
	public static void end() {
		
	}
	
	public void tmp() {
		ComplexNumber cn1 = new ComplexNumber(3, 4);
		ComplexNumber cn2 = new ComplexNumber(5);
		ComplexNumber result = cn1.add(cn2);
		System.out.println(result); 
	}
	
}
