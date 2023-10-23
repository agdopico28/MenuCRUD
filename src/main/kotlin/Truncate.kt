import java.sql.DriverManager

fun Truncate(){
    val url = "jdbc:sqlite:ruta_del_fitxer_sqlite"

    val	con = DriverManager.getConnection(url)
    val st = con.createStatement()

    st.executeUpdate("TRUNCATE TABLE USUARIOS")

    st.close()
    con.close()
}