package edu.ucsc.cse118.assignment2.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.ucsc.cse118.assignment2.R
import edu.ucsc.cse118.assignment2.adapter.WorkspaceAdapter
import edu.ucsc.cse118.assignment2.viewmodel.WorkspaceViewModel
import android.util.Log

class WorkspaceFragment : Fragment(R.layout.fragment_workspace) {

    private val workspaceViewModel: WorkspaceViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Assignment 2", "WorkspaceFragment created")
        Log.d("Assignment 2", "Fragment sees ${workspaceViewModel.workspaces.size} workspaces")

        val recyclerView = view.findViewById<RecyclerView>(R.id.workspaceRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        recyclerView.adapter = WorkspaceAdapter(workspaceViewModel.workspaces)
    }
}