package com.example.laboratorio4


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.laboratorio4.databinding.FragmentComentarioBinding

/**
 * A simple [Fragment] subclass.
 */
class Comentario : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentComentarioBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_comentario, container, false
        )
        binding.compartir.setOnClickListener(){
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, binding.comentario)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
        return inflater.inflate(R.layout.fragment_comentario, container, false)
    }


}
