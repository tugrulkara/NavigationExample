package com.example.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.databinding.FragmentSayfaBBinding
import com.example.navigationodev.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {


    private lateinit var binding : FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater,container,false)

        binding.buttonAnasayfadon.setOnClickListener {
            val gecis = SayfaYFragmentDirections.actionSayfaYFragmentToAnaSayfaFragment()
            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }
}