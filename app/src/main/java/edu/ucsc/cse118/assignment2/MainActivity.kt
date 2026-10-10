package edu.ucsc.cse118.assignment2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import edu.ucsc.cse118.assignment2.model.Workspace
import kotlinx.serialization.json.Json
import androidx.activity.viewModels
import edu.ucsc.cse118.assignment2.viewmodel.WorkspaceViewModel


class MainActivity : AppCompatActivity() {
  private val workspaceViewModel: WorkspaceViewModel by viewModels()
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()

    // converting JSON files
    // load JSON file
    try {
      val jsonText = resources.openRawResource(R.raw.workspaces)
        .bufferedReader()
        .use { it.readText() }

      // convert JSON to kotlin objects
      val workspaces = Json.decodeFromString<List<Workspace>>(jsonText)
      workspaceViewModel.setWorkspaces(workspaces)

      // confirming if data is stored
      Log.d("Assignment 2", "ViewModel contains ${workspaceViewModel.workspaces.size} workspaces")

      // display result in Logcat
      Log.d("Assignment 2", "Loaded ${workspaces.size} workspaces")

      for (workspace in workspaces) {
        Log.d("Assignment 2", "${workspace.channels.size} channels")
      }

    } catch (e: Exception) {
      Log.e("Assignment 2", "Failed to parse JSON", e)
    }
    setContentView(R.layout.activity_main)
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
      val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
      insets
    }
  }
}