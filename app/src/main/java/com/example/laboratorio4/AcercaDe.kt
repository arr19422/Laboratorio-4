package com.example.laboratorio4


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.laboratorio4.databinding.FragmentAcercaDeBinding
/**
 * A simple [Fragment] subclass.
 */
class AcercaDe : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentAcercaDeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_acerca_de, container, false
        )
        return binding.root
    }


}
