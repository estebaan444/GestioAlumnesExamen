package com.estebi.examenandroid

import AlumneProvider
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.estebi.examenandroid.adapters.Alumne
import com.estebi.examenandroid.adapters.AlumneAdapter
import com.estebi.examenandroid.databinding.FragmentLlistaBinding


class LlistaFragment : Fragment() {

    private lateinit var binding: FragmentLlistaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLlistaBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(this.context)
        val root: View = binding.root

       binding.recyclerView.adapter =
            AlumneAdapter(AlumneProvider.alumneList) {alumne ->
                onItemSelected(
                    alumne
                )
            }
        return root
    }

    fun onItemSelected(alumne: Alumne){
        val builder = AlertDialog.Builder(requireContext())
        with(builder)
        {
            setTitle("Admin: Esteban")
            builder.setMessage("Nom Alumne: "+alumne.nom+ "\nEdat: " + alumne.edad + "\nInforme: "+ alumne.informe)
                .setPositiveButton("OK",
                    DialogInterface.OnClickListener() { dialog, id ->
                        val intent = Intent(requireContext(), CreateUser::class.java)
                        startActivity(intent)
                    }
                )
            show()
        }

    }
}