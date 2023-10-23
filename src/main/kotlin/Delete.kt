import java.sql.DriverManager

fun Delete(){
    val url = "jdbc:sqlite:ruta_del_fitxer_sqlite"

    val	con = DriverManager.getConnection(url)
    val st = con.createStatement()

    st.executeUpdate("DELETE FROM USUARIO WHERE password = 1234")

    st.close()
    con.close()
}