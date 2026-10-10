package edu.ucsc.cse118.assignment2.viewmodel

import androidx.lifecycle.ViewModel
import edu.ucsc.cse118.assignment2.model.Workspace

class WorkspaceViewModel : ViewModel() {
    var workspaces: List<Workspace> = emptyList()
        private set

    fun setWorkspaces(data: List<Workspace>) {
        workspaces = data
    }
}