package com.example.laboratorio4


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.laboratorio4.databinding.FragmentDetallesBinding
/**
 * A simple [Fragment] subclass.
 */
class Detalles : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val strtext = arguments?.getString("message")
        val binding: FragmentDetallesBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_detalles, container, false
        )
        binding.textView4.setText(R.string.tikal_info)
        binding.textView3.setText(R.string.tikal)
        binding.button4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_detalles_to_comentario))
        return binding.root
    }


}
