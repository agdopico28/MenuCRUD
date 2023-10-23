import java.sql.DriverManager

fun Create(){
    val url = "jdbc:sqlite:ruta_del_fitxer_sqlite"

    val	con = DriverManager.getConnection(url)

    val st = con.createStatement ()

    val sentSQL = "CREATE TABLE if  not exists USUARIO(" +
            "id INTEGER CONSTRAINT cp_id PRIMARY KEY, " +
            "nombre varchar(15), " +
            "user varchar(10), " +
            "password integer, " +
            "tlf integer ," +
            "email varchar(30)" +
            ")"

    st.executeUpdate(sentSQL)
    st.close();
    con.close()
}
