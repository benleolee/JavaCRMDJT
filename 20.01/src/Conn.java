import java.sql.*;

public class Conn { // ������Conn
	Connection con; // ����Connection����
	
	public Connection getConnection() {// ��������ֵΪConnection�ķ���
		
		
		try {// �������ݿ�������
			Class.forName("com.mysql.jdbc.Driver");
//			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			System.out.println("���ݿ��������سɹ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {// ͨ���������ݿ��URL��ȡ���ݿ����Ӷ���
//			String url = "jdbc:mysql://127.0.0.1:3306/framework?characterEncoding=utf8&useSSL=false";
//			con = 	DriverManager.getConnection(url);
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=qwerty");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?useSSL=false","root","qwerty");

//			con = DriverManager.getConnection("jdbc:jtds:sqlserver"
//					+ "://localhost:1433/db_jdbc", "sa", "");
			System.out.println("���ݿ����ӳɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con; // ������Ҫ�󷵻�һ��Connection����
	}
	
	public static void main(String[] args) { // ������
		Conn c = new Conn(); // �����������
		c.getConnection(); // �����������ݿⷽ��
	}
}