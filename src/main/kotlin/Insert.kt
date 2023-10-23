import java.sql.DriverManager

fun Insert(){
    val url = "jdbc:sqlite:ruta_del_fitxer_sqlite"

    val	con = DriverManager.getConnection(url)

    val st = con.createStatement ()

    st.executeUpdate("INSERT INTO USUARIO VALUES (3, 'Asier', 'asi', 345, 698659934, 'asi@gmail.com')")

    st.executeUpdate("INSERT INTO USUARIO VALUES (2,'Borja','bor',28,604684064, 'bor@gmail.com')")


    st.close()
    con.close()
}