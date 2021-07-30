package com.ececeli.simplynote.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ececeli.simplynote.R
import com.ececeli.simplynote.adapter.NoteAdapter
import com.ececeli.simplynote.data.note.Note
import com.ececeli.simplynote.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding

    //Adapter
    private val noteAdapter by lazy { NoteAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.viewModel = viewModel

        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.noteRecyclerView.adapter = noteAdapter

        setNoteAdapter()
    }

    private fun setNoteAdapter() {
        val noteList = listOf(
            Note(
                id = 1,
                details = "Note detail",
                title = "Note title"
            ),
            Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            ), Note(
                id = 2,
                details = "Second Note Details",
                title = "Second Note Title"
            )
        )

        noteAdapter.submitList(noteList)
    }
}