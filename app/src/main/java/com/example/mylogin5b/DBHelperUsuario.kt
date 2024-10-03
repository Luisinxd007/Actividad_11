import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelperUsuario(context: Context) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    companion object {
        const val DB_NAME = "alumnos.db"
        const val DB_VERSION = 1
        const val TABLE_NAME = "usuarios"
        const val COL_ID = "id"
        const val COL_NOMBRE = "nombre"
        const val COL_EMAIL = "email"
        const val COL_CONTRASEÑA = "contraseña"
    }

    private val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($COL_ID INTEGER PRIMARY KEY AUTOINCREMENT, $COL_NOMBRE TEXT, $COL_EMAIL TEXT, $COL_CONTRASEÑA TEXT)"

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }
}
