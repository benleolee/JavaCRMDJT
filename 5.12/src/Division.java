public class Division { // ������
	public static void main(String args[]) { // ������
		String str = new String("abc,def,ghi,gkl"); // ������ַ���str
		// ʹ��split()�������ַ������в��,�����ַ�������
		String[] newstr = str.split(",");
		for (int i = 0; i < newstr.length; i++) { // ʹ��forѭ�������ַ�����
			System.out.println(newstr[i]); // �����Ϣ
		}
		// ���ַ������в�֣����޶���ִ����������ַ�����
		String[] newstr2 = str.split("g", 3);
		for (int j = 0; j < newstr2.length; j++) { // ѭ�������ַ�����
			System.out.println(newstr2[j]); // �����Ϣ
		}
	}
}