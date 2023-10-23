import java.sql.DriverManager

fun Update(){
    val url = "jdbc:sqlite:ruta_del_fitxer_sqlite"

    val	con = DriverManager.getConnection(url)
    val st = con.createStatement()

    st.executeUpdate("UPDATE USUARIO SET password = 1234 where id = 2")

    st.close()
    con.close()
}