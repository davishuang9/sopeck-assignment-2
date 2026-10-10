package edu.ucsc.cse118.assignment2.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import edu.ucsc.cse118.assignment2.R

class LoginFragment : Fragment(R.layout.fragment_login) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val loginButton = view.findViewById<View>(R.id.loginButton)

        loginButton.setOnClickListener {
            findNavController().navigate(
                R.id.action_loginFragment_to_workspaceFragment
            )
        }
    }


}