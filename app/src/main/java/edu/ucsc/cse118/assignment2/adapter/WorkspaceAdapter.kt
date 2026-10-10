package edu.ucsc.cse118.assignment2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.ucsc.cse118.assignment2.R
import edu.ucsc.cse118.assignment2.model.Workspace

class WorkspaceAdapter (
    private val workspaces: List<Workspace>
) : RecyclerView.Adapter<WorkspaceAdapter.WorkspaceViewHolder>() {

    class WorkspaceViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val workspaceName: TextView = view.findViewById(R.id.workspaceName)
        val channelCount: TextView = view.findViewById(R.id.channelCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkspaceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_workspace, parent, false)

        return WorkspaceViewHolder(view)
    }
    override fun onBindViewHolder(holder: WorkspaceViewHolder, position: Int) {
        val workspace = workspaces[position]

        holder.workspaceName.text = workspace.name
        holder.channelCount.text = "${workspace.channels.size} channels"
    }

    override fun getItemCount(): Int {
        return workspaces.size
    }
}