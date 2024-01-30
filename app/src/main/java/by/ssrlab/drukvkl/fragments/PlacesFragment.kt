package by.ssrlab.drukvkl.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.ssrlab.drukvkl.databinding.FragmentPlacesListBinding
import by.ssrlab.drukvkl.db.Place
import by.ssrlab.drukvkl.fragments.base.BaseFragment
import by.ssrlab.drukvkl.helpers.CITY_TITLE
import by.ssrlab.drukvkl.rv.PlacesListAdapter

class PlacesFragment: BaseFragment() {

    private lateinit var binding: FragmentPlacesListBinding

    private lateinit var placesAdapter: PlacesListAdapter
    private lateinit var title: String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPlacesListBinding.inflate(layoutInflater)

        getBundle()

        return binding.root
    }

    override fun onStart() {
        super.onStart()

        initAdapter()
        mainActivity.showBack(findNavController())
    }

    private fun initAdapter() {
        val list = arrayListOf(Place(1, "Place 1"), Place(2, "Place 2"))

        placesAdapter = PlacesListAdapter(list, title)

        binding.placesRv.apply {
            layoutManager = LinearLayoutManager(mainActivity)
            adapter = placesAdapter
        }
    }

    private fun getBundle() {
        val bundle = arguments

        title = bundle?.getString(CITY_TITLE) ?: ""
    }
}