package com.example.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.databinding.FragmentSayfaABinding
import com.example.navigationodev.databinding.FragmentSayfaBBinding
import com.example.navigationodev.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {


    private lateinit var binding : FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaXBinding.inflate(inflater,container,false)

        binding.buttonYGit.setOnClickListener {
            val gecis = SayfaXFragmentDirections.actionSayfaXFragmentToSayfaYFragment()
            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }

}