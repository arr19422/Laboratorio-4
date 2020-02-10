package com.example.laboratorio4


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.laboratorio4.databinding.FragmentPrincipalBinding

/**
 * A simple [Fragment] subclass.
 */
class Principal : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? ): View? {
        // Inflate the layout for this fragment
        var show = true
        val binding: FragmentPrincipalBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_principal, container, false
        )
        binding.button.setOnClickListener(){
            val bundle = Bundle()
            bundle.putString("message", R.string.tikal.toString())
            //set Fragmentclass Arguments
            val fragobj = Detalles()
            fragobj.setArguments(bundle)
        }
        binding.button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_principal2_to_detalles))
        binding.button2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_principal2_to_acercaDe))
        binding.button3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_principal2_to_detalles))

        binding.floatingActionButton.setOnClickListener(){
            if (show){
                binding.textView.text = binding.editText.text
                binding.textView.visibility = View.VISIBLE
                binding.textView2.visibility = View.GONE
                binding.editText.visibility = View.GONE
                show = false
            } else {
                binding.textView.visibility = View.GONE
                binding.textView2.visibility = View.VISIBLE
                binding.editText.visibility = View.VISIBLE
                show = true
            }

        }
        return binding.root
    }


}
