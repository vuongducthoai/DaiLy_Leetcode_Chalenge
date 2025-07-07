package _SourceCode;

//Khai báo thư viện
import java.sql.*;

//Khai báo chương trình
public class QueryPatient {
    private static String driverName = "org.apache.hive.jdbc.HiveDriver";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        //Thay doi URL ket noi Hive phu hop voi cau hinh cua ban
        String jdbcURL = "jdbc:hive2://localhost:10000/mydb";
        try (Connection conn = DriverManager.getConnection(jdbcURL, "root", "root")) {
            Statement stmt = conn.createStatement();
            /*
                Thi thi truy van: Liệt kê thông tin bệnh nhân có số lượng chẩn đoán nhiều nhất
            */
            System.out.println("Truy vấn: Liệt kê thông tin bệnh nhân có số lượng chẩn đoán nhiều nhất");
            String sql = "SELECT p.FullName, COUNT(d.DiagnosisID) as DiagnosisCount "
                    + "FROM Patient p "
                    + "JOIN MedicalRecords mr ON p.PatientID = mr.PatientID "
                    + "JOIN Diagnoses d ON mr.RecordID = d.RecordID "
                    + "GROUP BY p.PatientID, p.FullName "
                    + "ORDER BY DiagnosisCount DESC "
                    + "LIMIT 1";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                System.out.println(rs.getString("FullName")
                        + "\t" + rs.getInt("DiagnosisCount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
