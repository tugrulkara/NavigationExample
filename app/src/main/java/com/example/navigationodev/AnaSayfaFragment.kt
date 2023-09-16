package com.example.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {

    private lateinit var binding : FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnaSayfaBinding.inflate(inflater,container,false)




        binding.sayfaAButton.setOnClickListener {
            val gecis = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToSayfaAFragment()
            Navigation.findNavController(it).navigate(gecis)
        }

        binding.sayfaXButton.setOnClickListener {
            val gecis = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToSayfaXFragment()
            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }

}