package by.ssrlab.drukvkl.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.ssrlab.drukvkl.databinding.FragmentMapBinding
import by.ssrlab.drukvkl.fragments.base.BaseFragment

class MapFragment: BaseFragment() {

    private lateinit var binding: FragmentMapBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMapBinding.inflate(layoutInflater)

        binding.apply {
            mapLocationHolder.isEnabled = false
            mapLocationIc.isEnabled = false
        }

        return binding.root
    }
}