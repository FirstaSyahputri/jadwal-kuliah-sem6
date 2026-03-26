package com.firstakhory.campusinfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.firstakhory.campusinfo.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    // Deklarasi backing property _binding
    private var _binding: FragmentProfileBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvProfileName.text = "Firsta Khory Syahputri"
        binding.tvProfileNIM.text = "105223026"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Set null untuk mencegah memory leak
        _binding = null
    }
}