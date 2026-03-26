package com.firstakhory.campusinfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.firstakhory.campusinfo.databinding.FragmentAnnouncementDetailBinding

class AnnouncementDetailFragment : Fragment() {

    private var _binding: FragmentAnnouncementDetailBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnnouncementDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val announcementId = arguments?.getInt("announcementId") ?: -1

        viewModel = ViewModelProvider(requireActivity())[HomeViewModel::class.java]

        viewModel.announcements.observe(viewLifecycleOwner) { list ->
            val data = list.find { it.id == announcementId }
            data?.let {
                binding.tvDetailTitle.text = it.title
                binding.tvDetailDate.text = it.date
                binding.tvDetailDescription.text = it.description // Di sini teks panjangnya muncul
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}