import java.sql.DriverManager

fun Select(){
    val url = "jdbc:sqlite:ruta_del_fitxer_sqlite"

    val	con = DriverManager.getConnection(url)
    val st = con.createStatement()
    val rs = st.executeQuery("SELECT * FROM USUARIO")
    while (rs.next()) {
        print("" + rs.getString(2) + "\t")
        print("${rs.getInt(1)}\t")
        print(rs.getString(3)+ "\t")
        print("${rs.getInt(4)}\t")
        print("${rs.getInt(5)}\t")
        print(rs.getString(6)+ "\t")

    }
    st.close()
    con.close()
}