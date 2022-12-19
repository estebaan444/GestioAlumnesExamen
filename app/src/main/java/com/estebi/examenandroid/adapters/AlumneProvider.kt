
import androidx.lifecycle.ViewModel
import com.estebi.examenandroid.adapters.Alumne

class AlumneProvider : ViewModel() {
    companion object{
        val alumneList = mutableListOf<Alumne>(
            Alumne(
                "Marc",
                "21",
                "Bon alumne"
            ),
            Alumne(
                "Alex",
                "22",
                "Mal alumne"
            ),
            Alumne(
                "Joan",
                "24",
                "Bon alumne"
            ),
            Alumne(
                "Dídac",
                "20",
                "Mal alumne"
            ),
        )
    }
}