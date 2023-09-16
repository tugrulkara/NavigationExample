package com.example.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.databinding.FragmentAnaSayfaBinding
import com.example.navigationodev.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {

    private lateinit var binding : FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaABinding.inflate(inflater,container,false)


        binding.bGitButton.setOnClickListener {
            val gecis = SayfaAFragmentDirections.actionSayfaAFragmentToSayfaBFragment()
            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }

}