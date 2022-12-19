
import androidx.lifecycle.ViewModel
import com.estebi.examenandroid.Alumne

class AlumneProvider : ViewModel() {
    companion object{
        val alumneList = mutableListOf<Alumne>(
            Alumne(
                "Marc",
                "21",
                "Bon alumne"
            ),
            Alumne(
                "Eric",
                "22",
                "Mal alumne"
            ),
            Alumne(
                "Enric",
                "24",
                "Bon alumne"
            ),
            Alumne(
                "Kike",
                "20",
                "Mal alumne"
            ),
        )
    }
}